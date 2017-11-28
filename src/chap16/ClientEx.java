package chap16;

import java.io.*;
import java.net.*;

public class ClientEx {
    public static void main(String[] args) {
        BufferedReader in = null;
        BufferedReader stin = null;
        BufferedWriter out = null;
        Socket socket = null;
        try {
            socket = new Socket("localhost", 9999); // 클라이언트 소켓 생성
            in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 서버로부터의 입력 스트림
            stin = new BufferedReader(new InputStreamReader(System.in)); // 키보드로부터의 입력 스트림
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); // 서버로의 출력 스트림
            String outputMessage;
            while (true) {
                outputMessage = stin.readLine(); // 키보드에서 한 행의 문자열 읽음
                if (outputMessage.equalsIgnoreCase("bye")) { // "bye"가 입력되면 메시지 전송 후 연결 종료
                    //equalsIgnoreCase 대소문자 구별없이 상관없이 bye만 들어가면 처리되도록 하는 메소드
                    out.write(outputMessage);
                    out.flush();
                    break;
                }
                out.write("클라이언트>"+outputMessage+"\n"); // 키보드에서 읽은 문자열 전송
                out.flush();
                String inputMessage = in.readLine(); // 서버에서 한 행의 문자열 읽음
                System.out.println(inputMessage); // 서버가 보낸 메시지 화면에 출력
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {//finally는 무조건 들어 갈때 사용됨.
            try {
                socket.close(); // 클라이언트 소켓 닫기
            } catch (IOException e) {
                System.out.println("서버와 채팅 중 오류가 발생했습니다.");
            }
        }
    }
}