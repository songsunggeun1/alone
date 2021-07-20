package com.kh.control;

import java.util.Scanner;

public class Exam_Switch {
	public static void main(String [] args) {
		
		Scanner sc= new Scanner(System.in);
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
			break;
		default : 
			System.out.println("잘못 입력하셨습니다.");
		//if문이랑 똑같은 예시지만 처리가 빠르고 동작을 다 할 필요가없다.
		//choice = 1 일 경우 동작하고 바로 break;
		}
	}

}
