/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap13;

import java.io.*;

public class TextFileRead {//실습문제 13-1
    public static void main(String[] args) {
        try {
            FileReader fin = new FileReader("c:\\tmp\\sample.txt");
            int c;
            while((c=fin.read()) != -1) {
                System.out.print((char)c);
            }
            fin.close();
        }
        catch(IOException e) {
            System.out.println("파일 읽기 오류");
        }
    }
}
