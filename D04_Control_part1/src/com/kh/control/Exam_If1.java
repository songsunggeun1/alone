package com.kh.control;

import java.util.Scanner;

public class Exam_If1 {
	public static void main(String [] args) {
		// 정수 하나 입력해주세요 : 44
		// 양수입니다.
		
		// 정수 하나 입력해주세요 : -1
		// 음수입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력해주세요 : ");
		int num1 = sc.nextInt();
		if(num1 > 0) {
			System.out.println("양수입니다");
		}else {
			System.out.println("음수입니다");
		}
//		else를 쓰지않는다면 if문을 한번더 써도 되지만 간결하게 else를 써서 사용
		if(num1 < 0) {
			System.out.println("음수입니다");
		}
		//입력받은 정수가 양수, 0, 음수인지 판별하시오.
		System.out.println();
		System.out.println();
		
		
		
//		if(num1>0) {
//			System.out.println("양수입니다");
//		}
//		if(num1<0) {
//			System.out.println("음수입니다");
//		}
//		if(num1==0) {
//			System.out.println("0입니다");
//		}
		if(num1 > 0) {
			System.out.println("양수입니다");
		}else if(num1 == 0){
			System.out.println("0입니다");
		}else {
			System.out.println("음수입니다");
			}
		//if문 3개를 쓰면 if문 3개 모두 동작을 하지만
		//else if를 쓰면 else if가 참일 때 else는 동작 안함
		//입력한 값이 0일 때 차이를 보여줌.
		
	}

}
