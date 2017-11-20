/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap11;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PieChartFrame extends JFrame {
    Container contentPane;
    int [] data = {0,0,0,0};
    int [] arcAngle = new int [4];
    Color [] color = {Color.RED, Color.BLUE, Color.MAGENTA, Color.ORANGE};
    String [] itemName = {"apple", "cherry", "strawberry", "prune"};
    JTextField [] tf = new JTextField [4];
    ChartPanel chartPanel = new ChartPanel();

    PieChartFrame() {
        setTitle("Open Challenge 11");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = getContentPane();
        contentPane.add(new InputPanel(), BorderLayout.NORTH);
        contentPane.add(chartPanel, BorderLayout.CENTER);
        setSize(500,350);
        setVisible(true);
        drawChart();
    }

    void drawChart() {
        int sum=0;
        for(int i=0; i<data.length; i++) {
            data[i] = Integer.parseInt(tf[i].getText());
            sum+=data[i];
        }

        if(sum == 0) return;

        for(int i=0; i<data.length; i++)
            arcAngle[i]=(int)Math.round((double)data[i]/(double)sum*360);

        chartPanel.repaint();
    }

    class InputPanel extends JPanel {
        InputPanel() {
            this.setBackground(Color.LIGHT_GRAY);
            for(int i=0; i<tf.length; i++) {
                tf[i] = new JTextField("0", 5);
                tf[i].addActionListener(new MyActionListener());
                add(new JLabel(itemName[i]));
                add(tf[i]);
            }
        }
        class MyActionListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                JTextField t = (JTextField)e.getSource();
                int n;
                try {
                    n = Integer.parseInt(t.getText());
                }catch(NumberFormatException ex) {
                    t.setText("0");
                    return;
                }
                drawChart();
            }
        }
    }

    class ChartPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            int startAngle = 0;
            for(int i=0; i<data.length; i++) {
                g.setColor(color[i]);
                g.drawString(itemName[i]+" "+Math.round(arcAngle[i]*100./360.)+"%", 50+i*100, 20);
            }
            for(int i=0; i<data.length; i++) {
                g.setColor(color[i]);
                g.fillArc(150,50,200,200,startAngle, arcAngle[i]);
                startAngle = startAngle + arcAngle[i];
            }
        }
    }

    public static void main(String [] args) {
        new PieChartFrame();
    }
}
//오픈첼린지