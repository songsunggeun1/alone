package com.kh.operator;

import java.util.Scanner;

public class Exercise_Logical1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է��� �������� 1~100 ������ �������� Ȯ���Ͻÿ�.");
		System.out.print("������ �ϳ� �Է����ּ��� : ");
		int iNum = sc.nextInt();
		boolean result1 = (1<=iNum) && (iNum<=100);
		System.out.println("1���� 100������ �����ΰ�? : "+result1);
		
		System.out.println();
		System.out.println();
		System.out.println("�Է��� �������� 1~100 ������ �������� Ȯ���Ͻÿ�.");
		System.out.print("������ �ϳ� �Է����ּ� : ");
		int iNum2 = sc.nextInt();
		boolean result2 = (1<=iNum2) && (iNum2<=100);
		System.out.println("1���� 100������ �����ΰ�? : "+result2);
		
	}
	// �Է��� �������� 1 ~ 100 ������ �������� Ȯ���Ͻÿ�.
	// ������ �ϳ� �Է����ּ��� : 33
	// 1���� 100������ �����ΰ� : true
	
	
	// ������ �ϳ� �Է����ּ��� : 120
	// 1���� 100������ �����ΰ� : false


}
