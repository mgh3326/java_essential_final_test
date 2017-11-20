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

public class rhombus extends JFrame {
    rhombus() {
        super("마름모");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanel());
        setSize(150,160);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        int x [] = new int [4];
        int y [] = new int [4];
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLUE);
            x[0] = getWidth()/2; y[0] = 0;
            x[1] = 0; y[1] = getHeight()/2;
            x[2] = getWidth()/2; y[2] = getHeight();
            x[3] = getWidth(); y[3] = getHeight()/2;

            g.drawPolygon(x,  y,  4);

        }
    }

    public static void main(String[] args) {
        new rhombus();
    }
}
//실습문제 11-1-3