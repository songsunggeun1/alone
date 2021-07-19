package com.kh.exscanner;

import java.util.Scanner;

public class TestScanner2 {
	public static void main(String [] args) {
		//정수를 입력해주세요
		//실수를 입력해주세요
		//문자를 입력해주세요
		//문자열을 입력해주세요
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요.");
		int iNum = sc.nextInt();
		System.out.println("실수를 입력해주세요.");
		double dNum = sc.nextDouble();
		System.out.println("문자를 입력해주세요.");
		//scanner에는 문자만 입력받는 기능이 없어서
		//문자열을 입력받은 후 잘라서 문자에다가 저장함
		char ch = sc.next().charAt(0);
		//문자열을 입력받지만 맨앞글자만 자른다는 명령어
		//FCLASS 입력해도 F만 출력
		System.out.println("문자열을 입력해주세요.");
		String inputStr = sc.next();
		
		
		//입력한 정수는 : 
		//입력한 실수는 :
		//입력한 문자는 : 
		//입력한 문자열은 : 
		System.out.println("입력한 정수는 : " + iNum);
		System.out.println("입력한 실수는 : " + dNum);
		System.out.println("입력한 문자는 : " + ch);
		System.out.println("입력한 문자열은 : " + inputStr);
		
	}

}
