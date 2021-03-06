/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap11;
import javax.swing.*;
import java.awt.*;

public class paintJPanelEx extends JFrame {
    paintJPanelEx() {
        setTitle("JPanel의 paintComponent() 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanel()); // 생성한 패널을 컨텐트팬으로 사용

        setSize(250,200);
        setVisible(true);
    }

    // JPanel을 상속받는 새 패널 구현
    class MyPanel extends JPanel {
        public void paintComponent(Graphics g) { // 패널에 도형을 그린다. //<<MyPanel의 내부를 그리는 ㄷ메소드로서 3개의 사각형을 그린다.
            super.paintComponent(g); // JPanel의 paintComponent() 호출 << 패널 내에 이전에 그려진 잔상을 지우기 위해 호출한다.
            g.setColor(Color.BLUE); // 파란색 선택
            g.drawRect(10,10,50,50); // (10,10) 위치에 50x50 크기의 사각형 그리기
            g.drawRect(50,50,50,50); // (50,50) 위치에 50x50 크기의 사각형 그리기

            g.setColor(Color.MAGENTA); // 핑크색 선택
            g.drawRect(90,90,50,50); // (90,90) 위치에 50x50 크기의 사각형 그리기
        }
    }

    public static void main(String [] args) {
        new paintJPanelEx();
    }
}