package com.kh.operator;

import java.util.Scanner;

public class Exercise_Logical2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է��� ���� ���� �빮������ Ȯ���Ͽ� ��� ����ϱ�");
		System.out.print("���� �ϳ� �Է����ּ��� : ");
		char ch = sc.next().charAt(0);
		boolean check = ('A'<=ch) && (ch<='Z');
		// �빮�� �ҹ��� Ȯ���ϴ� ���
		// �ƽ�Ű�ڵ�(����)�� �Ǻ� 
		System.out.println("���� �빮�� Ȯ�� : " + check);
		//���ڸ� �Է��ؼ� ���� ����ϱ�
		System.out.print("���� �ϳ� �Է����ּ��� : ");
		int input = sc.nextInt();
		System.out.println("���ڷ� ��ȯ : " + (char)input);
		// ���ڷ� �Է��ص� ���ڷ� ����ȯ�� �����ش�
		// ��°� : �ƽ�Ű�ڵ�� ��ȯ�ؼ� ��µ�
		System.out.print("���� �ϳ� �Է����ּ��� : ");
		char ch2 = sc.next().charAt(0);
		System.out.println("���ڷ� ��ȯ : " + (int)ch2);
		
	}
	// �Է��� ���� ���� �빮������ Ȯ���Ͽ� ��� ����ϱ�
	// ���� �ϳ� �Է����ּ��� : a
	// ���� �빮�� Ȯ�� : false

}
