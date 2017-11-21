/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap13;

import java.io.*;

public class FileSize {//실습문제 13-3

    public static void main(String[] args) {
        File f = new File("c:\\");
        File [] files = f.listFiles();
        long big = 0;
        File file =null;
        for(int i=0; i<files.length; i++) {
            File a = files[i];
            if(!a.isFile())
                continue;
            long size = a.length();
            if(big < size) {
                big = size;
                file = a;
            }
        }

        if(file == null)
            System.out.println("파일은 없습니다");
        else
            System.out.println("가장 큰 파일은 " + file.getPath() + " " + big + "바이트");
    }

}
