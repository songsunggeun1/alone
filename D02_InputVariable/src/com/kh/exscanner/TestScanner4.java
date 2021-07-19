package com.kh.exscanner;

import java.util.Scanner;

public class TestScanner4 {
	public static void main(String [] args) {
		//이름(String), 태어난 월(int),주소(String)
		//키(double),몸무게(double)
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해 주세요.");
		String name = sc.next();
		//이름만 적기 때문에 공백이 없어서 sc.next(); 사용
		
		System.out.println("태어난 월을 적어주세요.");
		int birth = sc.nextInt();
		
		
		System.out.println("주소를 적어주세요.");
		sc.nextLine();
		//태어난 월을 입력하고 친 엔터값의 공백을 메꾸기 위해
		//sc.nextLine();를 한번 더 사용하여 공백 메꿈
		
		String adress = sc.nextLine();
		//공백이 있을시에 sc.next가 아닌 sc.nextLine
		
		System.out.println("키를 적어주세요.");
		double height = sc.nextDouble();
		
		System.out.println("몸무게를 적어주세요.");
		double weight = sc.nextDouble();
		
		System.out.println("성별을 입력해주세요.");
		char gender = sc.next().charAt(0);
		//컴퓨터에서 첫번째 index시작은 0으로 시작하기 때문에
		//charAt(0);
		
//		System.out.println("이름 : " +name);
//		System.out.println("태어난 월 : " +birth);
//		System.out.println("주소 : " +adress);
//		System.out.println("키 : " +(int)height);
//		//double 자료형이지만 출력할 때 소수점이 필요없어서
//		//(int)로 강제형변환 진행
//		//큰 데이터에서 작은데이터로 강제 형변환을 했기 때문에 데이터손실 있음
//		//173.2 -> 173 소수점 데이터 손실
//		System.out.println("몸무게 : " +weight);
//		System.out.println("성별 : " +gender);
		
		
		
		//print()와 println()의 차이점
		//ln은 enter 느낌(밑줄로 넘어간다고 생각하면됨,줄바꿈)
		//printf()의 형식 : 정수(%d), 실수(%f), 문자(%c), 문자열(%s)
//		System.out.println("이름 : " +name);
		System.out.printf("이름 : %s\n", name);
//		System.out.println("태어난 월 : " +birth);
		System.out.printf("태어난 월 : %d\n", + birth);
//		System.out.println("주소 : " +adress);
		System.out.printf("주소 : %s\n", adress);
//		System.out.println("키 : " +(int)height);
		System.out.printf("키 : %.2f\n" , height);
//		System.out.println("몸무게 : " +weight);
		System.out.printf("몸무게는 : %.1f\n", weight);
//		System.out.println("성별 : " +gender);
		System.out.printf("성별 : %c\n", gender);
		
	}

}
