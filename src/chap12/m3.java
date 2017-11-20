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
import java.util.Calendar;
import javax.swing.*;

class Frame3 extends JFrame
{
    JPanel p = new JPanel();
    JLabel[] la = new JLabel[3];
    runnable thread;
    Thread th;
    Frame3()
    {
        this.setTitle("test");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        for(int i = 0; i<3; i++)
        {
            la[i] = new JLabel("0");
            la[i].setFont(new Font("Arial", Font.PLAIN, 50));
            p.add(la[i]);
        }
        thread = new runnable();
        th = new Thread(thread);
        this.add(p);
        this.setVisible(true);
        this.setSize(300, 300);
        th.start();

    }

    class runnable implements Runnable
    {

        public void run()
        {

            while(true)
            {
                try
                {
                    Calendar c = Calendar.getInstance();
                    int h = c.get(Calendar.HOUR_OF_DAY);
                    int m = c.get(Calendar.MINUTE);
                    int s = c.get(Calendar.SECOND);

                    String H = Integer.toString(h);
                    String M = Integer.toString(m);
                    String S = Integer.toString(s);
                    la[0].setText(H +":");
                    la[1].setText(M +":");
                    la[2].setText(S);
                    Thread.sleep(1000);

                }
                catch(InterruptedException e){return;}
            }
        }
    }
}





public class m3
{

    public static void main(String[] args)
    {
        new Frame3();
    }

}
//[출처] 명품 자바프로그래밍 연습문제 13장|작성자 청렴