/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap10;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CheckBoxItemEventEx extends JFrame {
    JCheckBox [] fruits = new JCheckBox [3]; // 체크박스 배열
    String [] names = {"사과", "배", "체리"}; // 체크박스 문자열로 사용할 문자열 배열
    JLabel sumLabel; // 계산 합을 출력할 레이블

    CheckBoxItemEventEx() {
        setTitle("체크박스와 ItemEvent 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(new JLabel("사과  100원, 배 500원, 체리 20000원"));

        // 3개의 체크박스 컴포넌트를 생성하고 컨텐트팬에 삽입, Item 리스너 등록
        MyItemListener listener = new MyItemListener();
        for(int i=0; i<fruits.length; i++) {
            fruits[i] = new JCheckBox(names[i]); // names[]의 문자열로 체크박스 생성
            fruits[i].setBorderPainted(true); // 체크박스의 외곽선이 보이도록 설정
            c.add(fruits[i]); // 컨텐트팬에 체크박스 삽입
            fruits[i].addItemListener(listener); // 체크박스에 Item 리스너 등록
            //<<fruits[i].addItemListener(new MyItemListener());로 하면 안 된다. 이렇게 하면 3개의 리스너가 제 각각
            //sum 변수를 보유하게ㅣ때문이다.
        }

        sumLabel = new JLabel("현재 0 원 입니다."); // 가격 합을 출력하는 레이블 생성
        c.add(sumLabel);

        setSize(250,200);
        setVisible(true);
    }

    // Item 리스너 구현
    class MyItemListener implements ItemListener {
        int sum = 0; // 가격의 합

        // 체크박스의 선택 상태가 변하면 itemStateChanged()가 호출됨
        public void itemStateChanged(ItemEvent e) {//<<체크박스의 선택 상태가 변할 때 호출되며
            // Item 이벤트가 발생한 체크박스를 판별하고 가격을 계산한다.
            if(e.getStateChange() == ItemEvent.SELECTED) { // 체크박스가 선택된 경우 //<< e.getStateChange()는
                // Item 이벤트가 발생한 체크박스의 현재 상태를 리턴하며 선택 상태인지를 판단하기 위해
                // ItemEvent.SELECTED 상수와 비교한다.
                if(e.getItem() == fruits[0]) // 사과 체크박스
                    sum += 100;
                else if(e.getItem() == fruits[1]) // 배 체크박스
                    sum += 500;
                else // 체리 체그박스
                    sum += 20000;
            }
            else { // 체크박스가 해제된 경우
                if(e.getItem() == fruits[0]) // 사과 체크박스
                    sum -= 100;
                else if(e.getItem() == fruits[1]) // 배 체크박스
                    sum -= 500;
                else // 체리 체그박스
                    sum -= 20000;
            }
            sumLabel.setText("현재 "+sum+"원 입니다."); // 합 출력
        }
    }
    public static void main(String [] args) {
        new CheckBoxItemEventEx();
    }
}
