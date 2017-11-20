/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap11;
import javax.swing.*;
import java.awt.*;

public class GraphicsDrawRoundRectEx extends JFrame {
    Container contentPane;
    GraphicsDrawRoundRectEx() {
        setTitle("drawRoundRect 사용  예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanel());

        setSize(200, 150);
        setVisible(true);
    }

    class MyPanel extends JPanel {//그림 11-2-3
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.RED);
            g.drawRoundRect(20, 20, 120, 80, 40, 60);
        }
    }

    public static void main(String [] args) {
        new GraphicsDrawRoundRectEx();
    }
}
//그림 11-2-3