/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap8;

import java.awt.*;
import javax.swing.*;

public class FlowLayoutPractice extends JFrame {
    public FlowLayoutPractice() {
        super("FlowLayout Practice");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        contentPane.setLayout(new FlowLayout());
        contentPane.add(new JLabel("100"));
        contentPane.add(new JLabel("+"));
        contentPane.add(new JLabel("200"));
        contentPane.add(new JButton("="));
        contentPane.add(new JLabel("300"));

        setSize(400,100);
        setVisible(true);
    }
    public static void main(String[] args) {
        new FlowLayoutPractice();
    }
}
