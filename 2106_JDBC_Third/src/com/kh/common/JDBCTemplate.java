package com.kh.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTemplate {
	
	private static JDBCTemplate instance; // 현재는 null인상태
	// static -> new 객체 생성을 안해도 클래스에서 사용할수 있는 메소드
	// 새로운 객체를 계속 생성해서 사용하는 것이 아니라 하나의 객체만 생성하여 사용하기 위함
	// 한번 만들어놓은 객체를 계속 사용하기 위해서 DB의 접속 과부하방지
	// static을 안하고 getInstance()로 사용하기도 한다
	// 객체를 생성한다는 자체가(메모리할당) 메모리를 쓰는거기 때문
	public static JDBCTemplate getConnection() { // 싱글톤 패턴
		if(instance == null) {
			instance = new JDBCTemplate(); // instance가 null이면 JDBCTemplate객체를 딱 한번만 생성해라
		}
		return instance;
	}
	
	public JDBCTemplate() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	public Connection createConnection() throws SQLException {
		
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "STUDENT";
		String password = "STUDENT";
		
		Connection connection = DriverManager.getConnection(url, user, password);
		connection.setAutoCommit(false); 
		// 자동으로 insert,update,delete를 않하겠다
		// 자동으로 commit 되는것을 끄겠다
		
		return connection;
	}
}
	