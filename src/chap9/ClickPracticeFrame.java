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
//문제 5번
public class ClickPracticeFrame extends JFrame {
    public ClickPracticeFrame() {
        super("클릭 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);

        JLabel label = new JLabel("C");
        label.setLocation(50,50);
        label.setSize(20, 20);
        label.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                JLabel la = (JLabel)e.getSource();
                Container c = la.getParent();
                int xBound = c.getWidth() - la.getWidth(); // 레이블의 폭 만큼 감소
                int yBound = c.getHeight() - la.getHeight(); // 레이블의 높이 만큼 감소
                int x = (int)(Math.random()*xBound);
                int y = (int)(Math.random()*yBound);
                la.setLocation(x, y);
            }
        });
        c.add(label);
        setSize(250,150);
        setVisible(true);
    }
    static public void main(String [] args) {
        new ClickPracticeFrame();
    }
}
//글자를 클릭시에 글자가 랜덤한 위치로 이동함