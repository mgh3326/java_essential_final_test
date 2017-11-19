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
import java.awt.event.*;

//보너스 문제 다른 사람이 푼 답이 M7 인데 내꺼는 왜 크기가 어느 정도에서 안 늘어나는지를 모르겠다. //해결
public class KeyChar_q_bonus extends JFrame {
    JLabel la = new JLabel("Love Java");
    KeyChar_q_bonus() {
        super("마우스 휠 굴리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane(); // 컨텐트 팬 알아내기
        c.setLayout(new FlowLayout());// 글자 넣을때 쓰는건가 보다 일단 주석 처리함
        la.setFont(new Font("Arial",Font.PLAIN,10));//Arial 폰트로 10픽셀 크기
        la.addMouseWheelListener(new MyMouseListener()); // 마우스 리스너 달기
        c.add(la);//이게 아래로 내려오니까 되네. 이거 중요한거 같다.
        setSize(300, 300);
        setVisible(true);
    }

    class MyMouseListener implements MouseWheelListener { // 키 리스너
//                Font f=la.getFont();// 현재 la의 폰트 얻기 여기가 문제엿네
//               int size=f.getSize();//폰트 사이즈 크기 알아내기
        public void mouseWheelMoved(MouseWheelEvent e) {
            int n= e.getWheelRotation();
            if(n<0){// up direction. 폰트 5픽셀 작게
                if(la.getFont().getSize()>5) {
                          la.setFont(new Font("Arial",Font.PLAIN,la.getFont().getSize()-5));//5픽셀 크기로 폰트 변경 // size에서 바꾸니까 되네
                }
            }
            else{ //down direction. 폰트 5픽셀 크게

                    la.setFont(new Font("Arial", Font.PLAIN, la.getFont().getSize() + 5));//5픽셀 크기로 폰트 변경

            }
        }




    }
    public static void main(String[] args) {
        new KeyChar_q_bonus();
    }
}
//Love Java를 처음 10 픽셀로 출력하고 마우스 휠을 통해 5픽셀 커지고 5 픽셀 작아집니다.
// 다만 글자의 크기가 5픽셀보다 작아지지 않도록 합니다.