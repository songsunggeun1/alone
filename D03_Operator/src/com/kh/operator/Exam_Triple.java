package com.kh.operator;

import java.util.Scanner;

public class Exam_Triple {
	public static void main(String [] args) {
		/*
		 * 삼항연산자
		 * 항목이 3개
		 * (조건식) ? 참일 때 : 거짓일 때
		 *  - 조건식은 반드시 true of false
		 *  - 비교/논리연산자 주로 사용
		 */
		Scanner sc = new Scanner(System.in);
		
		
		// 짝수/홀수 판별
		System.out.println("정수를 입력해주세요.");
		int num = sc.nextInt();
//		boolean check = (num % 2) == 0;
		String resultStr = (num % 2) == 0 ? "짝수" : "홀수";
		//짝수든 홀수든 ""문자열이기 때문에 앞에 String 참조형 변수를 선언해준다
		System.out.println(num + "은/는 " + resultStr + "입니다");
		System.out.println();
		
		
		// 양수/음수 판별
		System.out.println("정수를 입력해주세요");
		int input = sc.nextInt();
		String resultStr2 = (input > 0) ? "양수입니다" : "음수입니다";
		System.out.println(input + "은/는 " + resultStr2);
	}

}
