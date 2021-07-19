package com.kh.operator;

import java.util.Scanner;

public class Exercise_Triple2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번 째 정수를 숫자를 적어주세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번 째 정수를 숫자를 적어주세요 : ");
		int num2 = sc.nextInt();
		
		System.out.print("연산자를 입력해주세요(+ or -) : ");
		char op = sc.next().charAt(0);
		// 1. 연산자가 +인가 ? 참이면 더하겠다 : 거짓이면 연산자가 -인지 확인하겠다.
		// 2. 연산자가 -인가? 참이면 빼겠다 : 거짓이면 잘못입력하셨습니다.
		//
        //String str = (op =='+') ? (num1 + num2)+"" : (op=='-') ? (num1 - num2)+"" : "잘못 입력하셨습니다.";
		  //정수를 스트링문자열로 바꾸는 방법 (정수)+""
		String str = (op =='+') ? String.valueOf(num1 + num2) : 
			(op=='-') ? String.valueOf(num1 - num2) : "잘못 입력하셨습니다.";
		  //정수를 스트링문자열로 바꾸는 두번째 방법 String.valueof(정수)
		System.out.println("결과 : " + str);
		
		
		
	}
	// 두 수와 '+' 또는 '-'를 입력받아 알맞은 계산 결과 출력하기
	// 단, '+'와 '-'이외의 연산자 입력시 "잘못 입력하였습니다!" 출력
	
	// 첫 번째 수 : 6
	// 두 번째 수 : 12
	// 연산자 입력( + or - ) : +
	// 결과 18
	
	// 첫번 째 수 : 6
	// 두번 째 수 : 12
	// 연산자 입력( + or- ) : -
	// 결과: -6

}
