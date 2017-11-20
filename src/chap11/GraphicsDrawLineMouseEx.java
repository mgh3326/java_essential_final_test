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
import java.util.*;
import java.awt.event.*;

public class GraphicsDrawLineMouseEx extends JFrame {
    GraphicsDrawLineMouseEx() {
        setTitle("마우스로 여러 개의 선 그리기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanel());

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String [] args) {
        new GraphicsDrawLineMouseEx();
    }

    // 선을 그릴 수 있는 패널을 구현한다.
    // 이 패널에 Mouse 리스너를 구현한다.
    class MyPanel extends JPanel {
        // 그려진 선을 모두 저장하기 위해 시작점은 vStart에
        // 끝점은 vEnd 벡터에 각각 저장한다.
        Vector<Point> vStart = new Vector<Point>();
        Vector<Point> vEnd = new Vector<Point>();

        public MyPanel() {

            // Mouse 리스너를 등록한다.
            // 이 리스너는 마우스 버튼이 눌러지면 마우스 포인터(시작점)를 vStart 벡터에 저장하고
            // 마우스 버튼이 놓여지면 마우스 포인터(끝점)를 vEnd 벡터에 기억한다.

            addMouseListener(new MouseAdapter(){
                public void mousePressed(MouseEvent e) {
                    Point startP = e.getPoint(); // 마우스 포인터를 알아낸다.
                    vStart.add(startP); // 시작점을 vStart에 저장한다.
                }
                public void mouseReleased(MouseEvent e) {
                    Point endP = e.getPoint(); // 마우스 포인터를 알아낸다.
                    vEnd.add(endP); // 끝점을 vEnd에 저장한다.

                    // 패널의 다시 그리기를 요청한다.
                    repaint();//<<주목
                }
            });
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLUE); // 파란색을 선택한다.

            // 벡터의 크기만큼 루프 돌면서 선을 그린다.
            for(int i=0; i<vStart.size(); i++) { //vStart 벡터의 크기는 만들어진 선의 개수와 동일
                Point s = vStart.elementAt(i); // 벡터에 들어 있는 시작점을 알아낸다.
                Point e = vEnd.elementAt(i); // 벡터에 들어 있는 끝점을 알아낸다.

                // 시작점에서 끝점까지 선을 그린다.
                g.drawLine((int)s.getX(), (int)s.getY(), (int)e.getX(), (int)e.getY());
            }
        }
    }
}
//여러 개의 선을 저장하기 위해서 Vector<Point> 객체 vStart, vEnd를 생성하고 시작점과 끝점을 가각 따로 저장합니다.
//mousePressed()에서 마우스가 눌러진 점 startIP와 mouseReleased()에서 마우스의 끝점 endP를 vSTart,vEnd에 각각 저장합니다.
//이제 중요한 것은 그 다음에 repaint()를 호출하는 것입니다. 이 호출로 인해 MyPanel이 다시
//페인팅 되고 patinComponent()가 호출됩니다. paintComponent() 메소드는 vSTart와 vEnd에
//지금까지 만들어진 선을 모두 그립니다.