package com.kh.control;

public class Exam_While {
	public static void main(String [] args) {
		int i = 0; // �ʱ��(��������)
		while(i < 10) { // ���ǽ�
			System.out.println("��µ� i�� ��: "+i);
			i++; // ������(��������)
			// ��°� : 0 1 2 3 4 5 6 7 9
	}
		System.out.println();
		int j = 9; // �ʱ��(��������)
		while(j>=0) {
			System.out.println("��µ� i�� �� : "+ j);
			j--; // ���ҽ�(��������)
			// 9 8 7 6 5 4 3 2 1 0
		}
		
		
		for(int e = 0; e > 10; e++) {
			System.out.println(e);
		}
		
		int u = 0;
		while(u<10) {
			System.out.println(u);
			u++;
		}
		
	}

}
