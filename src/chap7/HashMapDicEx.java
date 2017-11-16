/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap7;

import java.util.*;
public class HashMapDicEx {
    public static void main(String[] args) {
        // 영어 단어와 한글 단어의 쌍을 저장하는 HashMap 컬렉션 생성
        HashMap<String, String> dic = new HashMap<String, String>();

        // 3 개의 (key, value) 쌍을 dic에 저장
        dic.put("baby", "아기"); // "baby"는 key, "아기"은 value
        dic.put("love", "사랑");
        dic.put("apple", "사과");

        // dic 해시맵에 들어 있는 모든 (key, value) 쌍 출력
        Set<String> keys = dic.keySet(); // 키를 모두 Set 컬렉션에 받아옴
        Iterator<String> it = keys.iterator(); // Set에 저장된 키 문자열을 접근할 수 있는 Iterator 리턴
        while(it.hasNext()) {
            String key = it.next(); // 키
            String value = dic.get(key); // 값
            System.out.print("(" + key + "," + value + ")");
        }
        System.out.println();

        // 사용자로부터 영어 단어를 입력받고 한글 단어 검색
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<3; i++) {
            System.out.print("찾고 싶은 단어는?");
            String eng = scanner.next();
            // 해시맵에서 '키' eng의 '값' kor 검색
            String kor = dic.get(eng); // eng가 해시맵에 없으면 null 리턴
            if(kor == null) System.out.println(eng +"는 없는 단어 입니다.");
            else System.out.println(kor);
        }
    }
}
//        찾고 싶은 단어는?apple << 해시맵에 들어 있는 모든 요소 출력
//        사과
//        찾고 싶은 단어는?babo
//        babo는 없는 단어 입니다.
//        찾고 싶은 단어는?love
//        사랑