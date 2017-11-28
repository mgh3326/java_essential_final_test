package chap16;

import java.io.*;
import java.net.*;

public class URLConnectionWriter {
    public static void main(String[] args) {
        try {
            URL aURL = new URL("http://httpbin.org/post"); // POST가 가능한 사이트 URL 객체 생성
            URLConnection uc = aURL.openConnection(); // URLConnection 객체 생성
            uc.setDoOutput(true); // 출력 모드 설정
            OutputStreamWriter out = new OutputStreamWriter(uc.getOutputStream()); // 출력 스트림 생성
            out.write("Firstname=Kitae&Lastname=Hwang"); // 서버에 데이터 보내기
            out.close();
            BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream())); // 서버에서 응답을 읽기 위한 입력 스트림 생성
            String inputLine;
            while ((inputLine = in.readLine()) != null) // 한행 씩 읽음
                System.out.println(inputLine);
            in.close();
        } catch (IOException e) {
            System.out.println("URL에 데이터를 입출력 중에 오류가 발생했습니다.");
        }
    }
}
