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

public class GamblingGameFrame extends JFrame{
    public GamblingGameFrame() {
        super("Open Challenge 9"); // 타이틀
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(new GamePanel()); // GamePanel을 컨텐트팬으로 등록한다.

        setSize(300,200);
        setVisible(true);

        // GamePanel이 키 이벤트를 받을 수 있도록 포커스를 설정한다.
        getContentPane().requestFocus();
    }

    // 컨텐트팬을 사용되는 패널 클래스
    class GamePanel extends JPanel {
        JLabel [] label = new JLabel [3]; // 3 개의 수를 표현하는 레이블 배열
        JLabel result = new JLabel("시작합니다."); // 결과를 출력하는 레이블

        public GamePanel() {
            setLayout(null); // 배치관리자를 사용하지 않고 절대 위치에 컴포넌트를 배치한다.

            // 3 개의 레이블을 생성하여 컨테이너에 단다.
            for(int i=0; i<label.length; i++) {
                label[i] = new JLabel("0"); // 레이블 생성
                label[i].setSize(60, 30); // 레이블 크기
                label[i].setLocation(30+80*i, 50); // 레이블 위치
                label[i].setHorizontalAlignment(JLabel.CENTER); // 레이블에 출력되는 수를 센터링
                label[i].setOpaque(true); // 레이블에 배경색 설정이 가능하도록 한다.
                label[i].setBackground(Color.MAGENTA); // 레이블의 배경색을 설정한다.
                label[i].setForeground(Color.YELLOW); //레이블의 글자 색을 설정한다.
                label[i].setFont(new Font("Tahoma", Font.ITALIC, 30)); // 레이블 글자의 폰트를 설정한다.
                add(label[i]); // 레이블을 부착한다.
            }

            // 결과를 출력할 레이블을 생성하고 컨테이너에 부착한다.
            result.setSize(200, 20);
            result.setLocation(100, 120);
            add(result);

            // 키 리스너를 구현한다.
            addKeyListener(new KeyAdapter() { // KeyAdapter 이용
                public void keyPressed(KeyEvent e) {
                    if(e.getKeyChar() == '\n') { //<Enter>키가 입력된 경우
                        int x1 = (int)(Math.random()*5); // 0~4까지의 랜덤수
                        label[0].setText(Integer.toString(x1));
                        int x2 = (int)(Math.random()*5);
                        label[1].setText(Integer.toString(x2));
                        int x3 = (int)(Math.random()*5);
                        label[2].setText(Integer.toString(x3));

                        if(x1 == x2 && x2 == x3) // 3 수가 같은지 비교
                            result.setText("축하합니다!!");
                        else
                            result.setText("아쉽군요");
                    }
                }
            });
        }
    }

    static public void main(String[] arg) {
        new GamblingGameFrame();
    }
}
//엔터키로 입력받아서 겜블링 게임 하게끔함