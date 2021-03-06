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

public class GraphicsFillEx extends JFrame {
    GraphicsFillEx() {
        setTitle("fillXXX 사용 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanel());

        setSize(100, 350);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.RED);//<<setColor()는 칠하기 색으로도 사용
            g.fillRect(10,10,50,50); // 빨간색 사각형 칠하기
            g.setColor(Color.BLUE);
            g.fillOval(10,70,50,50); // 파란색 타원 칠하기
            g.setColor(Color.GREEN);
            g.fillRoundRect(10,130,50,50, 20,20); // 초록색 둥근사각형 칠하기
            g.setColor(Color.MAGENTA);
            g.fillArc(10, 190, 50, 50, 0, 270); // 마젠타색 원호 칠하기
            g.setColor(Color.ORANGE);
            int []x ={30,10,30,60};
            int []y ={250,275,300,275};
            g.fillPolygon(x, y, 4);	// 오렌지색 다각형 칠하기 << x[]와 y[]로부터 4점으로 구성된 폐다각형 칠하기
        }
    }

    public static void main(String [] args) {
        new GraphicsFillEx();
    }
}