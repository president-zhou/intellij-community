package com.intellij.openapi.fileChooser.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.fileChooser.FileSystemTree;
import com.intellij.openapi.fileChooser.ex.FileChooserDialogImpl;

public abstract class FileChooserAction extends AnAction {
  final public void actionPerformed(AnActionEvent e) {
    FileSystemTree tree = e.getData(FileChooserDialogImpl.FILE_SYSTEM_TREE);
    actionPerformed(tree, e);
  }

  final public void update(AnActionEvent e) {
    FileSystemTree tree = e.getData(FileChooserDialogImpl.FILE_SYSTEM_TREE);
    if (tree != null) {
      e.getPresentation().setEnabled(true);
      update(tree, e);
    }
    else {
      e.getPresentation().setEnabled(false);
    }
  }

  protected abstract void update(FileSystemTree fileChooser, AnActionEvent e);

  protected abstract void actionPerformed(FileSystemTree fileChooser, AnActionEvent e);
}