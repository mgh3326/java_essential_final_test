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
//연습문제 1번
public class MouseEventFrame extends JFrame {
    public MouseEventFrame() {
        super("마우스 올리기 내리기 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel label = new JLabel("자기야");
        label.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                JLabel la = (JLabel)e.getSource();
                la.setText("사랑해");
            }
            public void mouseExited(MouseEvent e) {
                JLabel la = (JLabel)e.getSource();
                la.setText("자기야");
            }
        });
        c.add(label);
        setSize(250,150);
        setVisible(true);
    }

    static public void main(String [] args) {
        new MouseEventFrame();
    }
}
//레이블에 마우스를 올린 경우 자기야가 사랑해로 바뀜