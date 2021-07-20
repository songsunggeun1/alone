package com.kh.array.exercise;

import java.util.Scanner;

public class Exercise_Array {
	
	public void exercise1() {
		// 길이가 100인 배열을 선언하고 1부터 100까지의 값을
		// 순서대로 넣어 그 값을 출력하는 코드를 작성하시오.
		int[] nums = new int[100]; // 길이가 100인 배열 선언
		for (int i = 0; i < 100; i++) {
			nums[i] = i+1; // 1부터 100까지의 값을 순서대로 넣어
			System.out.println(nums[i]);//그 값을 출력
		}
	}
		
	
	public void exercise2() {
		// 길이가 5인 String 배열을 선언하고 "딸기", "복숭아",
		// "키위", "사과", "바나나"로
		// 초기화 한 후, for문을 활용해서 바나나를 출력해보세요 !
//		String [] fruits = new String[5];
//		fruits [0] = "딸기";
//		fruits [1] = "복숭아";
//		fruits [2] = "키위";
//		fruits [3] = "사과";
//		fruits [4] = "바나나";
		String [] fruits = {"딸기", "복숭아", 
				"키위", "사과","바나나"};
		//길이가 5인 String 배열을 선언과 그 안의 값을 초기화 하고
		for (int i = 0; i < 5; i++) {
//			System.out.println(fruits[1]);
		//for문을 활용해서 복숭아를 출력
			if (fruits[i].equals("복숭아")) {
				System.out.println(fruits[i]);
			//String에서 ==는 주소값을 비교, equals는 value를 비교
			}

		}
		String kiwi = "키위";
		String badkiwi = new String("키위");
		System.out.println("badkiwi : " + badkiwi); // 키위 나옴
		System.out.println("주소값 비교 : " + (kiwi == badkiwi));
		System.out.println("문자열 비교 : " + kiwi.equals(badkiwi));


	}
	
	public void exercise3() {
		/*
		 * 양의 정수 5개를 입력받아 배열에 저장하고
		 * 제일 큰 수를 출력하는 프로그램을 작성하시오.
		 */
		Scanner sc = new Scanner(System.in);
		int [] inputs = new int[5];
		int max = 0;
		System.out.println("양수 5개를 입력하세요.");
		for(int i = 0; i < 5; i++) {
			inputs[i] = sc.nextInt();
//			System.out.print(inputs[i]); -> 입력하자마자 저장이 된다.
			// 가장 큰수 판별
			if(inputs[i] > max){
				max = inputs[i];
			// 1을 입력하면 max는 1로 변하고 0을 입력하면 계속 1이고
			// 3을 입력하면 max가 3으로 변하는 방법으로 가장 큰 수 판별.
			}
		}
		//가장 큰 수 출력
		System.out.println("가장 큰 수는"+ max + "입니다.");
	}
	
	public void exercise4() {
		/*
		 * 양의 정수 5개를 입력받아 배열에 저장하고
		 * 입력받은 값들의 평균을 구하는 프로그램을 작성하시오.
		 */
		System.out.println("점수를 5과목 적어주세요.");
		Scanner sc = new Scanner(System.in);
		int [] nums = new int[5];
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
		//nums.length의 길이는 5기 때문.
			nums[i] = sc.nextInt();
			sum = nums[i]+sum;
		}
		System.out.println("평균은 " + (double)sum/nums.length + " 입니다");
		
	}
	
	public void exercise5() {
		
		/*
		 *  사용자에게 주민번호를 입력 받은 후
		 *  성별 자리 이후부터 *로 저장되어 출력되도록 프로그램을 작성하시오
		 *  210618-1124600 -> 210618 - 1******
		 *  200518-3233920 -> 220518 - 3******
		 *   
		 */ 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호 입력(-포함) : ");
		String str = sc.next();
		char[] origin = new char[str.length()];
		for (int i = 0; i < origin.length; i++) {
			origin[i] = str.charAt(i);
			// i가 0부터 13까지 증가하면서 문자열을 하나씩 떼고(charAt())
			// 문자배열에 할당
		}
		char[] copy = new char[str.length()];
		//깊은 복사를 위해서 공간을 할당(문자열의 길이만큼)
		for (int i = 0; i < copy.length; i++) {
			if (i <= 7) {
				copy[i] = origin[i]; //할당된 공간에 원본 데이터 복사
			} else {
				copy[i] = '*'; // 성별자리 이후 * 표시
			}
			System.out.print(copy[i]);
		}
		// 입력받은 문자열의 길이만큼 문자배열 할당(배열만듬)
		// 문자 배열에 저장, 저장할 때 문자열을 잘라서 문자로 저장! -> char [] origin 사용.
		// str.chatAt(0); -> 문자열의 배열마다 순서대로 char[]에 복사
		// 주민등록번호가 저장된 문자열을 복사하되
		// 성별자리 이후부터는 *로 처리하여 저장
		// 출력
		
	}
	
	public void exercise6() {
		// 5개의 수를 입력받은 후에
		// 삽입정렬을 이용하여 오름차순으로 정렬한 후 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.println("5개의 양수를 입력하세요 : ");
		int [] nums = new int[5];
		int temp;
		for(int i = 0; i<nums.length; i++) {
			nums[i] = sc.nextInt(); // 5개의 수를 입력받아
		}
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = i; j > 0; j--) {
				if(nums[j-1] > nums[j]) {
				temp = nums[j-1];
				nums[j-1] = nums[j];
				nums[j] = temp;
				}
			}
		}
		System.out.println();
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}

}
