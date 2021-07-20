package com.kh.control;

public class Exam_ForDouble {
	public static void main(String [] args) {
		// 중첩 for문
		for(int i = 1; i < 10; i++) {
			//System.out.println(i);
			for(int j = 1; j < 10; j++) {
				//System.out.print(j+" ");
				System.out.printf("%d * %d = %d \n", i , j , i*j);
				
				
				// i=0일 때, j 0~9까지 출력
				// i=1일 때, j 0~9까지 출력
				// i=2일 때, j 0~9까지 출력
				// ~ i=9일 때, j 0~9까지 출력 (총 100번 출력)
			}
			System.out.println();
		}
		//System.out.println(i); for문 밖에서는 i가 안써진다.
	}

}
