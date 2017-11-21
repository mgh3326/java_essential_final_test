/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap13;

import java.io.*;
import java.util.*;

public class q_13_6 {
    public static void main(String[] args) {


        String line;
        Scanner sc = new Scanner(System.in);
        while (true) {
            int index=0;
            Vector<String> wordVector = new Vector<String>();//while문이 반복 될때마다 초기화 해줍니다.
            System.out.print("단어>>");
            String str = sc.next();
            if(str.equals("exit")) {
                System.out.println("종료합니다...");
                break;
            }
            try {
                Scanner fileScanner = new Scanner(new FileReader("words.txt"));
                while (fileScanner.hasNext()) {//파일에 읽을 내용이 있는 동안
                    line = fileScanner.next();
                    wordVector.add(line);//벡터에 파일의 내용을 하나씩 입력합니다.
                }
                for (int i = 0; i < wordVector.size(); i++) {
                    if (wordVector.get(i).startsWith(str))//String의 앞이 str로 시작하는 문자를 찾습니다.
                    {
                        System.out.println(wordVector.get(i));
                        index++;
                    }
                }

                if(index==0)//출력을 1개도 못했다면, 발견할 수 없음을 출력하도록 합니다.
                {
                    System.out.println("발견할 수 없음");
                }
            } catch (IOException e) {
                System.out.println("입출력 오류");

            }
        }
    }
}
