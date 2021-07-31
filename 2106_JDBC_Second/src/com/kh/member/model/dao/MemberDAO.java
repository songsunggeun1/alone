package com.kh.member.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.kh.member.model.vo.Member;

public class MemberDAO {
	
	private final String url = "jdbc:oracle:thin:@localhost:1521:XE";
	private final String user = "STUDENT";
	private final String password = "STUDENT";
	// url, user, password는 connection를 DB와 연동시킬때 계속 쓰기 때문에 멤버변수로 저장
	
	public MemberDAO() {}
	
	public int insertMember(Member member) {
		Connection conn = null; // DB와 연결하는 connection 객체 생성
		PreparedStatement pstmt = null; // sql명령어를 실행시키기 위한 객체 반복실행 부분에서는 미리 컴파일을 해주기 때문에 속도측에서 좋음
		int result = 0; // 전송결과의 성공(횟수) 및 실패를 확인하기 위한 result 변수 생성
		String sql = "INSERT INTO MEMBER VALUES(?,?,?,?,?,?,?,?,?,DEFAULT)";
		// 미리 컴파일된 정보를 preparedStatement를 활용해 DB로 전달할 출력문
		// 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // DB 드라이버와 연동
			conn = DriverManager.getConnection(url, user, password); // connection을 활용해 DB의 사용자와 접촉
			pstmt = conn.prepareStatement(sql); // sql문을 미리 컴파일 해줌으로서 정보가 다중일 때 유용
			pstmt.setString(1, member.getMemberId()); // (index, 전달할명령) ? -> 위치홀더 인덱스의 getter를 이용해 값을 지정
			pstmt.setString(2, member.getMemberPwd());
			pstmt.setString(3, member.getMemberName());
			pstmt.setString(4, member.getMemberGender());
			pstmt.setInt(5, member.getMemberAge());
			pstmt.setString(6, member.getMemberEmail());
			pstmt.setString(7, member.getMemberPhone());
			pstmt.setString(8, member.getMemberAddress());
			pstmt.setString(9, member.getMemberHobby());
			result = pstmt.executeUpdate(); // sql명령어를 실행시키는 명령어
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				pstmt.close(); // 자원해제
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
	
	public Member printOneById(String memberId) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String sql = "SELECT * FROM MEMBER WHERE MEMBER_ID = ?";
		Member member = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			// statement 같은 경우에는 실행할때 sql문이 필요했지만
			// prepareStatement 경우에는 statement를
			// 준비할때 sql문이 필요함. 미리 컴파일 하기 위해
			pstmt.setString(1, memberId); // (index, 전달할명령)
			// ?를 위치홀더라고 함
			// 쿼리문이 컴파일 된 후에 위치홀더 값을 셋팅해줌(setString() 이용)
			rset = pstmt.executeQuery();
			// statement와 다르게 executeQuery()메소드에
			// 전달값없이 바로 호출하여 실행하여 결과값을 rset에 넘겨줌
			if(rset.next()) {
				member = new Member(); // 정보를 담을 member객체 생성
				member.setMemberId(rset.getString("MEMBER_ID")); // resultSet의 getString을 이용해 "MEMBER_ID"(컬럼명??)의 정보입력 
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
				rset.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return member;
	}
	


	public List<Member> printMemberList() {
		
		Connection conn= null;
		Statement stmt = null;
		ResultSet rset = null;
		ArrayList<Member> mList = null;
		String sql = "SELECT * FROM MEMBER";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);
			mList = new ArrayList<Member>(); // 전체 출력이기때문에 단일이 아닌 2개 이상의 정보이기 때문에 list를 생성해 값을 저장
			while(rset.next()) { // if가 아닌 while문을 써주고 member객체 생성해서 값을 넣어준뒤 add 명령어로 list의 정보 추가
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
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				stmt.close();
				rset.close(); // 자원 해제 
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return mList;
	}



	public ArrayList<Member> printMembersByName(String memberName) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String sql = "SELECT * FROM MEMBER WHERE MEMBER_NAME LIKE ?";
		ArrayList<Member> nameList = null;
		Member member = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + memberName + "%");
			rset = pstmt.executeQuery(); // 
			nameList = new ArrayList<Member>();
			while(rset.next()) {
				member = new Member();
				member.setMemberId(rset.getString("MEMBER_ID")); // (index, 전달할명령)
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
				pstmt.close();
				rset.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return nameList;
	}



	public int deleteMember(String deleteId) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		String sql = "DELETE FROM MEMBER WHERE MEMBER_ID = ?";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql); // 쿼리문 컴파일
			pstmt.setString(1, deleteId); // 값 세팅
			result = pstmt.executeUpdate(); // 실행
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

	public int updateMember(Member member) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		String sql = "UPDATE MEMBER SET MEMBER_PWD = ?, MEMBER_EMAIL = ?, MEMBER_PHONE = ?, MEMBER_ADDRESS = ?, MEMBER_HOBBY = ?  WHERE MEMBER_ID = ?";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMemberPwd());
			pstmt.setString(2, member.getMemberEmail());
			pstmt.setString(3, member.getMemberPhone());
			pstmt.setString(4, member.getMemberAddress());
			pstmt.setString(5, member.getMemberHobby());
			pstmt.setString(6, member.getMemberId());
			result = pstmt.executeUpdate(); // 반드시 실행
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
}
