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
// F1키를 누르면 프레임 크기를 가로 세로 10픽셀씩 늘이고, F2 키를 누르면 가로 세로 10픽셀씩 줄이고, 'q' 키를 누르면 종료하도록 프로그램을 작성하라. 실행 화면은 다음과 같다. 키 입력을 받기 위해 컨텐트팬에 포커스를 주어야한다.
public class KeyChar_q6 extends JFrame {//이거 아직 동작 안함 고쳐야됨
    String text = "A";
    JButton btn = new JButton(text);
    Container c = getContentPane(); // 컨텐트 팬 알아내기

    KeyChar_q6() {
        super("키로 프레임 크기 조절하기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setLayout(new FlowLayout());// 글자 넣을때 쓰는건가 보다 일단 주석 처리함

        c.add(btn);//
        setSize(300, 200);
        c.addKeyListener(new MyKeyListener()); // 키 리스너 달기

        setVisible(true);
        c.requestFocus(); // 컨텐트 팬에 포커스 설정. 키 입력 가능해짐 //<< 이문자이 없다면 컨텐트펜은 키 입력을 받을 수 없다. 또한 이 문장은 setVisiable(ture);실행 후에 실행 되어야 한다. setVisiable(ture)는 프레임을 출력하고 임의의 컴포너틑에게 포커스를 주기 때문이다.
    }

    class MyKeyListener extends KeyAdapter { // 키 리스너

        public void keyPressed(KeyEvent e) { // << 문자 키만 입력 받기 때문에 keyTyped()로 해도됨
            Dimension size = c.getSize();
            if(e.getKeyCode()==KeyEvent.VK_F1)
            {
                size.height+=10;
                size.width+=10;
                setSize(size);
            }// 10 픽셀 늘림
            if(e.getKeyCode()==KeyEvent.VK_F2)
            {
                size.height-=10;
                size.width-=10;
                setSize(size);

            }
            if(e.getKeyCode()==KeyEvent.VK_Q)
            {
               System.exit(0); // 프로그램 종료
            }
            if(e.getKeyChar()=='q')
            {
                System.exit(0); // 프로그램 종료
            }
        }

    }
    public static void main(String[] args) {
        new KeyChar_q6();
    }
}