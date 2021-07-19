package com.kh.exscanner;

import java.util.Scanner;

public class TestScanner3 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해주세요.");
		String inputStr = sc.next();
		System.out.println("태어난 월을 입력해주세요.");
		int iNum = sc.nextInt();
		System.out.println("키를 입력해주세요.");
		double dNum = sc.nextDouble();
		System.out.println("성별을 입력해주세요");
		char ch = sc.next().charAt(0);
		//여기서 남을 입력하고 엔터침
		System.out.println("주소를 입력해주세요");
		sc.nextLine();
		//위에서 친 엔터가 여기로 들어가면서 한번 공백을 막아준다
		String inputStr3 = sc.nextLine();
		//문자열을 입력받는 명령어는 sc.next와 sc.nextLine이 있는데
		//sc.next는 공백을 입력받지 않는다 ex)경기도 구리시  result)경기도
		
		
		
		
		System.out.println("제 이름은 " + inputStr + "입니다");
		System.out.println("제가 태어난 월은 " + iNum +"월입니다");
		System.out.println("제 키는 " + (int)dNum+"입니다");
		System.out.println("제 성별은 " + ch+"입니다");
		System.out.println("제 주소는 " + inputStr3+"입니다");
		//
	}

}
