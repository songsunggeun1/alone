package com.kh.control;

import java.util.Scanner;

public class Exam_DoWhile {
	public static void main(String [] args) {
		// 입력한 수가 -1이 될때까지 ~~ 하시오.
		// -1이 입력이 될때까지 입력한 수를 모두 합하여 출력하시오.
		Scanner sc= new Scanner(System.in);
		//반복문은 무한으로 반복이 되고
		//특정조건이 되었을 때 반복문이 멈추는 것
		// 1.무한반복문은 어떻게 쓸 것인가?
		// for문인 경우 for(;;) {}
		// while문인 경우 while(true) {}
		
		// 2.특정조건이 되었을 때 반복문은 어떻게 멈추는 것인가?
		// if문이 참일 때 break;
		
//		do {
//			sum = sum + num; // 위 변수 초기화2개 한 이유는 처음 반복시 0이 될려고
//			System.out.print("정수 입력 : ");
//			num = sc.nextInt(); // 증감식(~~가 될때까지)
//		}while(num != -1); // 조건문 (num)
//		System.out.println("입력하신 수의 합은 : " + sum);
		
		
		
		int num = 0;
		int sum = 0;
		while(true) {
			sum = sum + num;
			System.out.print("정수 입력 : ");
			num = sc.nextInt(); 
			// -1이 입력하기전까지 true이기 때문에 무한반복
			if(num == -1) break;//-1을 입력하게 되면 false
			}
		System.out.println("입력하신 수의 합은 : " + sum);
	}

}
