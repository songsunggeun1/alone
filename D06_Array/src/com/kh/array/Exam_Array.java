package com.kh.array;

public class Exam_Array {
	public static void main(String [] args) {
		//�迭 ù ��° �����
		int [] arrs = new int[5];
		arrs[0] = 1;
		arrs[1] = 2;
		arrs[2] = 3;
		arrs[3] = 4;
		arrs[4] = 5;
	//new int[5]��� �ּҸ� arrs[stack]�� ����
	//arrs[0~5]�� �ּ����� �ٲٸ� 0 0 0 0 0��� (�⺻��)
	//new int[5]���� intex�� 0���� �����̿��� arrs[4]�����ִ�.
		System.out.printf("%d %d %d %d %d \n", arrs[0], arrs[1], arrs[2], arrs[3], arrs[4]);
		System.out.printf("�迭�� ũ�� : %d", arrs.length);
		System.out.println();
		// �迭 �� ��° �����
		int[] nums = { 1, 2, 3, 4, 5 };
		System.out.printf("%d %d %d %d %d\n", nums[0], nums[1], nums[2], nums[3], nums[4]);
		// �迭�� �ʱ�ȭ�ϸ鼭 �Ҵ���� ���ÿ� ��Ű�� ���

		// �迭 �� ��° �����
		// �������� ����?, 0 -> 1->  2-> 3
		int[] inputs = new int[5];
		for (int i = 0; i < 5; i++) {
			// �迭 ������ �ۿ���, ���⿡ ���� �Ź� ���Ӱ� ������
			inputs[i] = i + 3;
		}
		for (int i = 0; i < 5; i++) {
			System.out.print(inputs[i] + " ");
		}
		System.out.println();
	}

	
	
	
	
}
