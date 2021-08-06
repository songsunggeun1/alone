package com.kh.movie.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.kh.movie.common.JDBCTemplate;
import com.kh.movie.model.vo.Movie;
import com.kh.movie.model.vo.Reserve;


public class MovieDAO {

	public ArrayList<Movie> selectAll(Connection conn) {
		
		ArrayList<Movie> mList = null;
		ResultSet rset = null;
		PreparedStatement pstmt = null;
		Movie movie = null;
		String sql = "SELECT MOVIE_NO, MOVIE_NAME FROM MOVIE";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			mList = new ArrayList<>();
			while(rset.next()) {
				movie = new Movie();
				movie.setMovieNo(rset.getInt("MOVIE_NO"));
				movie.setMovieName(rset.getString("MOVIE_NAME"));
				mList.add(movie);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		
		return mList;
	}

	public Movie selectByOneMovie(int choice, Connection conn) {
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		Movie movie = null;
		String sql = "SELECT * FROM MOVIE WHERE MOVIE_NO = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, choice);
			rset = pstmt.executeQuery();
			if(rset.next()) {
				movie = new Movie();
				movie.setMovieNo(rset.getInt("MOVIE_NO"));
				movie.setMovieName(rset.getString("MOVIE_NAME"));
				movie.setMovieInfo(rset.getString("MOVIE_INFO"));
				movie.setDisposableAge(rset.getString("DISPOSABLE_AGE"));
				movie.setShowtimes(rset.getString("SHOWTIMES"));
				movie.setGenre(rset.getString("GENRE"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		return movie;
	}

	public int insertReservation(Reserve reserve, Connection conn) {
		
		int result = 0;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO RESERVE VALUES(SEQ_RESERVE.NEXTVAL,?,?,?,?,?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, reserve.getMovieNo());
			pstmt.setInt(2, reserve.getMovieDate());
			pstmt.setString(3, reserve.getMovieTime());
			pstmt.setInt(4, reserve.getMovieCount());
			pstmt.setString(5, reserve.getMovieSeat());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(pstmt);
		}
		
		return result;
	}

	public ArrayList<Reserve> printAll(Connection conn) {
		
		ResultSet rset = null;
		PreparedStatement pstmt = null;
		ArrayList<Reserve> rList = null;
		String sql = "SELECT RESERVE_NO, MOVIE_NAME, MOVIE_DATE, MOVIE_TIME, MOVIE_COUNT, MOVIE_SEAT FROM RESERVE JOIN MOVIE USING(MOVIE_NO) ORDER BY RESERVE_NO";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			rList = new ArrayList<Reserve>();
			while(rset.next()) {
				Reserve reserve = new Reserve();
				reserve.setReserveNo(rset.getInt("RESERVE_NO"));
				reserve.setMovieName(rset.getString("MOVIE_NAME"));
				reserve.setMovieDate(rset.getInt("MOVIE_DATE"));
				reserve.setMovieTime(rset.getString("MOVIE_TIME"));
				reserve.setMovieCount(rset.getInt("MOVIE_COUNT"));
				reserve.setMovieSeat(rset.getString("MOVIE_SEAT"));
				rList.add(reserve);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(pstmt);
			JDBCTemplate.close(rset);
		}
		
		return rList;
	}

	public int deleteMovie(int input, Connection conn) {
		
		int result = 0;
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM RESERVE WHERE RESERVE_NO = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			System.out.println(input);
			pstmt.setInt(1, input);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(pstmt);
		}
		
		return result;
	}

}
