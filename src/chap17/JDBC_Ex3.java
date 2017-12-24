package chap17;

import java.io.*;
import java.sql.*;

public class JDBC_Ex3 {
    public static void main (String[] args) {
        Connection conn;
        Statement stmt = null;

        try {
            Class.forName("com.mysql.jdbc.Driver"); // MySQL 드라이버 로드
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb?autoReconnect=true&useSSL=false", "root","1234"); // JDBC 연결
            System.out.println("DB 연결 완료");
            stmt = conn.createStatement(); // SQL문 처리용 Statement 객체 생성
            stmt.executeUpdate("insert into student (name, id, dept) values('" + new String("아무개".getBytes(), "ISO-8859-1") + "', '0893012', '" + new String("컴퓨터공학".getBytes(),"ISO-8859-1") +"');"); // 레코드 추가
            printTable(stmt);
            stmt.executeUpdate("update student set id='0189011' where name='"+ new String("아무개".getBytes(), "ISO-8859-1") +"'"); //데이터 수정
            printTable(stmt);
            stmt.executeUpdate("delete from student where name='"+ new String("아무개".getBytes(), "ISO-8859-1") +"'"); // 레코드 삭제
            printTable(stmt);
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC 드라이버 로드 오류");
        } catch (SQLException e) {
            System.out.println("SQL 실행 오류");
        } catch (UnsupportedEncodingException e) {
            System.out.println("지원되지 않는 인코딩 타입");
        }
    }
    // 레코드의 각 열의 값 화면에 출력
    private static void printTable(Statement stmt) throws SQLException, UnsupportedEncodingException {
        ResultSet srs = stmt.executeQuery("select * from student");
        while (srs.next()) {
            System.out.print(new String(srs.getString("name").getBytes("ISO-8859-1")));
            System.out.print("\t|\t" + srs.getString("id"));
            System.out.println("\t|\t" + new String(srs.getString("dept").getBytes("ISO-8859-1")));
        }
    }
}