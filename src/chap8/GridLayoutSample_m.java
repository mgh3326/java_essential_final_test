/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap8;
import javax.swing.*;
import java.awt.*;

public class GridLayoutSample extends JFrame {
    GridLayoutSample() {
        setTitle("GridLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout grid = new GridLayout(4, 3);
        grid.setVgap(5);
        grid.setHgap(5);
        setLayout(grid);
        for(int i=1; i<=9; i++)
            add(new JButton(Integer.toString(i)));

        add(new JButton("*"));
        add(new JButton("0"));

        setSize(300, 200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GridLayoutSample();
    }
}

