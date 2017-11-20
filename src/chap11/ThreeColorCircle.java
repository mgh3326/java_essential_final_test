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

public class ThreeColorCircle extends JFrame {
    public ThreeColorCircle() {
        super("삼색원");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanel());
        setSize(120,150);
        setVisible(true);
    }
    class MyPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.RED);
            g.fillArc(10, 10, 100, 100, 90, 120);
            g.setColor(Color.BLUE);
            g.fillArc(10, 10, 100, 100, 210, 120);
            g.setColor(Color.YELLOW);
            g.fillArc(10, 10, 100, 100, 330, 120);
        }
    }
    public static void main(String[] args) {
        new ThreeColorCircle();
    }
}
//실습문제 11-1-1