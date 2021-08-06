package com.kh.movie.model.vo;

public class Reserve {
	
	int movieNo;
	int movieDate;
	String movieTime;
	int movieCount;
	String movieSeat;
	String movieName;
	int reserveNo;
	
	


	public Reserve() {}
	
	
	public int getReserveNo() {
		return reserveNo;
	}
	
	
	public void setReserveNo(int reserveNo) {
		this.reserveNo = reserveNo;
	}
	
	public Reserve(int movieNo, int movieDate, String movieTime, int movieCount, String movieSeat) {
		super();
		this.movieNo = movieNo;
		this.movieDate = movieDate;
		this.movieTime = movieTime;
		this.movieCount = movieCount;
		this.movieSeat = movieSeat;
	}
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getMovieNo() {
		return movieNo;
	}
	public void setMovieNo(int movieNo) {
		this.movieNo = movieNo;
	}
	public int getMovieDate() {
		return movieDate;
	}
	public void setMovieDate(int movieDate) {
		this.movieDate = movieDate;
	}
	public String getMovieTime() {
		return movieTime;
	}
	public void setMovieTime(String movieTime) {
		this.movieTime = movieTime;
	}
	public int getMovieCount() {
		return movieCount;
	}
	public void setMovieCount(int movieCount) {
		this.movieCount = movieCount;
	}
	public String getMovieSeat() {
		return movieSeat;
	}
	public void setMovieSeat(String movieSeat) {
		this.movieSeat = movieSeat;
	}
	
	
	@Override
	public String toString() {
		return "Reserve [movieNo=" + movieNo + ", movieDate=" + movieDate + ", movieTime=" + movieTime + ", movieCount="
				+ movieCount + ", movieSeat=" + movieSeat + "]";
	}
	
	

}
