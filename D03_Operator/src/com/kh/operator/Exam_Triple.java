package com.kh.operator;

import java.util.Scanner;

public class Exam_Triple {
	public static void main(String [] args) {
		/*
		 * ���׿�����
		 * �׸��� 3��
		 * (���ǽ�) ? ���� �� : ������ ��
		 *  - ���ǽ��� �ݵ�� true of false
		 *  - ��/�������� �ַ� ���
		 */
		Scanner sc = new Scanner(System.in);
		
		
		// ¦��/Ȧ�� �Ǻ�
		System.out.println("������ �Է����ּ���.");
		int num = sc.nextInt();
//		boolean check = (num % 2) == 0;
		String resultStr = (num % 2) == 0 ? "¦��" : "Ȧ��";
		//¦���� Ȧ���� ""���ڿ��̱� ������ �տ� String ������ ������ �������ش�
		System.out.println(num + "��/�� " + resultStr + "�Դϴ�");
		System.out.println();
		
		
		// ���/���� �Ǻ�
		System.out.println("������ �Է����ּ���");
		int input = sc.nextInt();
		String resultStr2 = (input > 0) ? "����Դϴ�" : "�����Դϴ�";
		System.out.println(input + "��/�� " + resultStr2);
	}

}
