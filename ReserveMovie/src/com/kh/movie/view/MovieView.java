package com.kh.movie.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.movie.controller.MovieController;
import com.kh.movie.model.vo.Movie;
import com.kh.movie.model.vo.Reserve;

public class MovieView {

	public int mainMenu() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("★롯데시네마에 오신것을 환영합니다★");
		System.out.println("무엇이 필요하신가요?");
		System.out.println("1. 영화 예매");
		System.out.println("2. 예매 취소");
		System.out.println("3. 예매 내역");
		System.out.println("4. 프로그램 종료");
		System.out.print("입력 : ");
		return sc.nextInt();
	}

	public void reserveMovie(ArrayList<Movie> mList) {
		
		Scanner sc = new Scanner(System.in);
		MovieController mCtrl = new MovieController();
		
		System.out.println("어떤 영화를 선택하시겠습니까?");
		for(int i = 0; i < mList.size(); i++) {
			System.out.println(mList.get(i).getMovieNo() + ". " + mList.get(i).getMovieName());
		}
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		System.out.print("영화 정보를 보시겠습니까? [y/n] : ");
		String input = sc.next();
		if(input.equalsIgnoreCase("y")) {
			mCtrl.selectByOneMovie(choice);
			System.out.print("이 영화를 예매하시겠습니까? [y/n] : ");
			String reserveInput = sc.next();
			if(reserveInput.equalsIgnoreCase("y")) {
				System.out.println("=====================================");
				System.out.println("예매를 진행합니다.");
				System.out.println("영화명 : " + mList.get(choice-1).getMovieName());
				System.out.println("=====================================");
				inputInfo(choice);
			}else {
				return;
			}
		}else {
			return;
		}
	}


	public void printMovieInfo(Movie movie) {
		System.out.println("===========================================");
		System.out.println(movie.getMovieName() + "을(를) 선택하셨습니다.");
		System.out.println(movie.getMovieInfo());
		System.out.println("장르 : " + movie.getGenre());
		System.out.println("상영시간 : " + movie.getShowtimes());
		System.out.println(movie.getDisposableAge());
		System.out.println("===========================================");
	}

	
	
	public void inputInfo(int movieNo) {
		
		Scanner sc = new Scanner(System.in);
		MovieController mCtrl = new MovieController();
		System.out.print("날짜를 지정해주세요 ex)20201103 : ");
		int movieDate = sc.nextInt();
		System.out.println();
		String movieTime = movieTime();
		System.out.println(movieTime+"시 영화를 선택하셨습니다.");
		System.out.println("===========================");
		System.out.println("인원을 입력해주세요 : ");
		int movieCount = sc.nextInt();
		System.out.println();
		String movieSeat = movieSeat(movieCount);
		Reserve reserve = new Reserve(movieNo, movieDate, movieTime, movieCount, movieSeat);
		mCtrl.insertReservation(reserve);
	}
	
	public void displaySuccess(String message) {
		System.out.println("서비스 요청처리 : " + message);
	}
	
	public void displayError(String message) {
		System.out.println("서비스 요청처리 실패 : " + message);
	}
	
	public String movieTime() {
		
		Scanner sc = new Scanner(System.in);
		String [] time = {"10:20 ~ 12:19", "14:50 ~ 16:49", "17:50 ~ 19:04", "19:20 ~ 21:29", "21:35 ~ 23:34", "23:50 ~ 25:49"};
		System.out.println("시간을 선택해주세요");
		System.out.println("1) " + time[0]+  "   " + "2) " + time[1]+  "   " + "3) " + time[2]);
		System.out.println("4) " + time[3]+  "   " + "5) " + time[4]+  "   " + "6) " + time[5]);
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		String input = time[choice-1];
		return input;
	}
	
	public String movieSeat(int movieCount) {
		
		String movieSeat = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("<<좌석 배치도>>");
		System.out.println("A 1 2 3 4 5");
		System.out.println("B 1 2 3 4 5");
		System.out.println("C 1 2 3 4 5");
		System.out.println("D 1 2 3 4 5");
		System.out.println("E 1 2 3 4 5");
		System.out.println("F 1 2 3 4 5");
		System.out.println("-------------");
		for(int i = 1; i <= movieCount; i++) {
			System.out.println(i+"번째 고객님의 좌석을 결정합니다.\n");
			System.out.println("몇번행에 앉으시겠습니까? (A ~ F)");
			movieSeat += sc.next();
			movieSeat += "행";
			System.out.println("몇번열에 앉으시겠습니까? (1 ~ 5)");
			movieSeat += sc.next();
			movieSeat += "열. ";
			
		}
		
		return movieSeat;
	}

	public void deleteReservation() {
		Scanner sc = new Scanner(System.in);
		MovieController mCtrl = new MovieController();
		System.out.println();
		System.out.print("취소할 영화의 예매번호를 입력해주세요 : ");
		int input = sc.nextInt();
		mCtrl.deleteMovie(input);
	}

	public void printReservation(ArrayList<Reserve> rList) {
		
		for(Reserve r : rList) {
			System.out.println("=================================");
			System.out.println("영화명 : " + r.getMovieName());
			System.out.println("예매번호 : " + r.getReserveNo());
			System.out.println("예매날짜 : " + r.getMovieDate());
			System.out.println("예매시간 : " + r.getMovieTime());
			System.out.println("예매인원 : " + r.getMovieCount());
			System.out.println("좌석 : " + r.getMovieSeat());
			System.out.println("=================================");
		}
		
	}

}


