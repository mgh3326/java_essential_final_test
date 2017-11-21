/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap13;

import java.io.File;

public class FileDelete {

    public static void main(String[] args) {//실습문제 13-5
        File dir = new File("c:\\tmp\\");
        File [] files = dir.listFiles(); // 디렉토리의 파일 리스트

        for(int i=0; i<files.length; i++) {
            String name = files[i].getName();
            int index = name.lastIndexOf('.'); // 파일명 문자열에서 제일 마지막에 있는 '.' 의 인덱스
            if(index == -1) // 찾을 수 없음
                continue;
            String ext = name.substring(index); // ext = ".txt"
            if(ext.equals(".txt")) {
                System.out.println(files[i].getPath() + " 삭제");
                files[i].delete();
            }
        }
    }

}
