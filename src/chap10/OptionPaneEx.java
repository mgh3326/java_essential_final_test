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

public class OptionPaneEx extends JFrame {
    OptionPaneEx() {
        setTitle("옵션 팬 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        setSize(500,200);
        c.add(new MyPanel(), BorderLayout.NORTH);
        setVisible(true);
    }

    class MyPanel extends Panel {
        JButton inputBtn = new JButton("Input Name");
        JTextField tf = new JTextField(10);
        JButton confirmBtn = new JButton("Confirm");
        JButton messageBtn = new JButton("Message");

        MyPanel() {
            setBackground(Color.LIGHT_GRAY);
            add(inputBtn);
            add(confirmBtn);
            add(messageBtn);
            add(tf);

            inputBtn.addActionListener(new ActionListener() {//<<Input Name 버튼을 선택하면 입력 다이얼 로그를 생성한다.
                public void actionPerformed(ActionEvent e) {
                    // 입력 다이얼로그 생성
                    String name = JOptionPane.showInputDialog("이름을 입력하세요.");
                    if(name != null)
                        tf.setText(name); // 사용자가 입력한 문자열을 텍스트필드 창에 출력
                }
            });

            confirmBtn.addActionListener(new ActionListener() {//<<Conbfirm 버튼을 선택하면 확인 다이얼 로그를 생성한다.
                public void actionPerformed(ActionEvent e) {
                    // 확인 다이얼로그 생성
                    int result = JOptionPane.showConfirmDialog(null,
                            "계속할 것입니까?", "Confirm", JOptionPane.YES_NO_OPTION);

                    // 사용자가 선택한 버튼에 따라 문자열을 텍스트필드 창에 출력
                    if(result == JOptionPane.CLOSED_OPTION)
                        tf.setText("Just Closed without Selection");
                    else if(result == JOptionPane.YES_OPTION)
                        tf.setText("Yes");
                    else
                        tf.setText("No");
                }
            });

            messageBtn.addActionListener(new ActionListener() {//<<Message 버튼을 선택하면 메시지를 다이얼로그를 생성한다.
                public void actionPerformed(ActionEvent e) {
                    // 메시지 다이얼로그 생성
                    JOptionPane.showMessageDialog(null, "조심하세요", "Message", JOptionPane.ERROR_MESSAGE);
                }
            });
        }
    }

    public static void main(String [] args) {
        new OptionPaneEx();
    }
}




