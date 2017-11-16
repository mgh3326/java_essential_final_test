/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap8;
import javax.swing.*;
import java.awt.*;

public class FrameSample extends JFrame{
    FrameSample() {
        setTitle("프레임 구성");

        // 메뉴 생성
        JMenuBar mb = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu sourceMenu = new JMenu("Source");
        JMenu searchMenu = new JMenu("Search");
        JMenu windowMenu = new JMenu("Window");
        mb.add(fileMenu);
        mb.add(editMenu);
        mb.add(sourceMenu);
        mb.add(searchMenu);
        mb.add(windowMenu);
        setJMenuBar(mb);

        // contentPane 알아내기
        Container contentPane = getContentPane();

        contentPane.setLayout(new FlowLayout());
        contentPane.setBackground(new Color(186, 143, 45));
        contentPane.add(new JButton("add"));
        contentPane.add(new JButton("sub"));
        contentPane.add(new JButton("mul"));
        contentPane.add(new JButton("div"));

        setSize(300,200);
        setVisible(true);

    }

    public static void main(String[] args) {
        new FrameSample();

    }
}
