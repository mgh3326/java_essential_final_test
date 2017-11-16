/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan. 
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna. 
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus. 
 * Vestibulum commodo. Ut rhoncus gravida arcu. 
 */

package chap8;
import javax.swing.*;  import java.awt.*;

public class BorderLayout_q2 extends JFrame {
    BorderLayout_q2() {
        setTitle("BorderLayout Question_2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane(); // 컨텐트팬 알아내기
// 컨텐트팬에 BorderLayout 배치관리자 설정
        contentPane.setLayout(new BorderLayout(5, 7));//컴포넌트 사이의 수평 간격을 5픽셀, 수직 간격을 7픽셀로 지정하였습니다.
        contentPane.add(new JButton("Center"), BorderLayout.CENTER);//CENTER 위치에 text 내용이 center가 되도록하였습니다.
        contentPane.add(new JButton("North"), BorderLayout.NORTH);//NORTH 위치에 text 내용이 north가 되도록 하였습니다.
        contentPane.add(new JButton("South"), BorderLayout.SOUTH);//SOUTH 위치에 text 내용이 south가 되도록 하였습니다.
        contentPane.add(new JButton("East"), BorderLayout.EAST);//EAST 위치에 text 내용이 east가 되도록 하였습니다.
        contentPane.add(new JButton("West"), BorderLayout.WEST);//WEST 위치에 text 내용이 west가 되도록 하였습니다.

        setSize(400, 200); // 프레임 크기 400x200 설정
        setVisible(true); // 프레임을 화면에 출력
    }

    public static void main(String[] args){
        new BorderLayout_q2();
    }
}

