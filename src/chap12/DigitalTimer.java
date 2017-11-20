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
import java.util.Calendar;

class TimerRunable_q4 implements Runnable {//듀플레이트 라서 이름 임의로 바꿈
    JLabel timerLabel;// 타이머 값이 출력된 레이블

    public TimerRunable_q4(JLabel timerLabel) {
        this.timerLabel = timerLabel; // 초 카운트를 출력할 레이블
    }

    // 스레드 코드. run()이 종료하면 스레드 종료
    public void run() {
        int n=0; // 타이머 카운트 값

        Calendar c =Calendar.getInstance();//현재년도/날짜/시간 값을 가진 객체얻기
        int hour=c.get(Calendar.HOUR_OF_DAY);
        int min= c.get(Calendar.MINUTE);
        int second=c.get(Calendar.SECOND);
        String clockText = Integer.toString(hour);
        clockText=clockText.concat(":");
        clockText=clockText.concat(Integer.toString(min));
        clockText=clockText.concat(":");
        clockText=clockText.concat(Integer.toString(second));
        while(true) { // 무한 루프
            //timerLabel.setText(Integer.toString(n)); // 레이블에 카운트 값 출력
            timerLabel.setText(clockText);
            try {
                Thread.sleep(1000); // 1초동안 잠을 잔다.
            }
            catch(InterruptedException e) {
                return; // 예외가 발생하면 스레드 종료
            }
        }
    }
}

public class DigitalTimer extends JFrame {
    public DigitalTimer() {
        setTitle("디지털 시계 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        // 타이머 값을 출력할 레이블 생성
        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
        c.add(timerLabel); // 레이블을 컨텐트팬에  부착

        // 타이머 스레드로 사용할 Runnable 객체 생성. 타이머 값을 출력할 레이블를 생성자에 전달
        TimerRunable_q4 runnable = new TimerRunable_q4(timerLabel);
        Thread th = new Thread(runnable); // 스레드 객체 생성

        setSize(400,300);
        setVisible(true);

        th.start(); // 타이머 스레드의 실행을 시작하게 한다.//<<이 라인 실행결과. TimerRunnalge의 run()메소드가 실행을 시작한다.
    }
    public static void main(String[] args) {
        new DigitalTimer();
    }
}
//12-4번문제 내가 한건 시간이 안 변하고 일단 m3.java 참고하자
