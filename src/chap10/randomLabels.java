/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap10;

import java.awt.event.*;
import javax.swing.*;
public class randomLabels extends JFrame
{//참고 코드
    int ci = 0;
    JLabel[] jl = new JLabel[10];
    randomLabels()
    {
        setTitle("Ten 레이블 클릭");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        setSize(300, 300);
        setVisible(true);
        for (int i = 0; i < jl.length; i++)
        {
            jl[i] = new JLabel("" + i + "");
            jl[i].setSize(15, 15);
            int x = (int) (Math.random() * 250);
            int y = (int) (Math.random() * 250);
            jl[i].setLocation(x, y);
            jl[i].addMouseListener(new MouseAdapter()
            {
                public void mouseClicked(MouseEvent e)
                {
                    System.out.println(ci);
                    JLabel la = (JLabel) e.getSource();
                    if ( ci < 10 &&la == jl[ci])
                    {
                        jl[ci].setVisible(false);
                        ci++;
                    }
                    if(ci > 9)
                    {
                        ci = 0;
                        for(int i = 0; i < jl.length; i++)
                        {
                            jl[i].setVisible(true);
                            int x = (int) (Math.random() * 250);
                            int y = (int) (Math.random() * 250);
                            jl[i].setLocation(x, y);
                        }
                    }
                }
            });
            add(jl[i]);
        }
    }
    public static void main(String[] args)
    {
        new randomLabels();

    }
}