package com.zsh;

import java.awt.*;

/**
 * 初始化窗口
 */
public class FrameInitializer {
    public void initialFrame(Frame frame){
        // 我的整个屏幕分辨率是1920*1080（1920像素点*1080像素点）
        frame.setSize(500,300);// 500像素点*300像素点
        frame.setBackground(Color.WHITE);
        frame.setCursor(Cursor.HAND_CURSOR);

        Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
        int x= (int) (screenSize.getWidth()/2-frame.getWidth()/2);
        int y= (int) (screenSize.getHeight()/2-frame.getHeight()/2);
        //Caution: 相对于整个屏幕左上角的坐标（左上角是xy平面坐标原点，x轴向右，y轴向下）
        frame.setLocation(x,y);

        frame.setAlwaysOnTop(true);
        frame.setVisible(true);
    }
}
