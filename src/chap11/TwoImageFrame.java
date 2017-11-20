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

public class TwoImageFrame extends JFrame {
    public TwoImageFrame() {
        setTitle("두 이미지 나란히 보이기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanel());
        setSize(300,300);
        setVisible(true);
    }
    class MyPanel extends JPanel {
        Image imgA = new ImageIcon("images/a.jpg").getImage();
        Image imgB = new ImageIcon("images/b.jpg").getImage();

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(imgA, 0, 0, getWidth()/2, getHeight(), this);
            g.drawImage(imgB, getWidth()/2, 0, getWidth()/2, getHeight(), this);
        }
    }
    public static void main(String[] args) {
        new TwoImageFrame();
    }
}
//실습문제 11-3-1