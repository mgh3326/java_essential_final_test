/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//문제 3번
public class MouseDraggingFrame extends JFrame {
    public MouseDraggingFrame() {
        super("드래깅동안 YELLOW로 변경");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setBackground(Color.GREEN);

        MyMouseListener ml = new MyMouseListener();
        c.addMouseMotionListener(ml);
        c.addMouseListener(ml);
        setSize(250,150);
        setVisible(true);
    }

    class MyMouseListener extends MouseAdapter implements MouseMotionListener {
        public void mouseDragged(MouseEvent e) {
            Container c = (Container)e.getSource();
            c.setBackground(Color.YELLOW);
        }

        public void mouseMoved(MouseEvent e) {}

        public void mouseReleased(MouseEvent e) {
            Container c = (Container)e.getSource();
            c.setBackground(Color.GREEN);
        }
    }
    static public void main(String [] args) {
        new MouseDraggingFrame();
    }
}
//드래그 하는동안 색깔이 변경됨