package org.kh.library.model.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import org.kh.library.common.JDBCTemplate;
import org.kh.library.model.dao.LibraryStoreLogic;
import org.kh.library.model.vo.Library;

public class LibraryServicel implements LibraryService{
	
	private JDBCTemplate prepareStatement;
	LibraryStoreLogic lDao = null;
	
	public LibraryServicel() {
		
		prepareStatement = JDBCTemplate.getConnection();
		lDao = new LibraryStoreLogic();
		
	}

	@Override
	public ArrayList<Library> selectAll() {
		
		Connection conn = null;
		ArrayList<Library> lList = null;
		
		try {
			conn = prepareStatement.createStatement();
			lList = lDao.selectList(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		
		return lList;
	}

	@Override
	public Library selectOne(String userId) {
		
		Connection conn = null;
		Library library = null;
		
		try {
			conn = prepareStatement.createStatement();
			library = lDao.selectOne(userId, conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}JDBCTemplate.close(conn);
		
		return library;
	}

	@Override
	public Library selectOneByName(String bookName) {
		
		Connection conn = null;
		Library library = null;
		
		try {
			conn = prepareStatement.createStatement();
			library = lDao.selectOneByName(bookName, conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}JDBCTemplate.close(conn);
		
		return library;
	}

	@Override
	public int insertLibrary(Library library) {
		int result = 0;
		Connection conn = null;
		try {
			System.out.println(library.toString());
			conn = prepareStatement.createStatement();
			result = lDao.insertLibrary(library, conn);
			System.out.println(result);
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
