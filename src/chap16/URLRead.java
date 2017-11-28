/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap16;
import java.net.*;
import java.io.*;

public class URLRead {
	public static void main(String[] args) {
		try {//트라이문에 들어가서 URL 객체 만들어야함
			URL aURL = new URL("http://www.nate.com"); // URL 객체 생성
			BufferedReader in = new BufferedReader(new InputStreamReader(aURL.openStream())); // URL 객체에서 입력 스트림 생성
			//우리가 보기 위한 스트림 객체
			String inputLine;

			while ((inputLine = in.readLine()) != null) // 한행 씩 읽음
				System.out.println(inputLine);
			in.close();
		} catch (IOException e) {
			System.out.println("URL에서 데이터를 읽는 중 오류가 발생했습니다.");
		}
	}
}
//예제 16-2
//html 코드가 나온다.