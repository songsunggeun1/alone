package com.kh.control;

public class Exam_For1 {
	public static void main(String [] args) {
		for(int i = 0; i < 10; ++i) { 
			System.out.println("출력된 값 : " + i);
		//초기식 i는 0이다, 조건식 10이 되기 전까지, 증가식 1씩 증가하라
		}
		
		for(int i = 9; i >= 0; i--) {
			System.out.println("출력된 값 : " +i);
			//초기식 i는 9, 조건식 0이나되기전까지, 감소식 1씩 감소하라
		}
		
		for(int i=0; i < 20; i+=2) {
			System.out.println("출력된 값 : "+ i);
			//i+=2 -> i = i+2
		}
		
	}

}
