/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap7;

import java.util.*;

public class TallManager {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>(10);//크기가 10인 정수 값만 다루는 제네릭 벡터 생성
        Scanner sc=new Scanner(System.in);

        System.out.print("2000~2009년까지 1년 단위로 키(cm)를 입력\n>>");
        for(int i=0;i<v.capacity();i++)//10개의 크기를 벡터에 입력
        {
            v.add(sc.nextInt());
        }
        int max=v.get(1)-v.get(0);//먼저 1번째 값과 0번째 값의 차이를 max의 초기값으로서 max 선언
        int val=0;
        for(int i=1;i<v.size()-1;i++)
        {
            if(max<v.get(i+1)-v.get(i)) {
                //만약 i 값일때 v.get(i+1)-v.get(i)가 max보다 크다면 v.get(i+1)-v.get(i)을 max값으로 하고
                //i값을 반복문 밖에서 쓰기 위해 val 값으로 주었습니다.
                max = v.get(i + 1) - v.get(i);
                val=i;
            }
        }
        System.out.println("가장 키가 많이 자란 년도는 "+(val+2000)+"년 "+max+"cm");//출력문
    }
}
//2000~2009년까지 1년 단위로 키(cm)를 입력
//>>120 122 125 130 139 160 169 173 175 177
//        가장 키가 많이 자란 년도는 2004년 21cm