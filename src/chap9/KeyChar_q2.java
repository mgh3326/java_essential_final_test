/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
//q2
public class KeyChar_q2 extends JFrame {

    KeyChar_q2() {
        super("키 누르기 떼기 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane(); // 컨텐트 팬 알아내기
        //c.setLayout(new FlowLayout()); 글자 넣을때 쓰는건가 보다 일단 주석 처리함
        c.addKeyListener(new MyKeyListener()); // 키 리스너 달기
        //// c.setOpaque(true);//배경색을 불퉁=명하게 출력되도록 설정 //이건 어떻게? 힌트에 있는데 쓸지를 모르겠음
        c.setBackground(Color.RED);//배경색 변경
        setSize(300, 300);
        setVisible(true);
        c.requestFocus(); // 컨텐트 팬에 포커스 설정. 키 입력 가능해짐 //<< 이문자이 없다면 컨텐트펜은 키 입력을 받을 수 없다. 또한 이 문장은 setVisiable(ture);실행 후에 실행 되어야 한다. setVisiable(ture)는 프레임을 출력하고 임의의 컴포너틑에게 포커스를 주기 때문이다.
    }

    class MyKeyListener extends KeyAdapter { // 키 리스너


        public void keyPressed(KeyEvent e) { // << 문자 키만 입력 받기 때문에 keyTyped()로 해도됨
            if( e.getKeyCode() == KeyEvent.VK_R ) {
                getContentPane().setBackground( Color.RED );
            }
//            switch (e.getKeyChar()) { // 입력된 키 문자
//                case 'r': // <Enter> 키 입력
//                    getContentPane().setBackground(Color.CYAN); // 컨텐트팬의 배경색 설정
//                    break;
//                case 'q': System.exit(0); // 프로그램 종료
//            }
        }
        public void keyReleased(KeyEvent e){
            getContentPane().setBackground( Color.CYAN );

//            switch (e.getKeyChar()) { // 입력된 키 문자
//                case 'r': // <Enter> 키 입력
//                    getContentPane().setBackground(Color.RED); // 컨텐트팬의 배경색 설정
//                    break;
//                case 'q': System.exit(0); // 프로그램 종료
//            }
        }
    }
    public static void main(String[] args) {
        new KeyChar_q2();
    }
}
//r 키를 입력 받을때만 배경색이 바뀝니다.