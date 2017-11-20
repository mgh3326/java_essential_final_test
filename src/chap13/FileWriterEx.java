/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap13;

import java.io.*;

public class FileWriterEx {
    public static void main(String[] args) {
        InputStreamReader in = new InputStreamReader(System.in); // 문자 입력 스트림 생성

        FileWriter fout = null;//널로 초기화
        int c;
        try {
            fout = new FileWriter("c:\\tmp\\test.txt"); // 파일과 연결된 출력 문자 스트림 생성
            while ((c = in.read()) != -1) {
                fout.write(c); // 키보드로부터 입력받은 문자를 파일에 저장
            }
            in.close();
            fout.close();
        } catch (IOException e) {
            System.out.println("입출력  오류");
        }
    }
}