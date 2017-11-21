/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package chap16;
import java.io.*;
import java.sql.*;

public class JDBC_Ex2 {
    public static void main (String[] args) {
        Connection conn;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver"); // MySQL 드라이버 로드
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root","1234"); // JDBC 연결
            System.out.println("DB 연결 완료");
            stmt = conn.createStatement(); // SQL문 처리용 Statement 객체 생성
            ResultSet srs = stmt.executeQuery("select * from student"); // 테이블의 모든 데이터 검색
            printData(srs, "name", "id", "dept");
            srs = stmt.executeQuery("select name, id, dept from student where name='이기자'"); // name이 "이기자"인 레코드만 검색
            printData(srs, "name", "id", "dept");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC 드라이버 로드 오류");
        } catch (SQLException e) {
            System.out.println("SQL 실행오류");
        }
    }
    // 레코드의 각 열의 값 화면에 출력
    private static void printData(ResultSet srs, String col1, String col2, String col3) throws SQLException {
        while (srs.next()) {
            if (!col1.equals(""))
                System.out.print(srs.getString("name"));
            if (!col2.equals(""))
                System.out.print("\t|\t" + srs.getString("id"));
            if (!col3.equals(""))
                System.out.println("\t|\t" + srs.getString("dept"));
            else
                System.out.println();
        }
    }
}