package com.kh.member.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.kh.member.model.vo.Member;

public class MemberDAO {

	public List<Member> selectAllList(Connection conn) {

		Statement stmt = null;
		ResultSet rset = null;
		String query = "SELECT * FROM MEMBER ORDER BY ENROLL_DATE";
		ArrayList<Member> list = null;

		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			list = new ArrayList<Member>();
			while (rset.next()) {
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
				list.add(member);
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}

		return list;
	}

	public Member selectOneById(String memberId, Connection conn) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Member member = null;
		String query = "SELECT * FROM MEMBER WHERE MEMBER_ID = ?";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, memberId);
			rset = pstmt.executeQuery();
			if (rset.next()) {
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
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return member;
	}

	public List<Member> selectListByName(String memberName, Connection conn) {

		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<Member> nameList = null;
		String query = "SELECT * FROM MEMBER WHERE MEMBER_NAME LIKE ?";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, "%" + memberName + "%");
			rset = pstmt.executeQuery();
			nameList = new ArrayList<>();
			while (rset.next()) {
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
				nameList.add(member);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return nameList;
	}

	public int inputMember(Member member, Connection conn) {

		PreparedStatement pstmt = null;
		String query = "INSERT INTO MEMBER VALUES(?,?,?,?,?,?,?,?,?,DEFAULT)";
		int result = 0;

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPwd());
			pstmt.setString(3, member.getMemberName());
			pstmt.setString(4, member.getMemberGender());
			pstmt.setInt(5, member.getMemberAge());
			pstmt.setString(6, member.getMemberEmail());
			pstmt.setString(7, member.getMemberPhone());
			pstmt.setString(8, member.getMemberAddress());
			pstmt.setString(9, member.getMemberHobby());
			result = pstmt.executeUpdate(); // 실행문 항상 인지
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	public int updateMember(Member member, Connection conn) {

		PreparedStatement pstmt = null;
		int result = 0;
		String query = "UPDATE MEMBER SET MEMBER_PWD = ?, MEMBER_EMAIL = ?, MEMBER_PHONE = ?, MEMBER_ADDRESS = ?, MEMBER_HOBBY = ? WHERE MEMBER_ID = ?";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getMemberPwd());
			pstmt.setString(2, member.getMemberEmail());
			pstmt.setString(3, member.getMemberPhone());
			pstmt.setString(4, member.getMemberAddress());
			pstmt.setString(5, member.getMemberHobby());
			pstmt.setString(6, member.getMemberId());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int deleteMember(String deleteId, Connection conn) {

		PreparedStatement pstmt = null;
		String sql = "DELETE FROM MEMBER WHERE MEMBER_ID = ?";
		int result = 0;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, deleteId);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

}
