package com.kh.operator;

public class Exam_Comparison {
	public static void main(String [] args) {
		System.out.println("�񱳿����� ����");
		//�񱳿����� : �� ���� ���ϴ� ������, �ٸ� ���� ���迬����
		//�񱳿����ڴ� ������ �����ϸ� true, �ƴϸ� false�� ��ȯ�Ѵ�
		int a = 50;
		int b = 30;
		System.out.println("a=50, b=30�� ��");
		System.out.println();
		boolean result1 = (a < b);
		boolean result2 = (a == b);
		boolean result3 = (a != b);
		System.out.println("(a < b) result1 : "+ result1);
		System.out.println("(a == b) result2 : "+ result2);
		System.out.println("(a != b) result3 : "+ result3);
		System.out.println();
		
		//���������(%)�� �񱳿����ڸ� �Բ� ���� ����
		//a�� Ȧ���α�? ¦���ΰ�?
		boolean isEven = (a%2 == 0);
		System.out.println("a�� ¦���ΰ�? "+isEven);
		
	}

}
