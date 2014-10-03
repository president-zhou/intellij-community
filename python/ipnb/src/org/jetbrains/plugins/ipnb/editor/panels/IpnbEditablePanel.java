package org.jetbrains.plugins.ipnb.editor.panels;

import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.ui.Gray;
import com.intellij.ui.JBColor;
import com.intellij.util.ui.UIUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.plugins.ipnb.format.cells.IpnbEditableCell;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public abstract class IpnbEditablePanel<T extends JComponent, K extends IpnbEditableCell> extends IpnbPanel<T, K> {
  private static final Logger LOG = Logger.getInstance(IpnbEditablePanel.class);
  private boolean myEditing;
  protected JTextArea myEditablePanel;
  public final static String EDITABLE_PANEL = "Editable panel";
  public final static String VIEW_PANEL = "View panel";

  public IpnbEditablePanel(@NotNull K cell) {
    super(cell);
  }


  protected void initPanel() {
    myViewPanel = createViewPanel();
    myViewPanel.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        final Container parent = getParent();
        final MouseEvent parentEvent = SwingUtilities.convertMouseEvent(myViewPanel, e, parent);
        parent.dispatchEvent(parentEvent);
        if (e.getClickCount() == 2) {
          switchToEditing();
        }
      }
    });
    myViewPanel.setName(VIEW_PANEL);
    add(myViewPanel, VIEW_PANEL);
    myEditablePanel = createEditablePanel();
    myEditablePanel.setName(EDITABLE_PANEL);
    add(myEditablePanel, EDITABLE_PANEL);
  }

  public void switchToEditing() {
    setEditing(true);

    final LayoutManager layout = getLayout();
    if (layout instanceof CardLayout) {
      ((CardLayout)layout).show(this, EDITABLE_PANEL);
      UIUtil.requestFocus(myEditablePanel);
    }
  }

  public boolean isModified() {
    final Component[] components = getComponents();
    for (Component component : components) {
      final String name = component.getName();
      if (component.isVisible() && EDITABLE_PANEL.equals(name)) return true;
    }
    return false;
  }

  protected String getRawCellText() { return ""; }

  public void runCell() {
    final LayoutManager layout = getLayout();
    if (layout instanceof CardLayout) {
      updateCellSource();
      updateCellView();
      ((CardLayout)layout).show(this, VIEW_PANEL);
      setEditing(false);
    }
  }

  private JTextArea createEditablePanel() {
    final JTextArea textArea = new JTextArea(getRawCellText());
    textArea.setLineWrap(true);
    textArea.setEditable(true);
    textArea.setBorder(BorderFactory.createLineBorder(JBColor.lightGray));
    textArea.setBackground(Gray._247);
    textArea.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 1) {
          setEditing(true);
          final Container parent = getParent();
          parent.repaint();
          if (parent instanceof IpnbFilePanel) {
            ((IpnbFilePanel)parent).setSelectedCell(IpnbEditablePanel.this);
            textArea.requestFocus();
          }
        }
      }
    });
    textArea.addKeyListener(new KeyAdapter() {
      @Override
      public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
          setEditing(false);
          final Container parent = getParent();
          if (parent instanceof IpnbFilePanel) {
            parent.repaint();
            UIUtil.requestFocus((IpnbFilePanel)parent);
          }
        }
      }
    });
    return textArea;
  }

  public boolean contains(int y) {
    return y>= getTop() && y<=getBottom();
  }

  public int getTop() {
    return getY();
  }

  public int getBottom() {
    return getTop() + getHeight();
  }

  public boolean isEditing() {
    return myEditing;
  }

  public void setEditing(boolean editing) {
    myEditing = editing;
  }

  public void updateCellView() { // TODO: make abstract
  }

  public void updateCellSource() {
    final String text = myEditablePanel.getText();
    myCell.setSource(StringUtil.splitByLinesKeepSeparators(text != null ? text : ""));
  }

  @SuppressWarnings("CloneDoesntDeclareCloneNotSupportedException")
  @Override
  protected Object clone() {
    try {
      return super.clone();
    }
    catch (CloneNotSupportedException e) {
      LOG.error(e);
    }
    return null;
  }

  public K getCell() {
    return myCell;
  }

}
