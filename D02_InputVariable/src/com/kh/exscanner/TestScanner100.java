package com.kh.exscanner;

import java.util.Scanner;

public class TestScanner100 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �����ּ��� ");
		String name = sc.next();
		
		System.out.print("Ű�� �����ּ��� ");
		double height = sc.nextDouble();
		
		System.out.print("�ּҸ� �����ּ��� ");
		sc.nextLine();
		String adress = sc.nextLine();
		
		System.out.print("������ �����ּ��� ");
		char gender = sc.next().charAt(0);
		
		System.out.printf("%s\n" , name);
		System.out.printf("%.2f\n" , height);
		System.out.printf("%s\n" , adress);
		System.out.printf("%c\n" , gender);
		
	}

}
