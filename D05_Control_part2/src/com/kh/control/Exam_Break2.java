package com.kh.control;

import java.util.Scanner;

public class Exam_Break2 {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		종료 : // switch문은 break;로 종료시키고 while 종료시킬때 명렁어
		while(true) {
			System.out.println("1. 입력");
			System.out.println("2. 수정");
			System.out.println("3. 조회");
			System.out.println("4. 삭제");
			System.out.println("0. 종료");
			System.out.print("메뉴 번호를 입력하세요 : ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				System.out.println("입력메뉴입니다.");
				break;
			case 2 :
				System.out.println("수정메뉴입니다.");
				break;
			case 3 :
				System.out.println("조회메뉴입니다.");
				break;
			case 4: 
				System.out.println("삭제메뉴입니다.");
				break;
			case 0 :
				System.out.println("프로그램을 종료합니다.");
				break 종료;
				// 여기에 종료;를 썼기때문에 0번을 입력할경우 while이 종료가 된다
				// switch문만이 아니라 while문까지 같이 종료시키는 명령어
			default : 
				System.out.println("잘못 입력하셨습니다.");
				System.out.println();
				
		/* while(true)무한반복문 안에 switch문(조건문)은
		 * break가 있어도 while(true)문은 계속 반복적으로 실행이 된다.
		 * 이 때는 종료 : , break 종료; 를 씀으로써 중지 시킬 수 있다. 
		 */
			
			}
		}
	}
}
