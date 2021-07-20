package com.kh.control.exercise;

import java.util.Scanner;

public class Exercise_Switch {
	
	public void exercise1() {
		// 1 ~ 3 사이의 정수를 입력받아
		// 1인 경우 빨간색 입니다.
		// 2인 경우 파란색 입니다.
		// 3인 경우 초록색 입니다.
		// 그외의 정수를 입력할 경우 잘못입력하셨습니다를 출력하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int iNum = sc.nextInt();
	    switch(iNum) {
	    case 1 :
	    	System.out.println("빨간색 입니다.");
	    	break;
	    case 2 : 
	    	System.out.println("파란색 입니다.");
	    	break;
	    case 3 :
	    	System.out.println("초록색입니다.");
	    	break;
	    	default :
	    	System.out.println("잘못입력하셨습니다.");
			
		}
		
	}
	
	public void exercise2() {
		/*
		 * 정수 두개와 연산기호 문자 1개를 입력받아서
		 * 연산기호문자(+,-,*,/)에 해당하는 계산을 수행하고 출력하세요.
		 * 단, 그 외의 문자를 입력할 경우 연산자를 잘못입력하셨습니다를 출력하세요
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력해주세요 : ");
		int iNum2 = sc.nextInt();
		System.out.print("두번째 정수를 입력해주세요 : ");
		int iNum3 = sc.nextInt();
		System.out.print("연산기호를 입력해주세요 : ");
		char ch = sc.next().charAt(0);
		
//		switch (ch) {
//		case '+' :
//			System.out.println("값은 : " + (iNum2 + iNum3) + "입니다");
//			break;
//		case '-' :
//			System.out.println("값은 : " + (iNum2 - iNum3) + "입니다");
//			break;
//		case '*' :
//			System.out.println("값은 : " + (iNum2 * iNum3) + "입니다");
//			break;
//		case '/' :
//			System.out.println("값은 : " + (iNum2 / iNum3) + "입니다");
//			break;
//			default : 
//				System.out.println("연산기호를 잘못 입력하셨습니다.");
		int result = 0;		
		switch (ch) {
		case '+' :
			result = iNum2 + iNum3;
			break;
		case '-' :
			result = iNum2 - iNum3;
			break;
		case '*' :
			result = iNum2 * iNum3;
			break;
		case '/' :
			result = iNum2 / iNum3;
			break;
		default : 
				System.out.println("연산기호를 잘못 입력하셨습니다.");
		}
		System.out.println("결과값은 : "+result+"입니다");
		
	}
	
	public void exercise3() {
		/*
		 * 1 ~ 12 사이의 숫자를 입력받아 해당하는 숫자 달의 마지막 날짜를 출력하세요.
		 * 그외의 숫자를 입력할 경우 1 ~ 12 사이의 숫자를 입력하세요를 출력하세요
		 * 
		 * 1월 ~ 12월까지 중 하나를 입력하세요 : 3
		 * 입력하신 월은 31일까지 입니다.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12월중 하나의 숫자를 적어주세요 : ");
		int month = sc.nextInt();
		
//		switch (month) {
//		case 1 :
//			System.out.println("입력하신 "+ month+"월은 31일까지 입니다.");
//			break;
//		case 2 :
//			System.out.println("입력하신 "+ month+"월은 28일까지 입니다.");
//			break;
//		case 3 :
//			System.out.println("입력하신 "+ month+"월은 31일까지 입니다.");
//			break;
//		case 4 :
//			System.out.println("입력하신 "+ month+"월은 30일까지 입니다.");
//			break;
//		case 5 :
//			System.out.println("입력하신 "+ month+"월은 31일까지 입니다.");
//			break;
//		case 6 :
//			System.out.println("입력하신 "+ month+"월은 30일까지 입니다.");
//			break;
//		case 7 :
//			System.out.println("입력하신 "+ month+"월은 31일까지 입니다.");
//			break;
//		case 8 :
//			System.out.println("입력하신 "+ month+"월은 31일까지 입니다.");
//			break;
//		case 9 :
//			System.out.println("입력하신 "+ month+"월은 30일까지 입니다.");
//			break;
//		case 10 :
//			System.out.println("입력하신 "+ month+"월은 31일까지 입니다.");
//			break;
//		case 11 :
//			System.out.println("입력하신 "+ month+"월은 30일까지 입니다.");
//			break;
//		case 12 :
//			System.out.println("입력하신 "+ month+"월은 31일까지 입니다.");
//			break;
//			default :
//				System.out.println("1월 ~ 12월까지중 입력해주세요.");
		
		
		switch (month) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			System.out.println("입력하신 수의 월은 31일입니다");
			break;
		case 2 :
			System.out.println("입력하신 수의 월은 28일또는 29일입니다");
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			System.out.println("입력하신 수의 월은 30일입니다");
			break;
			default :
				System.out.println("1월 ~ 12월까지중 입력해주세요.");
		}
		
		
		
	}
	

}
