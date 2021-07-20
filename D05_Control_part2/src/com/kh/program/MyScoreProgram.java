package com.kh.program;

import java.util.Scanner;

public class MyScoreProgram {
	public static void main(String [] args) {
		/*
		 * ====== 메인메뉴 ======
		 * 1. 성적입력
		 * 2. 성적출력
		 * 3. 종료
		 * 선택 : 1
		 * 
		 * ====== 성적 입력 ======
		 * 국어 : 50
		 * 영어 : 40
		 * 수학 : 30
		 * 
		 * ======메인 메뉴 ======
		 * 1. 성적입력
		 * 2. 성적출력
		 * 3. 종료
		 * 선택 : 2
		 * 
		 * ====== 성적 출력 ======
		 * 국어 : 50
		 * 영어 : 40
		 * 수학 : 30
		 * 
		 * 총점 : 120
		 * 평균 : 40.00
		 * 
		 * ======메인 메뉴 ======
		 * 1. 성적입력
		 * 2. 성적출력
		 * 3. 종료
		 * 선택 : 3
		 * 
		 * Good Bye ~
		 */
		Scanner sc= new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		float avg = 0;
		종료 : // 무한반복 시작
			while(true) {
		System.out.println("====== 메뉴를 선택해주세요 ======"
				+ "\n1. 성적입력\n2. 성적출력\n3. 종료");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
			switch(choice) {
			case 1 :
				System.out.println("====== 성적입력 ======");
				do {
					System.out.print("국어점수를 입력하세요 : ");
					kor = sc.nextInt();
					if(kor < 0 || kor > 100) {
						System.out.println("다시 입력해주세요.");
					}
				}while(kor < 0 || kor > 100);
				/*do ~ while을 사용한 이유 : 
				 * 점수가 100점을 넘어가면 안되기 때문에
				 * 범위안에 쓰도록 무한반복문을 사용
				 */
				do {
				System.out.print("영어점수를 입력하세요 : ");
				eng = sc.nextInt();
				if(eng < 0 || eng > 100) {
					System.out.println("다시 입력해주세요.");
				}
				}while(eng < 0 || eng > 100);
				do {
				System.out.print("수학점수를 입력하세요 : ");
				math = sc.nextInt();
				if(math<0 || math>100) {
					System.out.println("점수를 다시 입력해주세요.");
				}
				}while(math<0 || math>100);
				System.out.println("국어 : "+kor);
				System.out.println("영어 : "+eng);
				System.out.println("수학 : "+math);
				break;
				
				
				// The local variable kor may have been initialized
				// kor 변수를 초기화 시켜줘라가 뜬 이유
				/*int math = sc.nextInt();를 해줄시
				 *case 1 안에서만 변수선언이 되기 때문에
				 *상위에서 int kor = 0; 이라는 선언을 미리 해준다.
				 *그래야만 case 1을 벗어나도 scanner한 변수를 계속 쓸 수 있다.
				 */
				
			case 2 :
				System.out.println("====== 성적출력 ======");
				total = kor + eng + math;
				avg = total / 3.0f;
				System.out.println("국어 : " + kor);
				System.out.println("영어 : " + eng);
				System.out.println("수학 : " + math);
				System.out.println("총점 : " + total);
				System.out.printf("평균점수 : %.2f \n",avg);
				break;
				
				
			case 3 :
				break 종료; // 무한반복 끝
				
				default :
					System.out.println("1~3 사이의 수를 적어주세요.");
			}
		}
		System.out.println("GOOD BYE ~");
	}

}
