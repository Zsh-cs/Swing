package zsh.awt.listener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * 鼠标监听器
 */
public class MouseListenerImpl implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {

        int button=e.getButton();
        switch (button){
            case MouseEvent.BUTTON1:
                System.out.println("您点击的是鼠标左键");
                break;
            case MouseEvent.BUTTON2:
                System.out.println("您点击的是鼠标中键");
                break;
            case MouseEvent.BUTTON3:
                System.out.println("您点击的是鼠标右键");
                break;
            default:break;
        }

        System.out.println("您的鼠标点击处相对于窗口左上角的坐标为：("+e.getX()+","+e.getY()+")\n");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
