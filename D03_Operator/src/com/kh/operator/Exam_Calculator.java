package com.kh.operator;

import java.util.Scanner;

public class Exam_Calculator {
	public static void main(String [] args) {
		//�� ���� ���� �Է¹޾Ƽ�
		//+, -, *, /, % ���ϴ� ���α׷�
		Scanner sc = new Scanner(System.in);
		System.out.println("ù ��° ���� �Է� : ");
		int first = sc.nextInt();
		System.out.println("�� ��° ���� �Է� : ");
		int second = sc.nextInt();
		
		//���ϱ�, ����, ���ϱ�, ������, ������ ���
		System.out.println("���ϱ� ��� : " + (first+second));
		System.out.println("���� ��� : " + (first-second));
		System.out.println("���ϱ� ��� : " + (first*second));
		System.out.println("������ ��� : " + (first/second));
		System.out.println("������ ��� : " + (first%second));
	}

}
