package com.kh.member.model.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.kh.common.JDBCTemplate;
import com.kh.member.model.dao.MemberDAO;
import com.kh.member.model.vo.Member;

public class MemberService {
	
	private JDBCTemplate prepareConnection;
	// JDBCTemplate를 prepareConnection으로 멤버변수 저장해주고
	
	public MemberService() {
		prepareConnection = JDBCTemplate.getConnection();
		// JDBCTemplate 객체는 template에서 한번만 생성하고 prepareConnection메소드로 사용 
		// getConnection(null이면 new JDBCTemaplte생성)  
		// JDBCTeamplate타입의 멤버변수로 저장해준 prepareConnection에다가 getConnection메소드 주소를 저장
	
	}
	
	// prepareConnection.createConnection() 의 정의
	// 객체가 null이면 JDBCTemplate를 생성하여 createConnection을 실행하고
	// 객체가 이미 생성이 되어있는 상황이면 객체를 생성하지 않고 유지하며 사용(새로운 메모리 할당 방지)

	public List<Member> printAll() {
		MemberDAO mDao = new MemberDAO();
		List<Member> mList = null;
		Connection conn = null;
		try {
			conn = prepareConnection.createConnection();
			// 객체 생성안하고 getConnection메소드를 활용
			mList = mDao.selectAllList(conn);
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		return mList;
	}

	public Member printOneById(String memberId) {
		MemberDAO mDao = new MemberDAO();
		Member mOne = null;
		Connection conn = null;
		
		try {
			conn = prepareConnection.createConnection();
			mOne = mDao.selectOneById(memberId, conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		
		return mOne;
	}

	public List<Member> printMembersByName(String memberName) {
		
		MemberDAO mDao = new MemberDAO();
		List<Member> mList = null;
		Connection conn = null;
		
		try {
			conn = prepareConnection.createConnection();
			mList = mDao.selectListByName(memberName, conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		
		
		return mList;
	}

	public int inputMember(Member member) {
		MemberDAO mDao = new MemberDAO();
		Connection conn = null;
		int result = 0;
		
		try {
			conn = prepareConnection.createConnection();
			result = mDao.inputMember(member, conn);
			if(result > 0) {
				JDBCTemplate.commit(conn);
				// JDBCTemplate에서 connection.setAutoCommit(false) -> 자동커밋 false
				// 해주었기 때문에 service클래스에서 commit과 rollback을 해준다
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

	public int modifyMember(Member member) {
		
		MemberDAO mDao = new MemberDAO();
		Connection conn = null; 
		int result = 0;
		
		try {
			conn = prepareConnection.createConnection();
			result = mDao.updateMember(member, conn);
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
			conn = prepareConnection.createConnection();
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
