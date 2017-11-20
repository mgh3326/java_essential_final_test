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

public class TwoImageFrame_2 extends JFrame {
    public TwoImageFrame_2() {
        setTitle("두 이미지 밑으로 나란히 보이기");
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
            g.drawImage(imgA, 0, 0, getWidth(), getHeight()/2, this);
            g.drawImage(imgB, 0, getHeight()/2, getWidth(), getHeight()/2, this);
        }
    }
    public static void main(String[] args) {
        new TwoImageFrame_2();
    }
}
//실습문제 11-3-2