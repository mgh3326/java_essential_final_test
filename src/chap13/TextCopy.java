/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap13;

import java.io.*;

public class TextCopy {
    public static void main(String[] args){
        File src = new File("c:\\windows\\system.ini"); // 원본 파일
        File dest = new File("c:\\tmp\\system.txt"); // 복사 파일

        int c;
        try {
            FileReader fr = new FileReader(src); // 파일 입력 문자 스트림에 연결
            FileWriter fw = new FileWriter(dest); // 파일 출력 문자 스트림에 연결
            while ((c = fr.read()) != -1) { // 문자 하나 읽고 << fr.read()는 파일 끝을 만나면 -1 리턴
                fw.write((char)c); // 문자 하나 쓰고
            }
            fr.close();
            fw.close();
            System.out.println(src.getPath()+ "를 " + dest.getPath()+ "로 복사하였습니다.");
        } catch (IOException e) {
            System.out.println("파일 복사 오류");
        }
    }
}
//예제 13-7 실행화면
/*
c:\windows\system.ini를 c:\tmp\system.txt로 복사하였습니다.

 */