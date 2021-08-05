package org.kh.library.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.kh.library.common.JDBCTemplate;
import org.kh.library.model.vo.Book;

public class BookStoreLogic implements BookStore{

	@Override
	public ArrayList<Book> selectAllBook(Connection conn) {
		
		PreparedStatement pstmt = null;
		String sql = "SELECT * FROM BOOK";
		ArrayList<Book> printBook = null;
		ResultSet rset = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			printBook = new ArrayList<>();
			while(rset.next()) {
				Book book = new Book();
				book.setBookNo(rset.getInt("BOOK_NO"));
				book.setBookName(rset.getString("BOOK_NAME"));
				book.setBookWriter(rset.getString("BOOK_WRITER"));
				book.setBookPrice(rset.getInt("BOOK_PRICE"));
				book.setPublisher(rset.getString("PUBLISHER"));
				book.setGenre(rset.getString("GENRE"));
				printBook.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(pstmt);
			JDBCTemplate.close(rset);
		}
		return printBook;
	}

	@Override
	public Book selectBookOne(int bookNo, Connection conn) {
		
		Statement stmt = null;
		Book book = null;
		ResultSet rset = null;
		String sql = "SELECT * FROM BOOK WHERE BOOK_NO = '" + bookNo + "'";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);
			if(rset.next()) {
				book = new Book();
				book.setBookNo(rset.getInt("BOOK_NO"));
				book.setBookName(rset.getString("BOOK_NAME"));
				book.setBookWriter(rset.getString("BOOK_WRITER"));
				book.setBookPrice(rset.getInt("BOOK_PRICE"));
				book.setPublisher(rset.getString("PUBLISHER"));
				book.setGenre(rset.getString("GENRE"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(stmt);
		}
		
		return book;
	}

	@Override
	public int insertBook(Book book, Connection conn) {
		
		PreparedStatement pstmt = null;
		int result = 0;
		String sql = "INSERT INTO BOOK VALUES((SELECT MAX(BOOK_NO)+1 FROM BOOK),?,?,?,?,?)";
		
		
		try {
			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, "(SELECT MAX(BOOK_NO)+1 FROM BOOK)");
//			pstmt.setInt(1, book.getBookNo());
			pstmt.setString(1, book.getBookName());
			pstmt.setString(2, book.getBookWriter());
			pstmt.setInt(3, book.getBookPrice());
			pstmt.setString(4, book.getPublisher());
			pstmt.setString(5, book.getGenre());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(pstmt);
		}
		return result;
	}

	@Override
	public int deleteBook(int bookNo, Connection conn) {
		
		Statement stmt = null;
		int result = 0;
		String sql = "DELETE FROM BOOK WHERE BOOK_NO = '" + bookNo + "'";
		
		try {
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(stmt);
		}
		return result;
	}

}
