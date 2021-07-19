package com.kh.operator;

import java.util.Scanner;

public class Exercise_Triple1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		int iNum = sc.nextInt();
		// 판단을 하는데 삼항연산자
		// 0인지 아닌지 판별, 0일때는 0입니다.
		// 0이 아닐때는 양수/음수 판별
//		String str = (num == 0) ? "0입니다" : (iNum>0) ? "양수" : "음수";
//		String str = iNum>0 ? "양수" : "음수";
//		System.out.println(iNum + "은/는 " + str+"입니다");
		
		String str = (iNum==0) ? "0입니다" : (iNum>0)?"양수입니다":"음수입니다";
		// 음수였을(false)경우 0인지 아닌지 2차 판별
		System.out.println("입력하신 정수는 " + str);
		
		
		
	}
	// 입력받은 정수가 양수, 0, 음수인지 판별 후 출력하세요
	// 너무 어려우면 양수, 음수 판별부터 해보세요
	// 정수를 입력해주세요 : -1
	// -1 는/은 음수입니다.
	
	// 정수를 입력해주세요 : 1
	// 1 은/는 양수입니다.
	
	// 정수를 입력해주세요 : 0
	// 0은 0입니다.

}
