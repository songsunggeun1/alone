package com.kh.operator;

import java.util.Scanner;

public class Exam_SSS {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("ù�� ° ���ڸ� �Է��ϼ���.");
		int a = sc.nextInt();
		System.out.println("�� ��° ���ڸ� �Է��ϼ���.");
		int b = sc.nextInt();
		boolean result1 = a==b;
		System.out.println("result1�� ���� : " + result1 + "�Դϴ�");
		System.out.println();
		
		System.out.println("1");
		int ex = sc.nextInt();
		System.out.println("2");
		int ex2 = sc.nextInt();
		
		boolean result2 = ex<ex2;
		System.out.println(result2);
	}

}
