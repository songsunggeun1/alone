package com.kh.movie.model.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import com.kh.movie.common.JDBCTemplate;
import com.kh.movie.model.dao.MovieDAO;
import com.kh.movie.model.vo.Movie;
import com.kh.movie.model.vo.Reserve;

public class MovieService {
	
	private JDBCTemplate prepareConnection;
	private MovieDAO mDao = null;
	
	public MovieService () {
		
		prepareConnection = JDBCTemplate.getConnection();
		mDao = new MovieDAO();
	}
	

	public ArrayList<Movie> selectAll() {
		
		Connection conn = null;
		ArrayList<Movie> mList = null;
		
		try {
			conn = prepareConnection.createStatement();
			mList = mDao.selectAll(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		return mList;
	}


	public Movie selectByOneMovie(int choice) {
		
		Connection conn = null;
		Movie movie = null;
		
		try {
			conn = prepareConnection.createStatement();
			movie = mDao.selectByOneMovie(choice, conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		
		return movie;
	}


	public int insertReservation(Reserve reserve) {
		
		Connection conn = null;
		int result = 0;
		
		try {
			conn = prepareConnection.createStatement();
			result = mDao.insertReservation(reserve, conn);
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


	public ArrayList<Reserve> printAll() {
		
		Connection conn = null;
		ArrayList<Reserve> rList = null;
		
		try {
			conn = prepareConnection.createStatement();
			rList = mDao.printAll(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rList;
	}


	public int deleteMovie(int input) {
		
		Connection conn = null;
		int result = 0;
		
		try {
			conn = prepareConnection.createStatement();
			result = mDao.deleteMovie(input, conn);
			if(result > 0) {
				JDBCTemplate.commit(conn);
			}else {
				JDBCTemplate.rollback(conn);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
