package com.kh.control;

public class Exam_For1 {
	public static void main(String [] args) {
		for(int i = 0; i < 10; ++i) { 
			System.out.println("��µ� �� : " + i);
		//�ʱ�� i�� 0�̴�, ���ǽ� 10�� �Ǳ� ������, ������ 1�� �����϶�
		}
		
		for(int i = 9; i >= 0; i--) {
			System.out.println("��µ� �� : " +i);
			//�ʱ�� i�� 9, ���ǽ� 0�̳��Ǳ�������, ���ҽ� 1�� �����϶�
		}
		
		for(int i=0; i < 20; i+=2) {
			System.out.println("��µ� �� : "+ i);
			//i+=2 -> i = i+2
		}
		
	}

}
