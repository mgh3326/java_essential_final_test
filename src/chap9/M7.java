/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Frame7 extends JFrame
{
    JPanel P;
    JLabel La;

    Frame7()
    {
        this.setTitle("휠 굴리기");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        P = new JPanel();
        La = new JLabel("Love java");
        La.setFont(new Font("Arial", Font.PLAIN, 10));

        Mouse Mo = new Mouse();
        La.addMouseWheelListener(Mo);

        P.add(La);
        this.add(P);
        this.setVisible(true);
        this.setSize(300, 300);
    }





    class Mouse implements MouseWheelListener
    {
        public void mouseWheelMoved(MouseWheelEvent e)
        {
            int n = e.getWheelRotation();

            if( n > 0 && La.getFont().getSize() >5)
            {
                La.setFont(new Font("Arial", Font.PLAIN, La.getFont().getSize()-5));
            }

            else
            {
                La.setFont(new Font("Arial", Font.PLAIN, La.getFont().getSize()+5));
            }

        }

    }
}

public class M7
{

    public static void main(String[] args)
    {
        new Frame7();
    }

}

