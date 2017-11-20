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

public class GraphicsDrawPolygonEx extends JFrame {
    GraphicsDrawPolygonEx() {
        setTitle("drawPolygon 사용  예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanel());

        setSize(200, 300);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.RED);
            int [] x = {80, 40, 80, 120};
            int [] y = {40, 120, 200, 120};
            g.drawPolygon(x, y, 4);
        }
    }

    public static void main(String [] args) {
        new GraphicsDrawPolygonEx();
    }
}
//그림 11-3-1