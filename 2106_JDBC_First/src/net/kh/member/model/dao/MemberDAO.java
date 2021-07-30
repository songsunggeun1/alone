package net.kh.member.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import net.kh.member.model.vo.Member;

public class MemberDAO {
	// Member를 사용하여 데이터를 가져옴
	
	private  final String url = "jdbc:oracle:thin:@localhost:1521:XE";
	private final String user = "STUDENT";
	private final String password = "STUDENT";
	// 자주 쓰이기 때문에 멤버변수(상수)로 할당
	
	public int insertMember(Member member) {
		Connection conn = null;
		Statement stmt = null;
		int result = 0;
		// 테이블형태의 데이터 (커서)가 움직이면서 다음값이 있으면 true, 없으면 false
		String sql = "INSERT INTO MEMBER VALUES("
		+ "'" + member.getMemberId() + "',"
		+ "'" + member.getMemberPwd() + "',"
		+ "'" + member.getMemberName() + "',"
		+ "'" + member.getMemberGender() + "',"
		+ "'" + member.getMemberAge() + "'," // 자료형이 number라 ''를 안써도 되지만 통일성을 위해 
		+ "'" + member.getMemberEmail() + "',"
		+ "'" + member.getMemberPhone() + "',"
		+ "'" + member.getMemberAddress() + "',"
		+ "'" + member.getMemberHobby() + "',"
		+"DEFAULT)";
		
		// query문 
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			// 성공하면 result값이 1이 될것이고, 실패하면 0
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

	
	public ArrayList<Member> printAll() {
	// ArrayList로 반환형을 바꿔줌 / controller에서 부른메소드
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		ArrayList<Member> mList = null;
		String sql = "SELECT * FROM MEMBER";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			// DB를 쓰려고 : sql문을 전송하기 위해서(statement)
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);
			mList = new ArrayList<Member>();
			while(rset.next()) {
				Member member = new Member();
				member.setMemberId(rset.getString("MEMBER_ID"));
				member.setMemberPwd(rset.getString("MEMBER_PWD"));
				member.setMemberName(rset.getString("MEMBER_NAME"));
				member.setMemberGender(rset.getString("MEMBER_GENDER"));
				member.setMemberAge(rset.getInt("MEMBER_AGE"));
				member.setMemberEmail(rset.getString("MEMBER_EMAIL"));
				member.setMemberPhone(rset.getString("MEMBER_PHONE"));
				member.setMemberAddress(rset.getString("MEMBER_ADDRESS"));
				member.setMemberHobby(rset.getString("MEMBER_HOBBY"));
				member.setEnrollDate(rset.getDate("ENROLL_DATE"));
				mList.add(member);
				// rset에서 가져온 정보를 생성한 member에 담은 후 add로 추가
				// while(rset.next()) 반복문이 실행되는동안 반복진행
				
				// -바로 출력할때-
				//System.out.println("이름 : " + rset.getString("MEMBER_NAME"));
				//System.out.println("이름 : " + rset.getInt("MEMBER_AGE"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rset.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return mList;
	}

	public Member printOneById(String memberId) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		Member member = null; // 전체출력이 아니라  조회한 한 정보이기 때문에 객체만 생성
		String sql = "SELECT * FROM MEMBER WHERE MEMBER_ID = '" + memberId + "'";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);
			if(rset.next()) {
				member = new Member();
				member.setMemberId(rset.getString("MEMBER_ID"));
				member.setMemberPwd(rset.getString("MEMBER_PWD"));
				member.setMemberName(rset.getString("MEMBER_NAME"));
				member.setMemberGender(rset.getString("MEMBER_GENDER"));
				member.setMemberAge(rset.getInt("MEMBER_AGE"));
				member.setMemberEmail(rset.getString("MEMBER_EMAIL"));
				member.setMemberPhone(rset.getString("MEMBER_PHONE"));
				member.setMemberAddress(rset.getString("MEMBER_ADDRESS"));
				member.setMemberHobby(rset.getString("MEMBER_HOBBY"));
				member.setEnrollDate(rset.getDate("ENROLL_DATE"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				stmt.close();
				rset.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return member;
	}


	public List<Member> printOneByName(String memberName) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		String sql = "SELECT * FROM MEMBER WHERE MEMBER_NAME = '" + memberName + "'";
//		String sql = "SELECT * FROM MEMBER WHERE MEMBER_NAME Like '%" + memberName + "%'";
		ArrayList <Member> nameList = null;
		Member member = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);
			nameList = new ArrayList<Member>();
			while(rset.next()) { 
			// 리스트이기 때문에 if가 아니라 while로 해야한다 if로 하면 동명이인이 있어도 한명밖에 입력이 안된다
				member = new Member();
				member.setMemberId(rset.getString("MEMBER_ID"));
				member.setMemberPwd(rset.getString("MEMBER_PWD"));
				member.setMemberName(rset.getString("MEMBER_NAME"));
				member.setMemberGender(rset.getString("MEMBER_GENDER"));
				member.setMemberAge(rset.getInt("MEMBER_AGE"));
				member.setMemberEmail(rset.getString("MEMBER_EMAIL"));
				member.setMemberPhone(rset.getString("MEMBER_PHONE"));
				member.setMemberAddress(rset.getString("MEMBER_ADDRESS"));
				member.setMemberHobby(rset.getString("MEMBER_HOBBY"));
				member.setEnrollDate(rset.getDate("ENROLL_DATE"));
				nameList.add(member);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				stmt.close();
				rset.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return nameList;
	}


	public int deleteMember(String memberId) {
		Connection conn = null;
		Statement stmt = null;
		int result = 0;
		String sql = "DELETE FROM MEMBER WHERE MEMBER_ID = '" + memberId + "'";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}


	public int updateMember(Member member) {
		Connection conn = null;
		Statement stmt = null;
		int result = 0;
		String sql = "UPDATE MEMBER SET MEMBER_PWD = '" + member.getMemberPwd() + "',"
				+ "MEMBER_EMAIL = '" + member.getMemberEmail() + "',"
				+ "MEMBER_PHONE = '" + member.getMemberPhone() + "',"
				+ "MEMBER_ADDRESS = '" + member.getMemberAddress() + "',"
				+ "MEMBER_HOBBY = '" + member.getMemberHobby() + "'"
				+ "WHERE MEMBER_ID = '" + member.getMemberId() + "'";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

}
