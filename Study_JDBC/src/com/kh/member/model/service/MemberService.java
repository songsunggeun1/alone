package com.kh.member.model.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import com.kh.common.JDBCTemplate;
import com.kh.member.model.dao.MemberDAO;
import com.kh.member.model.vo.Member;

public class MemberService {
	
	private JDBCTemplate prepareConnection;
	
	public MemberService() {
		
		prepareConnection = JDBCTemplate.getConnection();
		
	}

	public ArrayList<Member> printAll() {
		
		MemberDAO mDao = new MemberDAO();
		Connection conn = null;
		ArrayList<Member> mList = null;
		
		try {
			conn = prepareConnection.createStatement();
			mList = mDao.printAll(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		return mList;
	}

	public Member printOneById(String memberId) {
		
		MemberDAO mDao = new MemberDAO();
		Connection conn = null;
		Member member = null;
		
		try {
			conn = prepareConnection.createStatement();
			member = mDao.printOneById(memberId, conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		
		return member;
	}

	public ArrayList<Member> printOneByName(String memberName) {
		
		Connection conn = null;
		MemberDAO mDao = new MemberDAO();
		ArrayList<Member> nameList = null;
		
		
		try {
			conn = prepareConnection.createStatement();
			nameList = mDao.printOneByName(memberName, conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		
		return nameList;
	}

	public int inputMember(Member member) {
		
		Connection conn = null;
		MemberDAO mDao = new MemberDAO();
		int result = 0;
		
		try {
			conn = prepareConnection.createStatement();
			result = mDao.inputMember(member, conn);
			if(result > 0) {
				JDBCTemplate.commit(conn);
			}else {
				JDBCTemplate.rollback(conn);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		
		return result;
	}

	public int modifyMember(Member modifyMember) {
		
		MemberDAO mDao = new MemberDAO();
		Connection conn = null;
		int result = 0;
		
		try {
			conn = prepareConnection.createStatement();
			result = mDao.modifyMember(modifyMember, conn);
			if(result > 0) {
				JDBCTemplate.commit(conn);
			}else {
				JDBCTemplate.rollback(conn);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		
		return result;
	}

	public int deleteMember(String deleteId) {
		
		MemberDAO mDao = new MemberDAO();
		Connection conn = null;
		int result = 0;
		
		
		try {
			conn = prepareConnection.createStatement();
			result = mDao.deleteMember(deleteId, conn);
			if(result > 0) {
				JDBCTemplate.commit(conn);
			}else {
				JDBCTemplate.rollback(conn);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		
		return result;
	}
}
