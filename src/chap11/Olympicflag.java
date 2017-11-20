/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap11;

import java.awt.*;
import javax.swing.*;

public class Olympicflag extends JFrame {
    Olympicflag() {
        super("오륜기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanel());
        setSize(210,150);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLUE);
            g.drawOval(10, 10, 50, 50);
            g.setColor(Color.BLACK);
            g.drawOval(70, 10, 50, 50);
            g.setColor(Color.RED);
            g.drawOval(130, 10, 50, 50);
            g.setColor(Color.YELLOW);
            g.drawOval(40, 30, 50, 50);
            g.setColor(Color.GREEN);
            g.drawOval(100, 30, 50, 50);
        }
    }

    public static void main(String[] args) {
        new Olympicflag();
    }
}
//실습문제 11-1-2