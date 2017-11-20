/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap13;

import java.io.*;

public class FileOutputStreamEx {
    public static void main(String[] args) {
        byte b[] = {7,51,3,4,-1,24};

        try {
            FileOutputStream fout = new FileOutputStream("c:\\tmp/test.out");
            for(int i=0;  i<b.length; i++)
                fout.write(b[i]); // 배열 b의 수를 바이너리 그대로 기록
            fout.close();
        } catch(IOException e) { }
        System.out.println("c:\\test.out을 저장하였습니다.");
    }
}