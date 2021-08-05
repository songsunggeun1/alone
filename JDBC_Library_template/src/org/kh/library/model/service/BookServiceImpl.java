package org.kh.library.model.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import org.kh.library.common.JDBCTemplate;
import org.kh.library.model.dao.BookStoreLogic;
import org.kh.library.model.vo.Book;

public class BookServiceImpl implements BookService{
	
	private JDBCTemplate prepareStatement;
	BookStoreLogic bDao = null;
	
	public BookServiceImpl() {
		
		prepareStatement = JDBCTemplate.getConnection();
		bDao = new BookStoreLogic();
		
	}

	@Override
	public ArrayList<Book> selectAllBook() {
		
		Connection conn = null;
		ArrayList<Book> printBook = null;
		
		try {
			conn = prepareStatement.createStatement();
			printBook = bDao.selectAllBook(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		
		return printBook;
	}

	@Override
	public Book selectBookOne(int bookNo) {
		
		Connection conn = null;
		Book book = null;
		
		try {
			conn = prepareStatement.createStatement();
			book = bDao.selectBookOne(bookNo, conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		
		return book;
	}

	@Override
	public int insertBook(Book book) {
		
		Connection conn = null;
		int result = 0;
		
		try {
			conn = prepareStatement.createStatement();
			result = bDao.insertBook(book, conn);
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

	@Override
	public int deleteBook(int bookNo) {
		
		Connection conn = null;
		int result = 0;
		
		try {
			conn = prepareStatement.createStatement();
			result = bDao.deleteBook(bookNo, conn);
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
