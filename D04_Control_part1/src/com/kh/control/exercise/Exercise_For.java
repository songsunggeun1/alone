package com.kh.control.exercise;

import java.util.Scanner;

public class Exercise_For {
	public void exercise1() {
	// 1에서 100 사이의 자연수 중 홀수만 더하여 출력하시오.
		int sum = 0;
		for(int i = 1; i<=100; i+=2) {
			sum += i;
		}
		System.out.print("홀수의 합은 : "+sum);
	}

	
	public void exercise2() {
	// 정수를 하나 입력받아서 그 수가 1 ~ 9 사이의 수일 때만
	// 그 수의 구구단을 출력하시오.
	// 단, 조건이 맞지 않으면 "1~9 사이의 양수를 입력하여야 합니다"를 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("1~9사이의 정수 하나 입력해주세요.");
		int dan = sc.nextInt();
		// 1보다 크거나 같고 9보다 작거나 같은
		if(dan>=1 && dan <=9) {
			// 구구단 출력
			// 입력받은 dan값에 구구단을 출력
			for(int i = 1 ; i < 10; i++) {
				//1씩 증가하면서 반복한다? 반복문 for이용
				//구구단은 1~9까지 곱하는 반복문이기 때문에 그 부분을 for을 이용
//				System.out.println(dan+" * "+ i+" = "+ (dan*i));
				System.out.printf("%d *%d = %d \n",dan,i,dan*i);
				//내가 출력하고 싶은 정수의 개수의 형식문자 작성 후
				//콤바로 구분하여 출력
			}
		}else {
			System.out.println("1~9사이의 양수를 입력하여야 합니다.");
		}
		
		
	}
	
	
	
	public void exercise3() {
		/*
		 * 1부터 10까지의 덧셈을 표시하고 합도 구하시오
		 * 1+2+3+4+5+6+7+8+9+10=55
		 */
//		int sum = 0;
//		for(int i = 0; i <=10; i++) {
//			sum+=i;
//		}
//		System.out.println("합계 : " + sum);
		
		/*이 방법도 맞지만 이 방법은 합계만 나오기 때문에
		 * 밑에 방법으로 1+2+3+4+5+6+7+8+9=10 까지 출력되는 식을 만들어보자
		 */
		
		
		int sum = 0; // 처음시작은 0으로 시작해야 되기때문에 임의로 선언을 해준다
		for(int i = 1; i<=10; i++){ 
			// 1로 시작하고 10이 되거나 작을때까지 1씩 증가한다
			sum+=i; // 0이라는 임의의 숫자해서 i를 누적해서 더한다
			System.out.print(i); // i를 출력
			if(i<=9) {
			System.out.print("+"); //i를 출력하고 9일때까지 + 출력
			}else {
				System.out.print("=");
				System.out.print(sum);//i가 10이면 = 출력 후 결과값출력
			}
		}
		
		
	}
}
