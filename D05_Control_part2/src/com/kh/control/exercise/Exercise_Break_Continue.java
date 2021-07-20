package com.kh.control.exercise;

import java.util.Scanner;

public class Exercise_Break_Continue {
	
	public void exercise1() {
		//정수 하나를 입력 받은 후
		//1부터 입력한 숫자까지의 합을 출력하시오
		/*
		 * 숫자하나 입력하세요 : 5
		 * 1부터 5까지의 합 : 15
		 * 1+2+3+4+5 - 1씩 증가하면서 반복하여 더해준다?
		 */
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("정수하나를 입력해주세요.");
		int num = sc.nextInt();
//		for(int i = 1; i <= num; i++) {
//			sum = sum + i;
//		}
//		System.out.println("1부터 " + num + "까지의 합 : "+ sum);
//		//for문을 이용한 풀이
		
		
//		int i = 1;
//		while(i <= num) {
//			sum = sum + i;
//			i++;
//		}
//		System.out.println("1부터 " + num + "까지의 합 : "+ sum);
		//while문을 이용한 풀이
		
		
		int i = 1; // 1부터 더해야 되니까
		while(true) { // 계속 더해야 하니까(무한반복문)
			sum+=i; // 1부터 i까지 더해야 하니까
			if(i==num) break; // i가 입력한값까지 더해야 하니까
			i++; // 1씩 계속 증가하면서 더해야 하니까
		}
		System.out.println("1부터 " + num + "까지의 합 : "+ sum);
		//while과 break를 이용한 풀이
		
		
		
	}

	public void exercise2() {
		/*
		 * 1부터 100까지의 정수들의 합을 출력하는데
		 * 4의 배수는 빼고 더하여 출력하시오.
		 */
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			// i가 4의 배수면 sum+=i가 실행되지 않도록함
			/*
			 * continue가 실행되면 바로 증감식으로 가지 않고 바로 조건식으로 실행
			 * 그래야 4의 배수가 나왔을 경우 sum+=i 하지않아야 되고
			 * 위로 다시 조건식으로 가야되기 때문 
			 */
			if(i%4==0) continue; // 4의 배수는 빼고
			sum+=i; // 증가한 값을 계속 더한다
		}
		System.out.println("합 : " + sum);
		
		
	}
}
