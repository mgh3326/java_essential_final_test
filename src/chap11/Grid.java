/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap11;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Grid extends JFrame {
    public Grid() {
        super("격자 그리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanel());
        setSize(150,160);
        setVisible(true);
    }
    class MyPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            int dw = getWidth()/10;
            for(int i=1; i<=9; i++)
                g.drawLine(i*dw,  0, i*dw, getHeight()); // 수직선
            int dh = getHeight()/10;
            for(int i=1; i<=9; i++)
                g.drawLine(0, i*dh, getWidth(), i*dh); //  수평선
        }
    }
    public static void main(String[] args) {
        new Grid();
    }
}
//실습문제 11-1-4