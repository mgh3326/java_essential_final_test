/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap12;

public class ThreadMainEx {
    public static void main(String [] args) {
        long id = Thread.currentThread().getId(); // 스레드 ID 얻기
        String name = Thread.currentThread().getName(); // 스레드 이름 얻기
        int priority = Thread.currentThread().getPriority(); // 스레드 우선순위 값 얻기
        Thread.State s = Thread.currentThread().getState(); // 스레드 상태 값 얻기

        System.out.println("현재 스레드 이름 = " + name);
        System.out.println("현재 스레드 ID = " + id);
        System.out.println("현재 스레드 우선순위 값 = " + priority);
        System.out.println("현재 스레드 상태 = " + s);
    }
}
