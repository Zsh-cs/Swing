package com.zsh.listener;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * 窗口监听器
 */
public class WindowListenerImpl implements WindowListener {

    @Override// 当窗口的可见性首次变为true时调用
    public void windowOpened(WindowEvent e) {

    }

    @Override// 点击窗口关闭按钮时调用
    public void windowClosing(WindowEvent e) {
        Window window=e.getWindow();
        window.dispose();
    }

    @Override// 窗口成功关闭后调用
    public void windowClosed(WindowEvent e) {

    }

    @Override// 窗口最小化到图标时调用
    public void windowIconified(WindowEvent e) {

    }

    @Override// 窗口从最小化图标变成普通状态时调用
    public void windowDeiconified(WindowEvent e) {

    }

    @Override// 窗口变成活跃状态时调用
    public void windowActivated(WindowEvent e) {

    }

    @Override// 窗口变成不活跃状态时调用
    public void windowDeactivated(WindowEvent e) {

    }
}
