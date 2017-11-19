/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap10;
import javax.swing.*;
import java.awt.*;

public class TextFieldEx extends JFrame {
    TextFieldEx() {
        setTitle("텍스트필드 만들기  예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(new JLabel("이름  "));
        c.add(new JTextField(20)); // 창의 열 개수 20
        c.add(new JLabel("학과  "));
        c.add(new JTextField("컴퓨터공학과", 20)); // 창의 열 개수 20
        c.add(new JLabel("주소  "));
        c.add(new JTextField("서울시 ...", 20)); // 창의 열 개수 20

        setSize(300,150);
        setVisible(true);
    }

    public static void main(String [] args) {
        new TextFieldEx();
    }
}