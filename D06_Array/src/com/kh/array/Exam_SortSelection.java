package com.kh.array;

public class Exam_SortSelection {
	public static void main(String [] args) {
		// ��������
		// �迭�� ���� �˻��Ͽ� �ּҰ��� ���� ���ʺ��� ä�������� ����� ����
		// Ư¡ : ������ ���� ���� �� ���� ������ �����ִ� ����
		//      ������ ���� ���� �� �ް��� ���� ���ϸ� ����
		// �迭�� n�� �ε������� n+1�� ~ ��¢�� �ε������� ��
		int [] arrs = {2, 5, 4, 1, 3};
		int min; // 
		for(int i = 0; i < arrs.length; i++) {
			min = i; 
			for(int j = i+1; j <arrs.length; j++) {
				if(arrs[min] > arrs[j]) {
					min = j;
			//2(i)�� 1(j)�� �ٲ��� 1�̶� 3�� ���ϰ� �Ѿ��.
			//�ȿ� ���� �� Ƚ�� ���� i�� �����ϴµ� j�� �����Կ� ���� j�� i�� ���ϴ� Ƚ�� ����
			//���� �������� �ε������� ������ �ؼ� �񱳸� ������ ��ġ�� ����ġ
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
