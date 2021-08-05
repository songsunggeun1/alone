package org.kh.library.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.kh.library.common.JDBCTemplate;
import org.kh.library.model.vo.Library;

public class LibraryStoreLogic implements LibraryStore{

	@Override
	public ArrayList<Library> selectList(Connection conn) {
		
		PreparedStatement pstmt = null;
		ArrayList<Library> lList = null;
		ResultSet rset = null;
		String sql = "SELECT * FROM LIBRARY";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			lList = new ArrayList<Library>();
			while(rset.next()) {
				Library library = new Library();
				library.setLeaseNo(rset.getInt("LEASE_NO"));
				library.setBookNo(rset.getInt("BOOK_NO"));
				library.setUserId(rset.getString("USER_ID"));
				library.setLeaseDate(rset.getDate("LEASE_DATE"));
				library.setReturnDate(rset.getDate("RETURN_DATE"));
				lList.add(library);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(pstmt);
			JDBCTemplate.close(rset);
		}
		
		return lList;
	}

	@Override
	public Library selectOne(String userId, Connection conn) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Library library = null;
		String sql = "SELECT LEASE_NO, USER_ID, USER_NAME, BOOK_NAME FROM LIBRARY JOIN CUSTOMER USING(USER_ID) JOIN BOOK USING(BOOK_NO) WHERE USER_ID = ?";
				
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			rset = pstmt.executeQuery();
			if(rset.next()) {
				library = new Library();
				library.setLeaseNo(rset.getInt("LEASE_NO"));
				library.setUserId(rset.getString("USER_ID"));
				library.setUserName(rset.getString("USER_NAME"));
				library.setBookName(rset.getString("BOOK_NAME"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(pstmt);
			JDBCTemplate.close(rset);
		}
		return library;
	}

	@Override
	public Library selectOneByName(String bookName, Connection conn) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Library library = null;
		String sql = "SELECT LEASE_NO, USER_ID, USER_NAME, BOOK_NAME FROM LIBRARY JOIN CUSTOMER USING(USER_ID) JOIN BOOK USING(BOOK_NO) WHERE BOOK_NAME = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bookName);
			rset = pstmt.executeQuery();
			if(rset.next()) {
				library = new Library();
				library.setLeaseNo(rset.getInt("LEASE_NO"));
				library.setUserId(rset.getString("USER_ID"));
				library.setUserName(rset.getString("USER_NAME"));
				library.setBookName(rset.getString("BOOK_NAME"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(pstmt);
			JDBCTemplate.close(rset);
		}
		return library;
	}

	

	@Override
	public int insertLibrary(Library library, Connection conn) {

		PreparedStatement pstmt = null;
//		Statement stmt = null;
		int result = 0;
		String sql = "INSERT INTO LIBRARY VALUES((SELECT MAX(LEASE_NO)+1 FROM LIBRARY), (SELECT BOOK_NO FROM BOOK WHERE BOOK_NAME = ?), ?, SYSDATE, SYSDATE+2)";
//		String sql = "INSERT INTO LIBRARY VALUES((SELECT MAX(LEASE_NO)+1 FROM LIBRARY), (SELECT BOOK_NO FROM BOOK WHERE BOOK_NAME = '"+ library.getBookName() +"'), '"+library.getUserId()+"', SYSDATE, SYSDATE+2)";
		
		try {
//			stmt = conn.createStatement();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, library.getBookName());
			pstmt.setString(2, library.getUserId());
//			result = stmt.executeUpdate(sql);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JDBCTemplate.close(pstmt);
		}
		return result;
	}
}
