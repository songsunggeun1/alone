package com.kh.array;

public class Exam_ArrayCopy {
	public static void main(String [] args) {
		// ���� ����
		// �� ���� ������ �ϳ��� �迭�� ����Ű�� ����
		int [] arrs1 = new int[4];
		for(int i = 0; i < arrs1.length; i++) {
			arrs1[i] = i+1;
		}
		int [] arrs2 = arrs1;//�Ϻ��� ������ �����ϰ� �ۼ���.
		arrs2[0] = 5;//arrs2�� ���簡 �Ǿ��� ������ arrs2�� �����ϸ� arrs1�� �������� ���� �̶�� ������.
		System.out.println("���ص� �Ǵ� : " + arrs2[0] + "���ϸ� �ȵǴ�" + arrs1[0]);
		System.out.println();
		
		// ���� ����
		int [] arr1 = {1, 2, 3, 4};
		int [] arr2 = new int[4];
		// arr1�̶��� �ٸ� ������ �Ҵ��Ͽ� 
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i]; // arr2�� arr1���� �״�� ����
		}
		arr2[0] = 5;
		System.out.println("���ص� �Ǵ� : " + arr2[0] + "���ϸ� �ȵǴ�" + arr1[0]);
	}

}
