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
public class KeyChar_q4 extends JFrame {
    JLabel la = new JLabel("Love Java");
    KeyChar_q4() {
        super("+,- 키로 폰트 크기 조절하기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane(); // 컨텐트 팬 알아내기
        c.setLayout(new FlowLayout());// 글자 넣을때 쓰는건가 보다 일단 주석 처리함
        la.setFont(new Font("Arial",Font.PLAIN,10));//Arial 폰트로 10픽셀 크기

        c.addKeyListener(new MyKeyListener()); // 키 리스너 달기
        c.add(la);//이게 아래로 내려오니까 되네. 이거 중요한거 같다.
        setSize(300, 200);
        setVisible(true);
        c.requestFocus(); // 컨텐트 팬에 포커스 설정. 키 입력 가능해짐 //<< 이문자이 없다면 컨텐트펜은 키 입력을 받을 수 없다. 또한 이 문장은 setVisiable(ture);실행 후에 실행 되어야 한다. setVisiable(ture)는 프레임을 출력하고 임의의 컴포너틑에게 포커스를 주기 때문이다.
    }

    class MyKeyListener extends KeyAdapter { // 키 리스너


        public void keyPressed(KeyEvent e) { // << 문자 키만 입력 받기 때문에 keyTyped()로 해도됨
            Font f=la.getFont();// 현재 la의 폰트 얻기
            int size=f.getSize();//폰트 사이즈 크기 알아내기
            switch (e.getKeyChar()) { // 입력된 키 문자
                case '+':
                    la.setFont(new Font("Arial",Font.PLAIN,size+5));//15픽셀 크기로 폰트 변경
                    break;
                case '-':
                    if(size>5) {//폰트 사이즈가 5보다 작아지지 않도록 합니다.
                        la.setFont(new Font("Arial", Font.PLAIN, size - 5));//15픽셀 크기로 폰트 변경
                    }
                    break;
            }
        }

    }
    public static void main(String[] args) {
        new KeyChar_q4();
    }
}
//Love Java를 처음 10 픽셀로 출력하고 + 키를 입력 받으면 5픽셀 커지고 - 를 입력 받으면 5 픽셀 작아집니다.
// 다만 글자의 크기가 5픽셀보다 작아지지 않도록 합니다.