package chap17;

import java.io.*;
import java.sql.*;

public class JDBC_Ex2 {
    public static void main (String[] args) {

        Connection conn;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver"); // MySQL 드라이버 로드
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookdb?autoReconnect=true&useSSL=false", "root", "1234"); // JDBC 연결
            System.out.println("DB 연결 완료");
            stmt = conn.createStatement(); // SQL문 처리용 Statement 객체 생성
//            stmt.executeUpdate("insert into book (id, title, publisher, author) values("+ 0 + ",'" + new String("엄마를 부탁해".getBytes())+ "', '" + new String("장비".getBytes())+ "', '" + new String("신경숙".getBytes()) + "');");
//            stmt.executeUpdate("insert into book (id, title, publisher, author) values("+ 1 + ",'" + new String("덕해옹주".getBytes())+ "', '" + new String("다산책방".getBytes())+ "', '" + new String("권비영".getBytes()) + "');");
//            stmt.executeUpdate("insert into book (id, title, publisher, author) values("+ 2 + ",'" + new String("IQ84".getBytes())+ "', '" + new String("문학동네".getBytes())+ "', '" + new String("무라카미 하루키".getBytes()) + "');");
//            printTable(stmt);
//
//            stmt.executeUpdate("update book set title='"+ new String("IQ84".getBytes())+ "', author='" + new String("김아무개".getBytes())+ "' where title='" + new String("IQ84".getBytes()) + "';");
//            printTable(stmt);

            stmt.executeUpdate("delete from book where title='"
                    + new String("IQ84".getBytes())+ "';");
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

        ResultSet srs = stmt.executeQuery("select * from book");
        while (srs.next()) {
            System.out.print(srs.getString("title"));
            System.out.print("\t|\t\t" + srs.getString("id"));
            System.out.print("\t|\t\t" + new String(srs.getString("publisher").getBytes()));
            System.out.println("\t|\t\t" + new String(srs.getString("author").getBytes()));

        }
    }
}