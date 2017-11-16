/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap7;

import java.util.*;

public class VectorBig {
    public static void main(String[] args) {
        Vector<Double> v = new Vector<Double>();
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<5; i++) {
            double d = scanner.nextDouble();
            v.add(d);
        }

        double big = v.get(0);
        for(int i=0; i<v.size(); i++) {
            if(big < v.get(i))
                big = v.get(i);
        }

        System.out.println("가장 큰 수는 " + big);
    }

}
//5.14 2.2 -5.5 99.9 33.7
//가장 큰 수는 99.9
