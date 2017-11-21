/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap13;

import java.io.*;

public class BinaryCopy {
    public static void main(String[] args) {
        File src = new File("c:\\Users\\Public\\Pictures\\Sample Pictures\\desert.jpg"); // 원본 파일
        File dest = new File("c:\\tmp\\desert.jpg"); // 복사 파일

        int c;
        try {
            FileInputStream fi = new FileInputStream(src);  // 파일 입력 바이트 스트림 생성
            FileOutputStream fo = new FileOutputStream(dest); // 파일 출력 바이트 스트림 생성
            while((c = fi.read()) != -1) {//문자 하나 읽고 << fr.read()는 파일 끝을 만나면 -1 리턴
                fo.write((byte)c);// 문자 하나 쓰고
            }
            fi.close();
            fo.close();
            System.out.println(src.getPath()+ "를 " + dest.getPath()+ "로 복사하였습니다.");
        } catch (IOException e) {
            System.out.println("파일 복사 오류");
        }
    }
}
//예제 13-7 실행화면
/*
파일이 없는 경우

파일 복사 오류

파일이 있는 경우

c:\Users\Public\Pictures\Sample Pictures\desert.jpg를 c:\tmp\desert.jpg로 복사하였습니다.

 */