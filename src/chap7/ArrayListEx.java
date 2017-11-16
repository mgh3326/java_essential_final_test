/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap7;

import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
        // 문자열만 삽입 가능한 ArrayList 컬렉션 생성
        ArrayList<String> a = new ArrayList<String>();

        // 키보드로부터 4개의 이름 입력받아 ArrayList에 삽입
        Scanner scanner = new Scanner(System.in); // Scanner 객체 생성
        for(int i=0; i<4; i++) {
            System.out.print("이름을 입력하세요>>");
            String s = scanner.next(); // 키보드로부터 이름 입력
            a.add(s); // ArrayList 컬렉션에 삽입
        }

        // ArrayList에 들어 있는 모든 이름 출력
        for(int i=0; i<a.size(); i++) {
            String name = a.get(i); // ArrayList의 i 번째 문자열 얻어오기
            System.out.print(name + " ");
        }

        // 가장 긴 이름 출력
        int longestIndex = 0; // 현재 가장 긴 이름이 있는 ArrayList 내의 인덱스
        for(int i=1; i<a.size(); i++) {
            if(a.get(longestIndex).length() < a.get(i).length()) // 이름 길이 비교
                longestIndex = i; // i 번째 이름이 더 긴 이름임
        }
        System.out.println("\n가장 긴 이름은 : " + a.get(longestIndex));
    }
}
//    이름을 입력하세요>>Mike
//        이름을 입력하세요>>Jane
//        이름을 입력하세요>>Ashley
//        이름을 입력하세요>>Helen
//        Mike Jane Ashley Helen
//        가장 긴 이름은 : Ashley