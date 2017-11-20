/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap12;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomGraphicsDrawOval extends JFrame {
    RandomGraphicsDrawOval() {
        setTitle("원을 0.5초 간격으로 랜덤한 위치에 그리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setContentPane(new MyPanel());
        MyPanel p = new MyPanel();
        setContentPane(p);
        setSize(500, 500);
        setVisible(true);
    }

    class MyPanel extends JPanel implements Runnable {
        int x,y;
        JPanel jp = new JPanel();
        public void paintComponent(Graphics g) {
            g.setColor(Color.RED);
            x = (int)(Math.random()*350);//0~350의 랜덤 x
            y = (int)(Math.random()*270);//0~270의 랜덤 y
            new Thread(this).start(); // 스레드 시작
            g.drawOval(x, y, 50, 50);//반지름이 50
        }
        public void run() {
            while(true) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) { return; }

                x = (int)(Math.random()*350);//0~350의 랜덤 x
                y = (int)(Math.random()*270);//0~270의 랜덤 y
                getParent().repaint();
                //여기부터 다시
            }
        }
    }

    public static void main(String [] args) {
        new RandomGraphicsDrawOval();
    }
}
//실습문제 12-2
//원을 0.5초마다 랜덤한 위치로 그리기