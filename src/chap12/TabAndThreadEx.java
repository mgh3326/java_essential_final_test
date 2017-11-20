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
import java.awt.event.*;

class MyLabel extends JLabel {
    int barSize = 0; // 바의 크기
    int maxBarSize;

    MyLabel(int maxBarSize) {
        this.maxBarSize = maxBarSize;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.MAGENTA);
        int width = (int) (((double)(getWidth()))/maxBarSize*barSize);
        if(width==0) return; // 크기가 0이기 때문에 바를 그릴 필요 없음
        g.fillRect(0, 0, width, this.getHeight());
    }

    synchronized void fill() {
        if(barSize == maxBarSize) {
            try {
                wait(); // 바의 크기가 최대이면, ComsumerThread에 의해 바의 크기가 줄어들 때까지 대기
            } catch (InterruptedException e) { return; }
        }
        barSize++;
        repaint(); // 바 다시 그리기
        notify(); // 기다리는 ConsumerThread 스레드 깨우기
    }
    synchronized void consume() {
        if(barSize == 0) {
            try {
                wait(); // 바의 크기가 0이면 바의 크기가 0보다 커질때까지 대기
            } catch (InterruptedException e) { return; }
        }
        barSize--;
        repaint(); // 바 다시 그리기
        notify(); // 기다리는 이벤트 스레드 깨우기
    }
}

class ConsumerThread extends Thread {
    MyLabel bar;

    ConsumerThread(MyLabel bar) {
        this.bar = bar;
    }
    public void run() {
        while(true) {
            try {
                sleep(100);
                bar.consume(); // 0.1초마다 바를 1씩 줄인다.
            } catch (InterruptedException e) { return; }
        }
    }
}

public class TabAndThreadEx  extends JFrame {
    MyLabel bar = new MyLabel(100); // 바의 최대 크기를 100으로 설정

    TabAndThreadEx(String title) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        bar.setBackground(Color.ORANGE);
        bar.setOpaque(true);
        bar.setLocation(20,  50);
        bar.setSize(300, 20); // 300x20 크기의 바
        c.add(bar);

        // 컨텐트팬에 키 이벤트 핸들러 등록
        c.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                bar.fill(); // 키를 누를때마다 바가 1씩 증가한다.
            }
        });
        setSize(350,200);
        setVisible(true);

        c.requestFocus(); // 컨텐트팬에게 키 처리권 부여
        ConsumerThread th = new ConsumerThread(bar); // 스레드 생성
        th.start(); // 스레드 시작
    }

    public static void main(String[] args) {
        new TabAndThreadEx("아무키나 빨리 눌러 바 채우기");
    }
}