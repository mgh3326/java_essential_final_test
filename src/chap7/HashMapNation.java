/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap7;

import java.util.*;

public class HashMapNation {
    public static void main(String[] args) {
        HashMap<String, Integer> nations = new HashMap<String, Integer>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("나라 이름과 인구를 5개 입력하세요.(예: Korea 5000)");
        for(int i=0; i<5; i++) {
            System.out.print("나라 이름, 인구 >> ");
            String nation = scanner.next();
            int population = scanner.nextInt();
            nations.put(nation, population);
        }

        int bigPopu = 0; // 제일 많은 인구
        String bigNation=""; // 제일 많은 인구의 나라
        Set<String> names = nations.keySet();
        Iterator<String> it = names.iterator();
        while(it.hasNext()) {
            String name = it.next(); // 키. 나라 이름
            int n = nations.get(name); // 인구
            if(bigPopu < n) {
                bigPopu = n;
                bigNation = name;
            }
        }
        System.out.println("제일 인구가 많은 나라는 (" +
                bigNation + ", " + bigPopu + ")");
    }

}
//나라 이름과 인구를 5개 입력하세요.(예: Korea 5000)
//나라 이름, 인구 >> Korea 5000
//        나라 이름, 인구 >> China 1000000
//        나라 이름, 인구 >> USA 30000
//        나라 이름, 인구 >> Swiss 2000
//        나라 이름, 인구 >> France 2500
//        제일 인구가 많은 나라는 (China, 1000000)