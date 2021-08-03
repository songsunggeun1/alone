package com.kh.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTemplate {
	
	private static JDBCTemplate instance;
	
	
	
	public JDBCTemplate() { // 생성자에 DB와 직접 연결  - 생성자는 클래스 시작하면 가장 먼저 시작하는것이여서
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // driver 연결
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	
	public static JDBCTemplate getConnection() {
		
		if(instance == null) { // DB와 연동이 안되있으면 
			instance = new JDBCTemplate(); // 객체를 생성해준다 즉, DB랑 연동을 시키겠다
		}
		return instance; // 연동이 되어있으면 그냥 진행
	}
	
	
	
	public Connection createStatement() throws SQLException { // 컨넥션 연결(DB 사용자와 연결)
		
		String url = "jdbc:oracle:thin:@localhost:1521:XE"; 
		String user = "STUDENT";
		String password = "STUDENT";
		
		Connection connection = DriverManager.getConnection(url, user, password);
		connection.setAutoCommit(false);
		
		return connection;
		
	}
	
	public static void close(Connection conn) {
		
		try {
			if(conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void close(Statement stmt) {
		try {
			if(stmt != null && !stmt.isClosed()) {
				stmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(ResultSet rset) {
		try {
			if(rset != null && !rset.isClosed()) {
				rset.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void commit(Connection conn) {
		
		try {
			if(conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void rollback(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
