package com.kh.array;

public class Exam_Array {
	public static void main(String [] args) {
		//배열 첫 번째 사용방법
		int [] arrs = new int[5];
		arrs[0] = 1;
		arrs[1] = 2;
		arrs[2] = 3;
		arrs[3] = 4;
		arrs[4] = 5;
	//new int[5]라는 주소를 arrs[stack]에 저장
	//arrs[0~5]를 주석으로 바꾸면 0 0 0 0 0출력 (기본값)
	//new int[5]지만 intex는 0부터 시작이여서 arrs[4]까지있다.
		System.out.printf("%d %d %d %d %d \n", arrs[0], arrs[1], arrs[2], arrs[3], arrs[4]);
		System.out.printf("배열의 크기 : %d", arrs.length);
		System.out.println();
		// 배열 두 번째 사용방법
		int[] nums = { 1, 2, 3, 4, 5 };
		System.out.printf("%d %d %d %d %d\n", nums[0], nums[1], nums[2], nums[3], nums[4]);
		// 배열을 초기화하면서 할당까지 동시에 시키는 방법

		// 배열 세 번째 사용방법
		// 순차적인 접근?, 0 -> 1->  2-> 3
		int[] inputs = new int[5];
		for (int i = 0; i < 5; i++) {
			// 배열 선언은 밖에서, 여기에 쓰면 매번 새롭게 생성됨
			inputs[i] = i + 3;
		}
		for (int i = 0; i < 5; i++) {
			System.out.print(inputs[i] + " ");
		}
		System.out.println();
	}

	
	
	
	
}
