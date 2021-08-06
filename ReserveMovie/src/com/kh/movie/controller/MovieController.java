package com.kh.movie.controller;

import java.util.ArrayList;

import com.kh.movie.model.service.MovieService;
import com.kh.movie.model.vo.Movie;
import com.kh.movie.model.vo.Reserve;
import com.kh.movie.view.MovieView;

public class MovieController {
	
	MovieService mService = null;
	MovieView mView = null;
	
	public MovieController() {
		
		mService = new MovieService();
		mView = new MovieView();
		
	}

	public ArrayList<Movie> selectAll() {
		
		ArrayList<Movie> mList = mService.selectAll();
		
		return mList;
	}

	public void selectByOneMovie(int choice) {
		
		Movie movie = mService.selectByOneMovie(choice);
		mView.printMovieInfo(movie);
		
	}

	public void insertReservation(Reserve reserve) {
		
		MovieView mView = new MovieView();
		int result = mService.insertReservation(reserve);
		if(result > 0) {
			mView.displaySuccess("영화 예약 성공");
		}else {
			mView.displayError("영화 예약 실패");
		}
		
	}

	public ArrayList<Reserve> printAll() {
		
		ArrayList<Reserve> rList = mService.printAll();
		if(rList.isEmpty()) {
			mView.displayError("영화 예매내역 조회 실패");
		}
		
		return rList;
	}

	public void deleteMovie(int input) {
		
		int result = mService.deleteMovie(input);
		if(result > 0) {
			mView.displaySuccess("예매 취소 성공");
		}else {
			mView.displayError("예매 취소 실패");
		}
		
		
	}

}
