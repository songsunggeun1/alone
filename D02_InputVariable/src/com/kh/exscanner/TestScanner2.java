package com.kh.exscanner;

import java.util.Scanner;

public class TestScanner2 {
	public static void main(String [] args) {
		//������ �Է����ּ���
		//�Ǽ��� �Է����ּ���
		//���ڸ� �Է����ּ���
		//���ڿ��� �Է����ּ���
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է����ּ���.");
		int iNum = sc.nextInt();
		System.out.println("�Ǽ��� �Է����ּ���.");
		double dNum = sc.nextDouble();
		System.out.println("���ڸ� �Է����ּ���.");
		//scanner���� ���ڸ� �Է¹޴� ����� ���
		//���ڿ��� �Է¹��� �� �߶� ���ڿ��ٰ� ������
		char ch = sc.next().charAt(0);
		//���ڿ��� �Է¹����� �Ǿձ��ڸ� �ڸ��ٴ� ��ɾ�
		//FCLASS �Է��ص� F�� ���
		System.out.println("���ڿ��� �Է����ּ���.");
		String inputStr = sc.next();
		
		
		//�Է��� ������ : 
		//�Է��� �Ǽ��� :
		//�Է��� ���ڴ� : 
		//�Է��� ���ڿ��� : 
		System.out.println("�Է��� ������ : " + iNum);
		System.out.println("�Է��� �Ǽ��� : " + dNum);
		System.out.println("�Է��� ���ڴ� : " + ch);
		System.out.println("�Է��� ���ڿ��� : " + inputStr);
		
	}

}
