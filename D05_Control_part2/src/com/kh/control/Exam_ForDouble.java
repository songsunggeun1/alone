package com.kh.control;

public class Exam_ForDouble {
	public static void main(String [] args) {
		// ��ø for��
		for(int i = 1; i < 10; i++) {
			//System.out.println(i);
			for(int j = 1; j < 10; j++) {
				//System.out.print(j+" ");
				System.out.printf("%d * %d = %d \n", i , j , i*j);
				
				
				// i=0�� ��, j 0~9���� ���
				// i=1�� ��, j 0~9���� ���
				// i=2�� ��, j 0~9���� ���
				// ~ i=9�� ��, j 0~9���� ��� (�� 100�� ���)
			}
			System.out.println();
		}
		//System.out.println(i); for�� �ۿ����� i�� �Ƚ�����.
	}

}
