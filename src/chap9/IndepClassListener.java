/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap9;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IndepClassListener extends JFrame {
    IndepClassListener() {
        setTitle("Action 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");
        btn.addActionListener(new MyActionListener()); // Action 이벤트 리스너 달기
        c.add(btn);

        setSize(250,120);
        setVisible(true);
    }
    public static void main(String [] args) {
        new IndepClassListener();
    }
}

// 독립된 클래스로 이벤트 리스너를 작성한다.
class MyActionListener implements ActionListener {//MyActionListener.java 파일로 따로 작성해도 됨
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton)e.getSource(); // 이벤트 소스 버튼 알아내기
        if(e.getActionCommand().equals("Action")) // if(b.getText().equals("Action")) 와 동일
            b.setText("액션"); // 버튼의 문자열을 "액션"으로 변경
        else
            b.setText("Action"); // 버튼의 문자열을 "Action"으로 변경
    }
}
//버튼 클릭시에 Action 이 액션으로 변한다.