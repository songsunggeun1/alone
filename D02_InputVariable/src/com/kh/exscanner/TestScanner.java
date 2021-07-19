package com.kh.exscanner;

import java.util.Scanner;

public class TestScanner {
	public static void main(String [] args) {
		// 이제 입력을 받아 프로그램 작성
		Scanner sc = new Scanner(System.in);
		//참고형 자료형 . 변수 . new Scanner라는 주소를 sc라는 변수
		System.out.println("int 값을 입력해주세요.");
		int input1 = sc.nextInt();//입력가능
		System.out.println("입력한 값은 : " + input1);
		
		System.out.println("int 두번째 값을 입력해 주세요.");
		int input2 = sc.nextInt();//입력가능
		System.out.println("입력한 두 번째 값은 : " + input2);//출력부분
		
		System.out.println("int 세번 째 값을 입력해주세요.");
		int input3 = sc.nextInt();
		System.out.println("입력한 세번 째 값은 : " + input3);
		
		int result = input1 + input2 + input3;
		System.out.println("세 값의 합은 : "+ result);
		//sc.close(); 원래는 sc라는 값을 다 쓴 후에는 잡아야되는데
		//언제 닫지 모르기 때문에 가만히 둔다.
	}

}
