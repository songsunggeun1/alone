package com.kh.control.exercise;

import java.util.Scanner;

public class Exercise_If {
	public void exercise1() {
		System.out.println("첫번째 문제 실행입니다");		
		//exercise1은 "첫번 째 문제 실행입니다"라는 코드를 가지고 있다
		// 키보드로 정수를 입력받고 입력받은 정수가 양수이고
		// 짝수일 때 "짝수다"를 출력하고 짝수가 아니면 "홀수다"를 출력하세요
		// 단, 양수가 아니면 "양수만 입력해주세요"를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력해주세요 : ");
		int iNum = sc.nextInt();
		if(iNum < 0 ) {
			System.out.println("양수만 입력해주세요");
		}else if(iNum%2==0) {
			System.out.println("짝수입니다");
		}else {
			System.out.println("홀수입니다");
		}
		
		
		//밑의 코드는 위의 코드랑 동일한데 방법만 다른코드
		//밑에 if문을 중첩해서 쓰는거보다 else if를 쓰는게 더 빠르게 읽힌다
//		if(iNum > 0) {
//			if(iNum%2==0) {
//				System.out.println("짝수입니다");
//			}else {
//				System.out.println("홀수입니다");
//			}
//		}else if(iNum == 0) {
//		}else {
//			System.out.println("음수입니다");
//		}
		
	}
	
	public void exercise2() {
		System.out.println("두번째 문제 실행입니다");
		/*
		 * 1.입력
		 * 2.수정
		 * 3.조회
		 * 4.삭제
		 * 0.종료
		 * 메뉴 번호를 입력하세요 : 3
		 * 조회메뉴입니다.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("0. 종료");
		System.out.print("메뉴번호를 입력하세요 : ");
		int iNum2 = sc.nextInt();
		if(iNum2 == 1) {
			System.out.println("입력메뉴입니다.");
		}else if(iNum2==2) {
			System.out.println("수정메뉴입니다");
		}else if(iNum2==3) {
			System.out.println("조회메뉴입니다");
		}else if(iNum2==4) {
			System.out.println("삭제메뉴입니다.");
		}else if(iNum2==0) {
			System.out.println("프로그램이 종료됩니다.");
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}

		
		
		
		}
	public void exercise3() {
		System.out.println("세번째문제 실행입니다.");
		
		/*
		 * 중간고사, 기말고사, 과제점수, 출석회수를 입력하고
		 * Pass 또는 Fail을 출력하세요.
		 * 평가비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 100%로 이루어져있고
		 * 이 때, 출석 비율은 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산
		 * 70점 이상일 경우 Pass(단, 출석횟수 충족), 70점 미만이거나
		 * 전체 강의의 30%이상 결석 시 Fail을 출력하세요.
		 * 
		 * 중간 고사 점수(20) : 70
		 * 기말 고사 점수(30) : 80
		 * 과제 점수       (30) : 77
		 * 출석 점수      (100) : 18
		 * 총점 : 78
		 * Pass입니다!
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("중간고사 점수를 입력해주세요 : ");
		int mid = sc.nextInt(); // 중간
		double midTerm = mid*0.2;
		System.out.print("기말고사 점수를 입력해주세요 : ");
		int fin = sc.nextInt(); // 기말
		double finTerm = fin*0.3;
		System.out.print("중간고사 점수를 입력해주세요 : ");
		int homework = sc.nextInt(); // 과제
		double hw = homework*0.3;
		System.out.print("중간고사 점수를 입력해주세요 : ");
		int attendance = sc.nextInt(); // 출석
		
		//점수 환산(비율반영) 후 더하기 
		double total = midTerm + finTerm + hw + attendance;
		
		if(total>=70 && attendance>14) {
			System.out.println("총점 : " + total);
			System.out.println("통과입니다");
		}else {
			if(total>=70) {
				System.out.println("FAIL[출석휫수부족] ("+attendance+ "/ 20)");
			}else if(attendance>14) {
				System.out.println("FAIL[점수부족] (" + total + ")");
			}else {
				System.out.println("FAIL[점수미달] (" + total+ ")");
		}
		
		
		
		
		 /* Fail의 경우 
		 * 점수 통과 / 출석 미달
		 * FAIL [출석 횟수 부족] (13/20)
		 * 
		 * 점수 미달 / 출석 통과
		 * FAIL [ 점수 미달 ] (총점 : 68)
		 * 
		 * 점수 미달 / 출석 미달
		 * FAIL [출석 횟수 부족] (13/20)
		 * FAIL [점수 미달] (총점 : 68)
		 */
		
		}
		
	}

}
