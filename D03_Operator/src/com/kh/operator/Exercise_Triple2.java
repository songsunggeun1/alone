package com.kh.operator;

import java.util.Scanner;

public class Exercise_Triple2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù�� ° ������ ���ڸ� �����ּ��� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι� ° ������ ���ڸ� �����ּ��� : ");
		int num2 = sc.nextInt();
		
		System.out.print("�����ڸ� �Է����ּ���(+ or -) : ");
		char op = sc.next().charAt(0);
		// 1. �����ڰ� +�ΰ� ? ���̸� ���ϰڴ� : �����̸� �����ڰ� -���� Ȯ���ϰڴ�.
		// 2. �����ڰ� -�ΰ�? ���̸� ���ڴ� : �����̸� �߸��Է��ϼ̽��ϴ�.
		//
        //String str = (op =='+') ? (num1 + num2)+"" : (op=='-') ? (num1 - num2)+"" : "�߸� �Է��ϼ̽��ϴ�.";
		  //������ ��Ʈ�����ڿ��� �ٲٴ� ��� (����)+""
		String str = (op =='+') ? String.valueOf(num1 + num2) : 
			(op=='-') ? String.valueOf(num1 - num2) : "�߸� �Է��ϼ̽��ϴ�.";
		  //������ ��Ʈ�����ڿ��� �ٲٴ� �ι�° ��� String.valueof(����)
		System.out.println("��� : " + str);
		
		
		
	}
	// �� ���� '+' �Ǵ� '-'�� �Է¹޾� �˸��� ��� ��� ����ϱ�
	// ��, '+'�� '-'�̿��� ������ �Է½� "�߸� �Է��Ͽ����ϴ�!" ���
	
	// ù ��° �� : 6
	// �� ��° �� : 12
	// ������ �Է�( + or - ) : +
	// ��� 18
	
	// ù�� ° �� : 6
	// �ι� ° �� : 12
	// ������ �Է�( + or- ) : -
	// ���: -6

}
