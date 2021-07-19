package com.kh.variable;

public class TestVarExam {
	public static void main(String [] args) {
		int a = 100;
		System.out.println("정수의 값 : " + a);
		long b = 999900000000L;
		//long 변수선언할때는 L을 붙여야됨(규칙이라고 생각하자)
		System.out.println("정수의 값(9999억) : " + b);
		float c = 486.520F;
		//float 변수선언할때는 F을 붙여야됨(규칙이라고 생각하자)
		System.out.println("실수의 값 : " + c);
		double d = 567.890123;
		System.out.println("실수의 값 : " + d);
		char e = 'a';
		System.out.println("문자의 값 : " + e);
		String f = "hello world,";
		System.out.println("문자열의 값 : " + f);
		boolean g = true;
		System.out.println("논리의 값 : " + g);
	}

}
