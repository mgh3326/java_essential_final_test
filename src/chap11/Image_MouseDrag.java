/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap11;

import chap9.MouseDraggingFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Image_MouseDrag extends JFrame {
    MyPanel p = new MyPanel();//add 하기 위해서 사용하는것 같다.
    public Image_MouseDrag() {
        setTitle("이미지 위에 원 드래깅 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setContentPane(new MyPanel());//왜 add를 해야하지?
        Container contentPane = getContentPane(); // 컨텐트팬 알아내기
        MyMouseListener ml = new MyMouseListener();
        contentPane.addMouseMotionListener(ml);
        contentPane.addMouseListener(ml);
        add(p);
        setSize(300,300);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        Image img = new ImageIcon("images/back.jpg").getImage();
        int x=0;
        int y=0;
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            g.setColor(Color.BLUE);
            g.fillOval(x,y,20,20); // 파란색 타원 칠하기 (20픽셀, 20픽셀)
        }
    }
    class MyMouseListener extends MouseAdapter implements MouseMotionListener {
        public void mouseDragged(MouseEvent e) {
            p.x = e.getX();
            p.y = e.getY();
            repaint();
        }

        public void mouseMoved(MouseEvent e) {}

    }
    public static void main(String[] args) {
        new Image_MouseDrag();
    }
}
//11-4 실습문제
/*
앞의 2번 문제에 주어진 "back.jpg"을 배경에 출력하고 그 위에 반지름이 20픽셀인 초록색 원을 만들어 커서처럼 마우스 드래깅으로
움직이는 프로그램을 작성하라.
mouseDragged()에서 repaint()를 호출해야한다.
 */