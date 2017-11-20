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

public class GraphicsDrawImageEx2 extends JFrame {
    GraphicsDrawImageEx2() {
        setTitle("패널의 크기에 맞추어 이미지 그리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanel());

        setSize(200, 300);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        ImageIcon icon = new ImageIcon("images/image0.jpg");// 이미지 로딩
        Image img = icon.getImage();// 이미지 객체

        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            // 이미지를 패널 크기로 조절하여 그린다
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);//패널의 폭과 높이
        }
    }

    public static void main(String [] args) {
        new GraphicsDrawImageEx2();
    }
}
//프레임의 크긱가 조절되면 자동을 ㅗ패널이 다시 그려지게 되어 패널의 크기에 맞추어 이미지를 다시 그립니다.