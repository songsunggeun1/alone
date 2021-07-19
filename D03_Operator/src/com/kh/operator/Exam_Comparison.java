package com.kh.operator;

public class Exam_Comparison {
	public static void main(String [] args) {
		System.out.println("비교연산자 예제");
		//비교연산자 : 두 값을 비교하는 연산자, 다른 말로 관계연산자
		//비교연산자는 조건을 만족하면 true, 아니면 false를 반환한다
		int a = 50;
		int b = 30;
		System.out.println("a=50, b=30일 때");
		System.out.println();
		boolean result1 = (a < b);
		boolean result2 = (a == b);
		boolean result3 = (a != b);
		System.out.println("(a < b) result1 : "+ result1);
		System.out.println("(a == b) result2 : "+ result2);
		System.out.println("(a != b) result3 : "+ result3);
		System.out.println();
		
		//산술연산자(%)와 비교연산자를 함께 쓰는 예제
		//a는 홀수인까? 짝수인가?
		boolean isEven = (a%2 == 0);
		System.out.println("a는 짝수인가? "+isEven);
		
	}

}
