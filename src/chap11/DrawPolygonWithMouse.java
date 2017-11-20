/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap11;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class DrawPolygonWithMouse extends JFrame {
    public DrawPolygonWithMouse(){
        super("마우스로 폐다각형 그리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(new MyPanel());
        setSize(300,300);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        Vector<Integer> x = new Vector<Integer>();
        Vector<Integer> y = new Vector<Integer>();

        MyPanel() {
            this.addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    x.add(e.getX());
                    y.add(e.getY());
                    repaint();
                }
            });
        }
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.MAGENTA);
            int xs [] = new int [x.size()];
            int ys [] = new int [y.size()];
            for(int i=0; i<x.size(); i++) {
                xs[i] = x.get(i);
                ys[i] = y.get(i);
            }
            g.drawPolygon(xs,  ys,  xs.length);
        }
    }

    static public void main(String[] args) {
        new DrawPolygonWithMouse();
    }
}
//실습문제 11-5