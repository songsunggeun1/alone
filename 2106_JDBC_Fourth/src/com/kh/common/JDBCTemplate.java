package com.kh.common;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCTemplate {
	
	private static JDBCTemplate instance; // 현재는 null인상태
	// static -> new 객체 생성을 안해도 클래스에서 사용할수 있는 메소드
	// 새로운 객체를 계속 생성해서 사용하는 것이 아니라 하나의 객체만 생성하여 사용하기 위함
	// 한번 만들어놓은 객체를 계속 사용하기 위해서 DB의 접속 과부하방지
	// static을 안하고 getInstance()로 사용하기도 한다
	// 객체를 생성한다는 자체가(메모리할당) 메모리를 쓰는거기 때문
	
	Properties prop = new Properties(); // 파일로 정보 보관
	
	public static JDBCTemplate getConnection() { // 싱글톤 패턴
		if(instance == null) {
			instance = new JDBCTemplate(); // instance가 null이면 JDBCTemplate객체를 딱 한번만 생성해라
		}
		return instance;
	}
	
	public JDBCTemplate() {
		try {
			FileReader fr = new FileReader("resources/driver.properties"); // FileReader를 이용해서 properties 파일과 접촉
			prop.load(fr);
			String driver = prop.getProperty("driver");
			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public Connection createConnection() throws SQLException {
		
		String url = prop.getProperty("url");
		String user = prop.getProperty("user");
		String password = prop.getProperty("password");
		
		Connection connection = DriverManager.getConnection(url, user, password);
		connection.setAutoCommit(false); 
		// 자동으로 insert,update,delete를 않하겠다
		// 자동으로 commit 되는것을 끄겠다
		
		return connection;
	}
	
	public static void close(Connection conn) { // 자원해제
		try {
			if(conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(Statement stmt) { // 자원해제
		
		try {
			if(stmt != null && !stmt.isClosed()) {
				stmt.close();
	// preparedStatement는 Statement의 상속클래스이기 때문에 statement를 이용해 자원해제를 할 수 있다
	// 다형성을 이용해 stmt를 닫은 close메소드로도 pstmt를 닫을 수 있다
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} 
		
	
	public static void close(ResultSet rset) { // 자원해제
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
			if(conn != null && !conn.isClosed())
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void rollback(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.rollback();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
	