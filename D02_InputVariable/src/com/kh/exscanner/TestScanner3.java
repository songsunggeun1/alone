package com.kh.exscanner;

import java.util.Scanner;

public class TestScanner3 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է����ּ���.");
		String inputStr = sc.next();
		System.out.println("�¾ ���� �Է����ּ���.");
		int iNum = sc.nextInt();
		System.out.println("Ű�� �Է����ּ���.");
		double dNum = sc.nextDouble();
		System.out.println("������ �Է����ּ���");
		char ch = sc.next().charAt(0);
		//���⼭ ���� �Է��ϰ� ����ħ
		System.out.println("�ּҸ� �Է����ּ���");
		sc.nextLine();
		//������ ģ ���Ͱ� ����� ���鼭 �ѹ� ������ �����ش�
		String inputStr3 = sc.nextLine();
		//���ڿ��� �Է¹޴� ��ɾ�� sc.next�� sc.nextLine�� �ִµ�
		//sc.next�� ������ �Է¹��� �ʴ´� ex)��⵵ ������  result)��⵵
		
		
		
		
		System.out.println("�� �̸��� " + inputStr + "�Դϴ�");
		System.out.println("���� �¾ ���� " + iNum +"���Դϴ�");
		System.out.println("�� Ű�� " + (int)dNum+"�Դϴ�");
		System.out.println("�� ������ " + ch+"�Դϴ�");
		System.out.println("�� �ּҴ� " + inputStr3+"�Դϴ�");
		//
	}

}
