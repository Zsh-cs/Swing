package zsh.awt.listener;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * 键盘监听器
 */
public class KeyListenerImpl implements KeyListener {

    @Override// 按下+松开key
    public void keyTyped(KeyEvent e) {
        System.out.println(e.getKeyChar());
    }

    @Override// 按下key
    public void keyPressed(KeyEvent e) {

    }

    @Override// 松开key
    public void keyReleased(KeyEvent e) {

    }
}
