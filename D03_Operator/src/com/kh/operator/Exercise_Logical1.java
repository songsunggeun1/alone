package com.kh.operator;

import java.util.Scanner;

public class Exercise_Logical1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력한 정수값이 1~100 사이의 숫자인지 확인하시오.");
		System.out.print("정수를 하나 입력해주세요 : ");
		int iNum = sc.nextInt();
		boolean result1 = (1<=iNum) && (iNum<=100);
		System.out.println("1부터 100사이의 숫자인가? : "+result1);
		
		System.out.println();
		System.out.println();
		System.out.println("입력한 정수값이 1~100 사이의 숫자인지 확인하시오.");
		System.out.print("정수를 하나 입력해주세 : ");
		int iNum2 = sc.nextInt();
		boolean result2 = (1<=iNum2) && (iNum2<=100);
		System.out.println("1부터 100사이의 숫자인가? : "+result2);
		
	}
	// 입력한 정수값이 1 ~ 100 사이의 숫자인지 확인하시오.
	// 정수를 하나 입력해주세요 : 33
	// 1부터 100사이의 숫자인가 : true
	
	
	// 정수를 하나 입력해주세요 : 120
	// 1부터 100사이의 숫자인가 : false


}
