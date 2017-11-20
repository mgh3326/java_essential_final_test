/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class VibratingFrame extends JFrame implements Runnable {
    Thread th; // 진동하는 스레드
    public VibratingFrame() {
        setTitle("진동하는 프레임 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200,200);
        setLocation(300,300); // 프레임의 위치를 스크린의 (300,300)에 설정
        setVisible(true);

        getContentPane().addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {//<<마우스가 클릭 되면 진동을 멈추기 위한
                // 익명의 이벤트 리스너
                if(!th.isAlive()) return; // 이미 스레드가 종료했다면 그냥 리턴
                th.interrupt(); // 진동 스레드에게 InterruptedException 보냄
            }
        });

        th = new Thread(this); // 진동하는 스레드 객체 생성 //<< 프레임 객체가 Runnable 인터페이스를
        // 구현한 객체이므로 this 가능
        th.start(); // 진동 시작
    }

    public void run() { // 20ms마다 프레임의 위치를 랜덤하게 이동
        Random r = new Random();
        while(true) {
            try {
                Thread.sleep(20); // 20ms 잠자기
            }
            catch(InterruptedException e){
                return; // 리턴하면 스레드 종료
            }
            int x = getX() + r.nextInt()%5; // 새 위치 x << -4에서 4까지의 임의의 정수 리턴 << getX()는 프레임의 현재 위치 x값
            int y = getY() + r.nextInt()%5; // 새 위치 y <<프레임의 현재 위치에서 4픽셀 범위의 랜덤한 위치
            setLocation(x, y); // 프레임의 위치 이동
        }
    }

    public static void main(String [] args) {
        new VibratingFrame();
    }
} 