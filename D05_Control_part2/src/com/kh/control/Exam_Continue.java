package com.kh.control;

public class Exam_Continue {
	public static void main(String [] args) {
		// 1~10 ������ �� �� 3�� ����� �����ϰ� ����Ͻÿ�.
		for(int i = 1; i <= 10; i++) {
		//i�� 3�� ����̸� ��� Skip - continue
			System.out.println("�̰� ����ǳ�?");
			if(i%3==0) continue;
			//continue-3�ǹ���̸� skip�϶�� ��
			//continue �ؿ� �ڵ�� ������ �ȵȴ�
			System.out.print(i + " ");
		}
	}
}
