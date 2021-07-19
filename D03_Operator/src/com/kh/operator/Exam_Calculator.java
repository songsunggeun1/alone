package com.kh.operator;

import java.util.Scanner;

public class Exam_Calculator {
	public static void main(String [] args) {
		//두 개의 수를 입력받아서
		//+, -, *, /, % 구하는 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 정수 입력 : ");
		int first = sc.nextInt();
		System.out.println("두 번째 정수 입력 : ");
		int second = sc.nextInt();
		
		//더하기, 빼기, 곱하기, 나누기, 나머지 결과
		System.out.println("더하기 결과 : " + (first+second));
		System.out.println("빼기 결과 : " + (first-second));
		System.out.println("곱하기 결과 : " + (first*second));
		System.out.println("나누기 결과 : " + (first/second));
		System.out.println("나머지 결과 : " + (first%second));
	}

}
