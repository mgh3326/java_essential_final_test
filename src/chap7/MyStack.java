/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap7;

class GStack<T> { // 제네릭 스택 선언. 제네릭 타입 T
    int tos;
    Object [] stck; // 스택에 저장된 요소의 개수
    public GStack() {
        tos = 0;
        stck = new Object [10];
    }
    public void push(T item) {
        if(tos == 10) // 스택이 꽉 차서 더 이상 요소를 삽입할 수 없음
            return;
        stck[tos] = item;
        tos++;
    }
    public T pop() {
        if(tos == 0) // 스택이 비어 있어 꺼낼 요소가 없음
            return null;
        tos--;
        return (T)stck[tos]; // 타입 매개 변수 타입으로 캐스팅 << 주목
    }
}

public class MyStack {
    public static void main(String[] args) {
        GStack<String> stringStack = new GStack<String>(); // String 타입의 GStack 생성
        stringStack.push("seoul");
        stringStack.push("busan");
        stringStack.push("LA");

        for(int n=0; n<3; n++)
            System.out.println(stringStack.pop()); // stringStack 스택에 있는 3 개의 문자열 팝

        GStack<Integer> intStack = new GStack<Integer>(); // Integer 타입의 GStack 생성
        intStack.push(1);
        intStack.push(3);
        intStack.push(5);

        for(int n=0; n<3; n++)
            System.out.println(intStack.pop()); // intStack 스택에 있는 3 개의 정수 팝
    }
}
//            LA
//            busan
//            seoul
//            5
//            3
//            1