package com.kh.array;

public class Exam_ArrayCopy {
	public static void main(String [] args) {
		// 얉은 복사
		// 두 개의 변수가 하나의 배열을 가리키고 있음
		int [] arrs1 = new int[4];
		for(int i = 0; i < arrs1.length; i++) {
			arrs1[i] = i+1;
		}
		int [] arrs2 = arrs1;//완벽한 복사라고 생각하고 작성함.
		arrs2[0] = 5;//arrs2에 복사가 되었기 때문에 arrs2를 수정하면 arrs1은 수정되지 않음 이라고 생각함.
		System.out.println("변해도 되는 : " + arrs2[0] + "변하면 안되는" + arrs1[0]);
		System.out.println();
		
		// 깊은 복사
		int [] arr1 = {1, 2, 3, 4};
		int [] arr2 = new int[4];
		// arr1이랑은 다른 공간을 할당하여 
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i]; // arr2에 arr1값을 그대로 복사
		}
		arr2[0] = 5;
		System.out.println("변해도 되는 : " + arr2[0] + "변하면 안되는" + arr1[0]);
	}

}
