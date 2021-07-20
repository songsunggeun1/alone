package com.kh.array;

public class Exam_SortSelection {
	public static void main(String [] args) {
		// 선택정렬
		// 배열을 전부 검색하여 최소값을 고르고 왼쪽부터 채워나가는 방식의 정렬
		// 특징 : 데이터 양이 적을 때 좋은 성능을 보여주는 정렬
		//      데이터 양이 많을 때 급격한 성능 저하를 보임
		// 배열의 n번 인덱스값을 n+1번 ~ 마짖막 인덱스까지 비교
		int [] arrs = {2, 5, 4, 1, 3};
		int min; // 
		for(int i = 0; i < arrs.length; i++) {
			min = i; 
			for(int j = i+1; j <arrs.length; j++) {
				if(arrs[min] > arrs[j]) {
					min = j;
			//2(i)랑 1(j)이 바껴도 1이랑 3은 비교하고 넘어간다.
			//안에 포문 비교 횟수 감수 i도 증가하는데 j도 증가함에 따라 j가 i를 비교하는 횟수 감소
			//가장 작을때의 인덱스값을 저장을 해서 비교를 시작한 위치와 스위치
				}
			}
			int temp = arrs[min];
			arrs[min] = arrs[i];
			arrs[i] = temp;
		}
		for(int i = 0; i <arrs.length;i++) {
			System.out.print(arrs[i] + " ");
		}
	}

}
