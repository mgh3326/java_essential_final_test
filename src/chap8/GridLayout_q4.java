/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap8;

import java.awt.*;  import javax.swing.*;
public class GridLayout_q4 extends JFrame {
    GridLayout_q4() {
        setTitle("GridLayout Question_4");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane(); // 컨텐트팬 알아내기
// 1x10의 GridLayout 배치관리자
        contentPane.setLayout(new GridLayout(1, 10));
        Color[] color={Color.RED,Color.ORANGE,Color.YELLOW,Color.GREEN,
                Color.CYAN,Color.BLUE,Color.MAGENTA,Color.GRAY,
                Color.PINK,Color.LIGHT_GRAY};//배경색 배열
        for (int i = 0; i < 10; i++) { // 10개의 버튼 부착;
            JButton button =new JButton(Integer.toString(i)) ; // i를 문자열로 변환
            button.setOpaque(true);//배경색이 보이게함
            button.setBackground(color[i]);//각 버튼의 색 설정
            contentPane.add(button); // 컨텐트팬에 버튼 부착
        }
        setSize(500, 200);// 프레임 크기 500x200 설정
        setVisible(true);//프레임을 화면에 출력
    }
    public static void main(String[] args)
    {
        new GridLayout_q4();
    }
}