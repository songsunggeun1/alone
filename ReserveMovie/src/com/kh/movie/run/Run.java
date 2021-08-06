package com.kh.movie.run;

import java.util.ArrayList;

import com.kh.movie.controller.MovieController;
import com.kh.movie.model.vo.Movie;
import com.kh.movie.model.vo.Reserve;
import com.kh.movie.view.MovieView;

public class Run {
	
	public static void main(String [] args) {
		
		MovieView mView = new MovieView();
		MovieController mCtrl = new MovieController();
		
		done:
		while(true) {
			int input = mView.mainMenu();
			switch(input) {
			case 1:
				ArrayList<Movie> mList = mCtrl.selectAll();
				mView.reserveMovie(mList);
				break;
			case 2:
				ArrayList<Reserve>rList = mCtrl.printAll();
				mView.printReservation(rList);
				mView.deleteReservation();
				break;
			case 3:
				ArrayList<Reserve>reserveList = mCtrl.printAll();
				mView.printReservation(reserveList);
				break;
			case 4:
				break done;
			default :
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
			
		}
		System.out.println("프로그램을 종료합니다");
	}

}
