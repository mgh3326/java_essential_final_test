/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap10;

import java.awt.*;
import javax.swing.*;

public class FourImageFrame extends JFrame {//1번 문제
    FourImageFrame() {
        super("4 Images");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new GridLayout(1,4,10,10));

        ImageIcon img [] = new ImageIcon [4];
        img[0] = new ImageIcon("images/img1.jpg");
        img[1] = new ImageIcon("images/img2.jpg");
        img[2] = new ImageIcon("images/img3.jpg");
        img[3] = new ImageIcon("images/img4.jpg");

        for(int i=0; i<img.length; i++)
            c.add(new JLabel(img[i]));

        setSize(500, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FourImageFrame();
    }

}
