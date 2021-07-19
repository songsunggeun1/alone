package com.kh.operator;

public class Exam_Unary {
	public static void main(String [] args) {
		// 1번 문제
		System.out.println("1번 문제");
		System.out.println("a++;");
		System.out.println("b = (--a) + b;");
		System.out.println("c = (a++) + (--b)");
		int a = 10;
		int b = 20;
		int c = 30;
		
		a++;
		b = (--a) + b;
		c = (a++) + (--b);
		System.out.println("a의 값 : " + a);
		System.out.println("b의 값 : " + b);
		System.out.println("c의 값 : " + c);
		System.out.println();
		
		// 2번 문제
		System.out.println("2번 문제");
		boolean flag = true;
		System.out.println("결과값 : " + !!!flag); // 반대의 반대의 반대
//		System.out.println("2번문제 끝");
		System.out.println(); // 개행(한줄 띄기)

		
		// 3번 문제
		System.out.println("3번 문제");
		int x = 100;
		int y = 33;
		int z = 0;
		
		x--; // x = 99
		z = x-- + --y; // x=98 y=32 z=131
		x = 99 + x++ + x; // x=296
		y = y-- + y + ++y; // y=95
		System.out.println("x의 값 : " + x);
		System.out.println("y의 값 : " + y);
		System.out.println("z의 값 : " + z);
		System.out.println();
	
	}

}
