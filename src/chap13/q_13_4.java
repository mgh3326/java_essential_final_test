/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap13;import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class q_13_4 {
    public static void main(String[] args) {

        String line;
        Scanner sc= new Scanner(System.in);
        System.out.print("자바 소스 파일 이름을 입력하세요 >>");
        int index=0;
        try {
            String src = sc.nextLine();
            Scanner fileScanner = new Scanner(new FileReader(src));
            while (fileScanner.hasNext()) {//파일에 읽을 내용이 있는 동안
                line = fileScanner.nextLine();
                System.out.println(index++ + ": " +line);//라인 번호와 텍스트 파일을 한줄씩 출력합니다.
            }
        }
        catch (IOException e) {
            System.out.println("입출력 오류");

        }
    }
}
//실습문제 13-4