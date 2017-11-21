/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap13;

import java.io.File;
public class FileClassExample {//<<디렉토리에 포함된 파일과 서브 디렉톨의 이름, 크기, 수정 시간을 출력하는 메소드
    // 디렉토리에 포함된 파일과 서브 디렉토리의 이름, 크기, 수정 시간을 출력하는 메소드
    public static void listDirectory(File dir) {
        System.out.println("-----" + dir.getPath() +  "의 서브 리스트 입니다.-----");

        File[] subFiles = dir.listFiles(); // 디렉토리에 포함된 파일과 디렉토리 이름의 리스트 얻기
        for (int i=0; i<subFiles.length; i++) { // subFiles 배열의 각 File에 대해 루프
            File f = subFiles[i];
            long t = f.lastModified(); // 마지막으로 수정된 시간
            System.out.print(f.getName());
            System.out.print("\t파일 크기: " + f.length()); // 파일 크기
            System.out.printf("\t수정한 시간: %tb %td %ta %tT\n",t, t, t, t); //포맷 출력
        }
    }

    public static void main(String[] args) {
        File f1 = new File("c:\\windows\\system.ini");
        System.out.println(f1.getPath() + ", " + f1.getParent() + ", " + f1.getName());

        String res="";
        if(f1.isFile()) res = "파일"; // 파일 타입이면
        else if(f1.isDirectory()) res = "디렉토리";// 디렉토리 타입이면
        System.out.println(f1.getPath() + "은 " + res + "입니다.");

        File f2 = new File("c:\\tmp\\java_sample"); // 새로 만들고자 하는 디렉터리
        if (!f2.exists()) { //f2 디렉터리가 존재하는지 검사
            f2.mkdir(); // 존재하지 않으면 디렉토리 생성
        }

        listDirectory(new File("c:\\tmp")); // c:\tmp에 있는 파일 리스트 출력
        f2.renameTo(new File("c:\\tmp\\javasample")); // java_sample -> javasample로 이름 변경
        listDirectory(new File("c:\\tmp")); // javasample로 변경한 후 리스트 출력
    }
}
//예제 13-5 실행 화면

/*
javasample	파일 크기: 0	수정한 시간: 11월 16 목 12:39:46
java_sample	파일 크기: 0	수정한 시간: 11월 20 월 18:05:51
system.txt	파일 크기: 219	수정한 시간: 11월 16 목 12:48:04 <<c:\\tmp의 파일과 서브 디렉터리 리스트
test.out	파일 크기: 6	수정한 시간: 11월 20 월 18:04:38
test.txt	파일 크기: 0	수정한 시간: 11월 20 월 17:59:32
-----c:\tmp의 서브 리스트 입니다.-----
javasample	파일 크기: 0	수정한 시간: 11월 16 목 12:39:46
java_sample	파일 크기: 0	수정한 시간: 11월 20 월 18:05:51
system.txt	파일 크기: 219	수정한 시간: 11월 16 목 12:48:04 <<java_sample을 javasample로 변경한 이후
test.out	파일 크기: 6	수정한 시간: 11월 20 월 18:04:38
test.txt	파일 크기: 0	수정한 시간: 11월 20 월 17:59:32

Process finished with exit code 0

 */