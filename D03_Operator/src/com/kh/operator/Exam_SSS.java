package com.kh.operator;

import java.util.Scanner;

public class Exam_SSS {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("첫번 째 숫자를 입력하세요.");
		int a = sc.nextInt();
		System.out.println("두 번째 숫자를 입력하세요.");
		int b = sc.nextInt();
		boolean result1 = a==b;
		System.out.println("result1의 값은 : " + result1 + "입니다");
		System.out.println();
		
		System.out.println("1");
		int ex = sc.nextInt();
		System.out.println("2");
		int ex2 = sc.nextInt();
		
		boolean result2 = ex<ex2;
		System.out.println(result2);
	}

}
