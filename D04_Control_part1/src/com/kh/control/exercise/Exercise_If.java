package com.kh.control.exercise;

import java.util.Scanner;

public class Exercise_If {
	public void exercise1() {
		System.out.println("ù��° ���� �����Դϴ�");		
		//exercise1�� "ù�� ° ���� �����Դϴ�"��� �ڵ带 ������ �ִ�
		// Ű����� ������ �Է¹ް� �Է¹��� ������ ����̰�
		// ¦���� �� "¦����"�� ����ϰ� ¦���� �ƴϸ� "Ȧ����"�� ����ϼ���
		// ��, ����� �ƴϸ� "����� �Է����ּ���"�� ����ϼ���.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է����ּ��� : ");
		int iNum = sc.nextInt();
		if(iNum < 0 ) {
			System.out.println("����� �Է����ּ���");
		}else if(iNum%2==0) {
			System.out.println("¦���Դϴ�");
		}else {
			System.out.println("Ȧ���Դϴ�");
		}
		
		
		//���� �ڵ�� ���� �ڵ�� �����ѵ� ����� �ٸ��ڵ�
		//�ؿ� if���� ��ø�ؼ� ���°ź��� else if�� ���°� �� ������ ������
//		if(iNum > 0) {
//			if(iNum%2==0) {
//				System.out.println("¦���Դϴ�");
//			}else {
//				System.out.println("Ȧ���Դϴ�");
//			}
//		}else if(iNum == 0) {
//		}else {
//			System.out.println("�����Դϴ�");
//		}
		
	}
	
	public void exercise2() {
		System.out.println("�ι�° ���� �����Դϴ�");
		/*
		 * 1.�Է�
		 * 2.����
		 * 3.��ȸ
		 * 4.����
		 * 0.����
		 * �޴� ��ȣ�� �Է��ϼ��� : 3
		 * ��ȸ�޴��Դϴ�.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("0. ����");
		System.out.print("�޴���ȣ�� �Է��ϼ��� : ");
		int iNum2 = sc.nextInt();
		if(iNum2 == 1) {
			System.out.println("�Է¸޴��Դϴ�.");
		}else if(iNum2==2) {
			System.out.println("�����޴��Դϴ�");
		}else if(iNum2==3) {
			System.out.println("��ȸ�޴��Դϴ�");
		}else if(iNum2==4) {
			System.out.println("�����޴��Դϴ�.");
		}else if(iNum2==0) {
			System.out.println("���α׷��� ����˴ϴ�.");
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}

		
		
		
		}
	public void exercise3() {
		System.out.println("����°���� �����Դϴ�.");
		
		/*
		 * �߰����, �⸻���, ��������, �⼮ȸ���� �Է��ϰ�
		 * Pass �Ǵ� Fail�� ����ϼ���.
		 * �򰡺����� �߰���� 20%, �⸻��� 30%, ���� 30%, �⼮ 100%�� �̷�����ְ�
		 * �� ��, �⼮ ������ �� ���� ȸ�� 20ȸ �߿��� �⼮�� ���� ���� ������ ���
		 * 70�� �̻��� ��� Pass(��, �⼮Ƚ�� ����), 70�� �̸��̰ų�
		 * ��ü ������ 30%�̻� �Ἦ �� Fail�� ����ϼ���.
		 * 
		 * �߰� ��� ����(20) : 70
		 * �⸻ ��� ����(30) : 80
		 * ���� ����       (30) : 77
		 * �⼮ ����      (100) : 18
		 * ���� : 78
		 * Pass�Դϴ�!
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("�߰���� ������ �Է����ּ��� : ");
		int mid = sc.nextInt(); // �߰�
		double midTerm = mid*0.2;
		System.out.print("�⸻��� ������ �Է����ּ��� : ");
		int fin = sc.nextInt(); // �⸻
		double finTerm = fin*0.3;
		System.out.print("�߰���� ������ �Է����ּ��� : ");
		int homework = sc.nextInt(); // ����
		double hw = homework*0.3;
		System.out.print("�߰���� ������ �Է����ּ��� : ");
		int attendance = sc.nextInt(); // �⼮
		
		//���� ȯ��(�����ݿ�) �� ���ϱ� 
		double total = midTerm + finTerm + hw + attendance;
		
		if(total>=70 && attendance>14) {
			System.out.println("���� : " + total);
			System.out.println("����Դϴ�");
		}else {
			if(total>=70) {
				System.out.println("FAIL[�⼮�ܼ�����] ("+attendance+ "/ 20)");
			}else if(attendance>14) {
				System.out.println("FAIL[��������] (" + total + ")");
			}else {
				System.out.println("FAIL[�����̴�] (" + total+ ")");
		}
		
		
		
		
		 /* Fail�� ��� 
		 * ���� ��� / �⼮ �̴�
		 * FAIL [�⼮ Ƚ�� ����] (13/20)
		 * 
		 * ���� �̴� / �⼮ ���
		 * FAIL [ ���� �̴� ] (���� : 68)
		 * 
		 * ���� �̴� / �⼮ �̴�
		 * FAIL [�⼮ Ƚ�� ����] (13/20)
		 * FAIL [���� �̴�] (���� : 68)
		 */
		
		}
		
	}

}
