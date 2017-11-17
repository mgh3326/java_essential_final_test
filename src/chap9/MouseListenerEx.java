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

public class MouseListenerEx extends JFrame {
    JLabel la = new JLabel("Hello"); // "Hello" 문자열을 출력하기 위한 레이블 컴포넌트

    MouseListenerEx() {
        setTitle("Mouse 이벤트 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.addMouseListener(new MyMouseListener()); // 컨텐트팬에 이벤트 리스너 달기

        c.setLayout(null); // 컨텐트팬의 배치관리자 삭제
        la.setSize(50, 20); // 레이블의 크기 50x20 설정
        la.setLocation(30, 30);// 레이블의 위치 (30,30)으로 설정
        c.add(la); //레이블 컴포넌트 삽입

        setSize(200,200);
        setVisible(true);
    }

    class MyMouseListener implements MouseListener { // Mouse 리스너 구현 //MouseListener의 5개의 메소드를 모두 구현
        public void mousePressed(MouseEvent e) {
            int x = e.getX(); // 마우스 클릭 좌표 x //마이스 버튼이 눌러진 (x, y)위치를 알아냄
            int y = e.getY(); // 마우스 클릭 좌표 y
            la.setLocation(x, y); // 레이블의 위치를 (x,y)로 이동 //"Hello" 레이블을 위치로 이동시킴
        }
        public void mouseReleased(MouseEvent e) {}
        public void mouseClicked(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
    }

    public static void main(String [] args) {
        new MouseListenerEx();
    }
}
//초기 화면에 Hello로가 출력되고 마우스로 다른곳을 클릭하면 Hello 가 옮겨짐