/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap16;
import java.net.*;

public class ParseURL {
    public static void main(String[] args) {
        URL opinion = null;
        URL homePage = null;
        try {
            homePage = new URL("http://news.hankooki.com:80"); // 절대 경로로 URL 객체 생성
            opinion = new URL(homePage,"opinion/editorial.htm"); // 상대 경로로 URL 객체 생성
        } catch (MalformedURLException e) {
            System.out.println("잘못된 URL입니다.");
        }
        System.out.println("protocol = " + opinion.getProtocol()); // 프로토콜 출력
        System.out.println("host = " + opinion.getHost()); // 호스트  이름 출력
        System.out.println("port = " + opinion.getPort()); // 포트 번호 출력
        System.out.println("path = " + opinion.getPath()); // 경로 부분 출력
        System.out.println("filename = " + opinion.getFile()); // 파일 이름 출력
    }
}
//예제 16-1