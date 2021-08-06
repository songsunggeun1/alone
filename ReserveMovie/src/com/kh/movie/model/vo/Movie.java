package com.kh.movie.model.vo;

public class Movie {
	
	int movieNo;
	String movieName;
	String movieInfo;
	String disposableAge;
	String showtimes;
	String genre;
	
	
	public int getMovieNo() {
		return movieNo;
	}
	public void setMovieNo(int movieNo) {
		this.movieNo = movieNo;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieInfo() {
		return movieInfo;
	}
	public void setMovieInfo(String movieInfo) {
		this.movieInfo = movieInfo;
	}
	public String getDisposableAge() {
		return disposableAge;
	}
	public void setDisposableAge(String disposableAge) {
		this.disposableAge = disposableAge;
	}
	public String getShowtimes() {
		return showtimes;
	}
	public void setShowtimes(String showtimes) {
		this.showtimes = showtimes;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	@Override
	public String toString() {
		return "Movie [movieNo=" + movieNo + ", movieName=" + movieName + ", movieInfo=" + movieInfo
				+ ", disposableAge=" + disposableAge + ", showtimes=" + showtimes + ", genre=" + genre + "]";
	}
	
	

}
