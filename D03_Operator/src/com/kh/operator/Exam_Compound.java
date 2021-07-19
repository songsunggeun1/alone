package com.kh.operator;

public class Exam_Compound {
	public static void main(String [] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a+=20); // a=30 b=20 c=30
		System.out.println(b*=3); // a=30 b=60 c=30
		System.out.println(c/=5); // a=30 b=60 c=6
		System.out.println(c%=a); // a=30 b=60 c=6
		System.out.println(c-=a); // a=30 b=60 c=-24
	}

}
