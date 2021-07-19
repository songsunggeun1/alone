package com.kh.operator;

import java.util.Scanner;

public class Exercise_Logical2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력한 문자 값이 대문자인지 확인하여 결과 출력하기");
		System.out.print("문자 하나 입력해주세요 : ");
		char ch = sc.next().charAt(0);
		boolean check = ('A'<=ch) && (ch<='Z');
		// 대문자 소문자 확인하는 방법
		// 아스키코드(숫자)로 판별 
		System.out.println("영어 대문자 확인 : " + check);
		//숫자를 입력해서 문자 출력하기
		System.out.print("숫자 하나 입력해주세요 : ");
		int input = sc.nextInt();
		System.out.println("문자로 변환 : " + (char)input);
		// 숫자로 입력해도 문자로 형변환을 시켜준다
		// 출력값 : 아스키코드로 변환해서 출력됨
		System.out.print("문자 하나 입력해주세요 : ");
		char ch2 = sc.next().charAt(0);
		System.out.println("숫자로 변환 : " + (int)ch2);
		
	}
	// 입력한 문자 값이 대문자인지 확인하여 결과 출력하기
	// 문자 하나 입력해주세요 : a
	// 영어 대문자 확인 : false

}
