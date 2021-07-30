package com.kh.firstjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDAO {
	public static void main(String[] args) {

		/*
		 * 1. 드라이버 등록
		 * 2. DBMS 연결 생성 
		 * 3. Statement 객체 생성 
		 * 4. SQL 전송 
		 * 5. 결과값 받기(ResultSet) 
		 * 6. 자원 해제(close())
		 */
		
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "STUDENT";
		String password = "STUDENT";
		String sql = "SELECT * FROM MEMBER";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Driver연결시 ClassNotFoundException을 항상 해줘야 한다.
			conn = DriverManager.getConnection(url, user, password);
			// DBMS연결시 SQLException을 항상 해줘야한다.
			// DriverManager.getConnection(String URL, String User, String Password)
			stmt = conn.createStatement();
			// getConnection메소드를 사용해여 statement메소드를 생성한다
			rset = stmt.executeQuery(sql);
			while(rset.next()) {
				System.out.println("회원 아이디 : " + rset.getString(1) +
						"\n회원 비밀번호 : " + rset.getString("MEMBER_PWD")
						+ "\n회원 나이 : " + rset.getInt("MEMBER_AGE")
						+ "\n회원 이름 : " + rset.getString(3));
				// 첫번째 인덱스 즉, 첫번재 컬럼의 값을 가져온다
			}
			// resultSet은 select문에서만 사용한다(select문의 출력)
			// insert, update, delete에서는
			// executeQuery가 아닌 executeUpdate... 사용
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rset.close();
				stmt.close();
				conn.close(); // 항상 자원해제를 해줘야 한다
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
