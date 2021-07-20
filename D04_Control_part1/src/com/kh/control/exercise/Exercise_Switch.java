package com.kh.control.exercise;

import java.util.Scanner;

public class Exercise_Switch {
	
	public void exercise1() {
		// 1 ~ 3 ������ ������ �Է¹޾�
		// 1�� ��� ������ �Դϴ�.
		// 2�� ��� �Ķ��� �Դϴ�.
		// 3�� ��� �ʷϻ� �Դϴ�.
		// �׿��� ������ �Է��� ��� �߸��Է��ϼ̽��ϴٸ� ����ϼ���
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int iNum = sc.nextInt();
	    switch(iNum) {
	    case 1 :
	    	System.out.println("������ �Դϴ�.");
	    	break;
	    case 2 : 
	    	System.out.println("�Ķ��� �Դϴ�.");
	    	break;
	    case 3 :
	    	System.out.println("�ʷϻ��Դϴ�.");
	    	break;
	    	default :
	    	System.out.println("�߸��Է��ϼ̽��ϴ�.");
			
		}
		
	}
	
	public void exercise2() {
		/*
		 * ���� �ΰ��� �����ȣ ���� 1���� �Է¹޾Ƽ�
		 * �����ȣ����(+,-,*,/)�� �ش��ϴ� ����� �����ϰ� ����ϼ���.
		 * ��, �� ���� ���ڸ� �Է��� ��� �����ڸ� �߸��Է��ϼ̽��ϴٸ� ����ϼ���
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ������ �Է����ּ��� : ");
		int iNum2 = sc.nextInt();
		System.out.print("�ι�° ������ �Է����ּ��� : ");
		int iNum3 = sc.nextInt();
		System.out.print("�����ȣ�� �Է����ּ��� : ");
		char ch = sc.next().charAt(0);
		
//		switch (ch) {
//		case '+' :
//			System.out.println("���� : " + (iNum2 + iNum3) + "�Դϴ�");
//			break;
//		case '-' :
//			System.out.println("���� : " + (iNum2 - iNum3) + "�Դϴ�");
//			break;
//		case '*' :
//			System.out.println("���� : " + (iNum2 * iNum3) + "�Դϴ�");
//			break;
//		case '/' :
//			System.out.println("���� : " + (iNum2 / iNum3) + "�Դϴ�");
//			break;
//			default : 
//				System.out.println("�����ȣ�� �߸� �Է��ϼ̽��ϴ�.");
		int result = 0;		
		switch (ch) {
		case '+' :
			result = iNum2 + iNum3;
			break;
		case '-' :
			result = iNum2 - iNum3;
			break;
		case '*' :
			result = iNum2 * iNum3;
			break;
		case '/' :
			result = iNum2 / iNum3;
			break;
		default : 
				System.out.println("�����ȣ�� �߸� �Է��ϼ̽��ϴ�.");
		}
		System.out.println("������� : "+result+"�Դϴ�");
		
	}
	
	public void exercise3() {
		/*
		 * 1 ~ 12 ������ ���ڸ� �Է¹޾� �ش��ϴ� ���� ���� ������ ��¥�� ����ϼ���.
		 * �׿��� ���ڸ� �Է��� ��� 1 ~ 12 ������ ���ڸ� �Է��ϼ��並 ����ϼ���
		 * 
		 * 1�� ~ 12������ �� �ϳ��� �Է��ϼ��� : 3
		 * �Է��Ͻ� ���� 31�ϱ��� �Դϴ�.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12���� �ϳ��� ���ڸ� �����ּ��� : ");
		int month = sc.nextInt();
		
//		switch (month) {
//		case 1 :
//			System.out.println("�Է��Ͻ� "+ month+"���� 31�ϱ��� �Դϴ�.");
//			break;
//		case 2 :
//			System.out.println("�Է��Ͻ� "+ month+"���� 28�ϱ��� �Դϴ�.");
//			break;
//		case 3 :
//			System.out.println("�Է��Ͻ� "+ month+"���� 31�ϱ��� �Դϴ�.");
//			break;
//		case 4 :
//			System.out.println("�Է��Ͻ� "+ month+"���� 30�ϱ��� �Դϴ�.");
//			break;
//		case 5 :
//			System.out.println("�Է��Ͻ� "+ month+"���� 31�ϱ��� �Դϴ�.");
//			break;
//		case 6 :
//			System.out.println("�Է��Ͻ� "+ month+"���� 30�ϱ��� �Դϴ�.");
//			break;
//		case 7 :
//			System.out.println("�Է��Ͻ� "+ month+"���� 31�ϱ��� �Դϴ�.");
//			break;
//		case 8 :
//			System.out.println("�Է��Ͻ� "+ month+"���� 31�ϱ��� �Դϴ�.");
//			break;
//		case 9 :
//			System.out.println("�Է��Ͻ� "+ month+"���� 30�ϱ��� �Դϴ�.");
//			break;
//		case 10 :
//			System.out.println("�Է��Ͻ� "+ month+"���� 31�ϱ��� �Դϴ�.");
//			break;
//		case 11 :
//			System.out.println("�Է��Ͻ� "+ month+"���� 30�ϱ��� �Դϴ�.");
//			break;
//		case 12 :
//			System.out.println("�Է��Ͻ� "+ month+"���� 31�ϱ��� �Դϴ�.");
//			break;
//			default :
//				System.out.println("1�� ~ 12�������� �Է����ּ���.");
		
		
		switch (month) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			System.out.println("�Է��Ͻ� ���� ���� 31���Դϴ�");
			break;
		case 2 :
			System.out.println("�Է��Ͻ� ���� ���� 28�϶Ǵ� 29���Դϴ�");
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			System.out.println("�Է��Ͻ� ���� ���� 30���Դϴ�");
			break;
			default :
				System.out.println("1�� ~ 12�������� �Է����ּ���.");
		}
		
		
		
	}
	

}
