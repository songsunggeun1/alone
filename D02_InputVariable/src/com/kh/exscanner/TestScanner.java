package com.kh.exscanner;

import java.util.Scanner;

public class TestScanner {
	public static void main(String [] args) {
		// ���� �Է��� �޾� ���α׷� �ۼ�
		Scanner sc = new Scanner(System.in);
		//������ �ڷ��� . ���� . new Scanner��� �ּҸ� sc��� ����
		System.out.println("int ���� �Է����ּ���.");
		int input1 = sc.nextInt();//�Է°���
		System.out.println("�Է��� ���� : " + input1);
		
		System.out.println("int �ι�° ���� �Է��� �ּ���.");
		int input2 = sc.nextInt();//�Է°���
		System.out.println("�Է��� �� ��° ���� : " + input2);//��ºκ�
		
		System.out.println("int ���� ° ���� �Է����ּ���.");
		int input3 = sc.nextInt();
		System.out.println("�Է��� ���� ° ���� : " + input3);
		
		int result = input1 + input2 + input3;
		System.out.println("�� ���� ���� : "+ result);
		//sc.close(); ������ sc��� ���� �� �� �Ŀ��� ��ƾߵǴµ�
		//���� ���� �𸣱� ������ ������ �д�.
	}

}
