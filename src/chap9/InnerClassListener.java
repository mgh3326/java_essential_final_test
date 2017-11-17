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

public class InnerClassListener extends JFrame {
    InnerClassListener() {
        setTitle("Action 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");
        btn.addActionListener(new MyActionListener()); // Action 이벤트 리스너 달기
        c.add(btn);

        setSize(200,120);
        setVisible(true);
    }

    // 내부 클래스로 Action 리스너를 작성한다.
    private class MyActionListener implements ActionListener {//MyActionListener를 private으로 선언하여 다른 클래스에서 사용할 수 없음
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton)e.getSource();
            if(b.getText().equals("Action"))
                b.setText("액션");
            else
                b.setText("Action");

            // InnerClassListener의 멤버나 JFrame의 멤버를 호출할 수 있음
            setTitle(b.getText()); // 프레임의 타이틀에 버튼 문자열을 출력한다.
        }
    }

    public static void main(String [] args) {
        new InnerClassListener();
    }
}
//버튼의 문자열을 타이틀에 출력