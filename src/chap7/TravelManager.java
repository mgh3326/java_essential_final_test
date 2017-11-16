/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap7;

import java.util.*;

class Location {
    private int x, y;
    Location(int x, int y) {
        this.x = x; this.y = y;
    }

    public double distance(Location b) {
        double d = (x - b.x)*(x - b.x) + (y - b.y)*(y - b.y);
        return Math.sqrt(d);
    }
}

public class TravelManager {
    public static void main(String[] args) {
        ArrayList<Location> travel = new ArrayList<Location>();
        Scanner scanner = new Scanner(System.in);

        travel.add(new Location(0,0)); // 시작 위치
        System.out.println("쥐가 이동한 위치(x,y)를 5개 입력하라.");
        for (int i=0; i<5; i++) {
            System.out.print(">> ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            travel.add(new Location(x, y));
        }
        travel.add(new Location(0,0)); // 최종 위치

        double sum = 0.0;
        for(int i=0; i<travel.size()-1; i++) {
            // Location(i)와 Location(i+1)의사이의 이동 거리
            double d = travel.get(i).distance(travel.get(i+1));
            sum += d;
        }
        System.out.println("총 이동 거리는 " + sum);
    }
}
//쥐가 이동한 위치(x,y)를 5개 입력하라.
//>> 2 2
//        >> 3 4
//        >> 5 4
//        >> 7 6
//        >> 6 1
//        총 이동 거리는 21.074704270883174