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

public class BorderLayoutEx extends JFrame {
    BorderLayoutEx() {
        setTitle("BorderLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane(); // 컨텐트팬 알아내기

        // 컨텐트팬에 BorderLayout 배치관리자 설정
        contentPane.setLayout(new BorderLayout(30, 20));

        contentPane.add(new JButton("Calculate"), BorderLayout.CENTER);
        contentPane.add(new JButton("add"), BorderLayout.NORTH);
        contentPane.add(new JButton("sub"), BorderLayout.SOUTH);
        contentPane.add(new JButton("mul"), BorderLayout.EAST);
        contentPane.add(new JButton("div"), BorderLayout.WEST);

        setSize(300, 200); // 프레임 크기 300x200 설정
        setVisible(true); // 프레임을 화면에 출력
    }
    public static void main(String[] args) {
        new BorderLayoutEx();
    }
}

