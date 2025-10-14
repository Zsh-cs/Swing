package com.zsh;

import com.zsh.listener.KeyListenerImpl;
import com.zsh.listener.MouseListenerImpl;
import com.zsh.listener.WindowListenerImpl;

import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.WindowListener;

/**
 * 窗口启动入口
 */
public class Main {
    private Frame frame;

    public Frame getFrame(){
        return frame;
    }
    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    // 构造函数，负责创建和初始化Frame
    public Main() {
        frame=new Frame("Red Dead Redemption");
        FrameInitializer initializer=new FrameInitializer();

        //Caution: 注意满足多态原则
        WindowListener windowListener=new WindowListenerImpl();
        KeyListener keyListener=new KeyListenerImpl();
        MouseListener mouseListener=new MouseListenerImpl();

        initializer.initialFrame(frame);
        frame.addWindowListener(windowListener);
        frame.addKeyListener(keyListener);
        frame.addMouseListener(mouseListener);

    }

    //Caution: static方法属于类本身，它不能直接访问非static的成员变量
    public static void main(String[] args) {
        new Main();// Java自启动设计模式
    }
}
