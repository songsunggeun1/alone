package com.kh.operator;

public class Exam_Unary {
	public static void main(String [] args) {
		// 1�� ����
		System.out.println("1�� ����");
		System.out.println("a++;");
		System.out.println("b = (--a) + b;");
		System.out.println("c = (a++) + (--b)");
		int a = 10;
		int b = 20;
		int c = 30;
		
		a++;
		b = (--a) + b;
		c = (a++) + (--b);
		System.out.println("a�� �� : " + a);
		System.out.println("b�� �� : " + b);
		System.out.println("c�� �� : " + c);
		System.out.println();
		
		// 2�� ����
		System.out.println("2�� ����");
		boolean flag = true;
		System.out.println("����� : " + !!!flag); // �ݴ��� �ݴ��� �ݴ�
//		System.out.println("2������ ��");
		System.out.println(); // ����(���� ���)

		
		// 3�� ����
		System.out.println("3�� ����");
		int x = 100;
		int y = 33;
		int z = 0;
		
		x--; // x = 99
		z = x-- + --y; // x=98 y=32 z=131
		x = 99 + x++ + x; // x=296
		y = y-- + y + ++y; // y=95
		System.out.println("x�� �� : " + x);
		System.out.println("y�� �� : " + y);
		System.out.println("z�� �� : " + z);
		System.out.println();
	
	}

}
