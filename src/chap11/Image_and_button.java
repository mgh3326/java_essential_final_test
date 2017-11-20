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

public class Image_and_button extends JFrame {
    public Image_and_button() {
        setTitle("이미지 그리기 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanel());
        Container contentPane = getContentPane(); // 컨텐트팬 알아내기
        //contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
        contentPane.setLayout(new FlowLayout());//Flowlayout 사용
        contentPane.add(new JButton("Hello"));
        setSize(300,300);
        setVisible(true);
    }
    class MyPanel extends JPanel {
        Image img = new ImageIcon("images/back.jpg").getImage();
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        }
    }
    public static void main(String[] args) {
        new Image_and_button();
    }
}
//실습문제 11-2