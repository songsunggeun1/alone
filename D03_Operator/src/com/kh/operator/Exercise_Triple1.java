package com.kh.operator;

import java.util.Scanner;

public class Exercise_Triple1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է����ּ��� : ");
		int iNum = sc.nextInt();
		// �Ǵ��� �ϴµ� ���׿�����
		// 0���� �ƴ��� �Ǻ�, 0�϶��� 0�Դϴ�.
		// 0�� �ƴҶ��� ���/���� �Ǻ�
//		String str = (num == 0) ? "0�Դϴ�" : (iNum>0) ? "���" : "����";
//		String str = iNum>0 ? "���" : "����";
//		System.out.println(iNum + "��/�� " + str+"�Դϴ�");
		
		String str = (iNum==0) ? "0�Դϴ�" : (iNum>0)?"����Դϴ�":"�����Դϴ�";
		// ��������(false)��� 0���� �ƴ��� 2�� �Ǻ�
		System.out.println("�Է��Ͻ� ������ " + str);
		
		
		
	}
	// �Է¹��� ������ ���, 0, �������� �Ǻ� �� ����ϼ���
	// �ʹ� ������ ���, ���� �Ǻ����� �غ�����
	// ������ �Է����ּ��� : -1
	// -1 ��/�� �����Դϴ�.
	
	// ������ �Է����ּ��� : 1
	// 1 ��/�� ����Դϴ�.
	
	// ������ �Է����ּ��� : 0
	// 0�� 0�Դϴ�.

}
