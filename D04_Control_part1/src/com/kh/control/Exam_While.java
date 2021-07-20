package com.kh.control;

public class Exam_While {
	public static void main(String [] args) {
		int i = 0; // 초기식(생략가능)
		while(i < 10) { // 조건식
			System.out.println("출력된 i의 값: "+i);
			i++; // 증가식(생략가능)
			// 출력값 : 0 1 2 3 4 5 6 7 9
	}
		System.out.println();
		int j = 9; // 초기식(생략가능)
		while(j>=0) {
			System.out.println("출력된 i의 값 : "+ j);
			j--; // 감소식(생략가능)
			// 9 8 7 6 5 4 3 2 1 0
		}
		
		
		for(int e = 0; e > 10; e++) {
			System.out.println(e);
		}
		
		int u = 0;
		while(u<10) {
			System.out.println(u);
			u++;
		}
		
	}

}
