/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap13;

import java.io.*;

public class FileInputStreamEx {
    public static void main(String[] args) {
        byte b[] = new byte [6]; // 비어 있는 byte 배열
        try {
            // "c:\\test.out" 파일을 읽어 배열 b에 저장
            FileInputStream fin = new FileInputStream("c:\\tmp/test.out");
            int n=0, c;//<<fin.read(b);의 한 줄로 코딩할 수 있다.
            while((c = fin.read())!= -1) {
                b[n] = (byte)c; // 읽은 바이트를 배열에 저장
                n++;
            }
            // 배열 b의 바이트 값을 모두 화면에 출력
            System.out.println("c:\\test.out에서 읽은 배열을 출력합니다.");
            for(int i=0; i<b.length; i++) // 배열 b 출력
                System.out.print(b[i]+" ");
            System.out.println();

            fin.close();
        } catch(IOException e) { }
    }
}
//예제 13-4
//실행화면
/*
c:\test.out에서 읽은 배열을 출력합니다.
7 51 3 4 -1 24

 */
//예제 13-3 FileOutputStreamEx 에서 쓴 내용을 읽는다.