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

public class q_12_6 extends JFrame
{
    Container c=getContentPane();
    q_12_6()
    {
        setTitle("버블 게임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyPanel panel=new MyPanel();
        c.add(panel,BorderLayout.CENTER);
        setSize(1000,1000);
        setVisible(true);
    }
    class MyPanel extends JPanel
    {
        MyPanel()
        {
            setLayout(null);
            addMouseListener(new MyMouseAdapter(this));
        }
        class MyMouseAdapter extends MouseAdapter
        {
            JPanel a;
            MyMouseAdapter(JPanel a)
            {
                this.a=a;
            }
            public void mousePressed(MouseEvent e)//마우스 클릭 했을때
            {
                bubble_icon b=new bubble_icon(e.getX(),e.getY());//클릭한 x좌표와 y 좌표에 JLabel 상속한 버블이 생성되도록 하였습니다.
                a.add(b);
            }
        }
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
        }
    }
    class bubble_icon extends JLabel implements Runnable
    {
        ImageIcon bubble_icon=new ImageIcon("images/bubble.jpg");
        int x,y; //밑에 run 함수에서 사용하기 위해서 여기에 작성하였습니다.
        bubble_icon(int x,int y)
        {
            this.x=x;
            this.y=y;
            setLocation(x,y);
            setIcon(bubble_icon);
            setSize(bubble_icon.getIconWidth(),bubble_icon.getIconHeight());//사진의 원본의 크기로 하였습니다.
            Thread th=new Thread(this);
            th.start();
        }
        public void run()
        {
            while(true){
                try
                {
                    Thread.sleep(20);//20ms마다 버블은 5픽셀씩 위로 올라갑니다.
                }
                catch(InterruptedException e)
                {
                    return;
                }
                setLocation(x,y);
                y-=5;
                if(y<-300)//사진의 크기 때문에 -300 됬을때 사라지도록 하였습니다.
                {
                    this.setVisible(false);//버블이 완전히 프레임을 벗어나면 안보여지도록 하였습니다.
                }
            }
        }
    }
    public static void main(String[] args)
    {
        new q_12_6();
    }
}