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

public class KeyCharEx extends JFrame {
    JLabel la = new JLabel("<Enter>키로 배경색이 바뀝니다");
    KeyCharEx() {
        super("KeyListener의 문자 키 입력 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane(); // 컨텐트 팬 알아내기
        c.setLayout(new FlowLayout());
        c.add(la);
        c.addKeyListener(new MyKeyListener()); // 키 리스너 달기
        setSize(250, 150);
        setVisible(true);

        c.requestFocus(); // 컨텐트 팬에 포커스 설정. 키 입력 가능해짐 //<< 이문자이 없다면 컨텐트펜은 키 입력을 받을 수 없다. 또한 이 문장은 setVisiable(ture);실행 후에 실행 되어야 한다. setVisiable(ture)는 프레임을 출력하고 임의의 컴포너틑에게 포커스를 주기 때문이다.
    }

    class MyKeyListener extends KeyAdapter { // 키 리스너
        public void keyPressed(KeyEvent e) { // << 문자 키만 입력 받기 때문에 keyTyped()로 해도됨
            // 임의의 색을 만들기 위해 랜덤하게 r, g, b 성분 생성
            int r = (int) (Math.random() * 256); // 0~255 사이의 임의의 red 성분
            int g = (int) (Math.random() * 256); // 0~255 사이의 임의의 green 성분
            int b = (int) (Math.random() * 256); // 0~255 사이의 임의의 blue 성분

            switch (e.getKeyChar()) { // 입력된 키 문자
                case '\n': // <Enter> 키 입력
                    la.setText("r=" + r + ", g=" + g + ", b=" + b);
                    getContentPane().setBackground(new Color(r, g, b)); // 컨텐트팬의 배경색 설정
                    break;
                case 'q': System.exit(0); // 프로그램 종료
            }
        }
    }
    public static void main(String[] args) {
        new KeyCharEx();
    }
}
//Enter키를 입력 받으면 배경색이 바뀝니다. 또한 q키를 누르면 프로그램이 종료됩니다.