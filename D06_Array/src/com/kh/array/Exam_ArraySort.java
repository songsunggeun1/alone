package com.kh.array;

public class Exam_ArraySort {
	public static void main(String [] args) {
		// 정렬
		// 1 3 4 2 5 
		// 오름차순정렬 -> 1 2 3 4 5
		// 내림차순정렬 -> 5 4 3 2 1
		
		int num1 = 54;
		int num2 = 22;
		int temp; // 중간에 한번 보존을 시켜주는 변수
		// num1 = 22. num2 = 54 출력했을 때 이렇게 바꾸고 싶다.
		// ex) num1 = num2, num2 = num1 -> 둘다 22가 출력됨
		temp = num1; 
		num1 = num2; // num1 -> 22 
		num2 = temp; // num2 -> 52
		System.out.println(num1+", "+ num2);
		System.out.println();
		int [] nums = {2, 1, 3};
//		int temp1 = nums[0];
//		nums[0] = nums[1];
//		nums[1] = temp1;
		// 2, 1, 3 -> 1, 3, 2
		
		int temp2 = nums[0];
		nums[0] = nums[1];
		nums[1] = nums[2];
		nums[2] = temp2;
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

}
