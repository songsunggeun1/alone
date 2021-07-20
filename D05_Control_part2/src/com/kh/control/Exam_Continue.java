package com.kh.control;

public class Exam_Continue {
	public static void main(String [] args) {
		// 1~10 사이의 수 중 3의 배수를 제외하고 출력하시오.
		for(int i = 1; i <= 10; i++) {
		//i가 3의 배수이면 출력 Skip - continue
			System.out.println("이게 실행되나?");
			if(i%3==0) continue;
			//continue-3의배수이면 skip하라는 뜻
			//continue 밑에 코드는 실행이 안된다
			System.out.print(i + " ");
		}
	}
}
