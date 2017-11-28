package chap16;

import java.io.*;
import java.net.*;

public class URLConnectionReader {
    public static void main(String[] args) {
        try {
            URL aURL = new URL("http://www.kw.ac.kr"); // URL 객체 생성//예제로 되있는 다음이 제공을 안해서 바꿈
            URLConnection uc = aURL.openConnection(); // URL 객체에서 URLConnection 객체 생성
            BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream())); // 입력 스트림 생성
            String inputLine;

            while ((inputLine = in.readLine()) != null) // 한행 씩 읽음
                System.out.println(inputLine);
            in.close();//끝나서 스트림 닫음
        } catch (IOException e) {
            System.out.println("URL에서 데이터를 읽는 중 오류가 발생했습니다.");
        }
    }
}
