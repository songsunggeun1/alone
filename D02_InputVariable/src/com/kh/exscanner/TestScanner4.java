package com.kh.exscanner;

import java.util.Scanner;

public class TestScanner4 {
	public static void main(String [] args) {
		//�̸�(String), �¾ ��(int),�ּ�(String)
		//Ű(double),������(double)
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��� �ּ���.");
		String name = sc.next();
		//�̸��� ���� ������ ������ ��� sc.next(); ���
		
		System.out.println("�¾ ���� �����ּ���.");
		int birth = sc.nextInt();
		
		
		System.out.println("�ּҸ� �����ּ���.");
		sc.nextLine();
		//�¾ ���� �Է��ϰ� ģ ���Ͱ��� ������ �޲ٱ� ����
		//sc.nextLine();�� �ѹ� �� ����Ͽ� ���� �޲�
		
		String adress = sc.nextLine();
		//������ �����ÿ� sc.next�� �ƴ� sc.nextLine
		
		System.out.println("Ű�� �����ּ���.");
		double height = sc.nextDouble();
		
		System.out.println("�����Ը� �����ּ���.");
		double weight = sc.nextDouble();
		
		System.out.println("������ �Է����ּ���.");
		char gender = sc.next().charAt(0);
		//��ǻ�Ϳ��� ù��° index������ 0���� �����ϱ� ������
		//charAt(0);
		
//		System.out.println("�̸� : " +name);
//		System.out.println("�¾ �� : " +birth);
//		System.out.println("�ּ� : " +adress);
//		System.out.println("Ű : " +(int)height);
//		//double �ڷ��������� ����� �� �Ҽ����� �ʿ���
//		//(int)�� ��������ȯ ����
//		//ū �����Ϳ��� ���������ͷ� ���� ����ȯ�� �߱� ������ �����ͼս� ����
//		//173.2 -> 173 �Ҽ��� ������ �ս�
//		System.out.println("������ : " +weight);
//		System.out.println("���� : " +gender);
		
		
		
		//print()�� println()�� ������
		//ln�� enter ����(���ٷ� �Ѿ�ٰ� �����ϸ��,�ٹٲ�)
		//printf()�� ���� : ����(%d), �Ǽ�(%f), ����(%c), ���ڿ�(%s)
//		System.out.println("�̸� : " +name);
		System.out.printf("�̸� : %s\n", name);
//		System.out.println("�¾ �� : " +birth);
		System.out.printf("�¾ �� : %d\n", + birth);
//		System.out.println("�ּ� : " +adress);
		System.out.printf("�ּ� : %s\n", adress);
//		System.out.println("Ű : " +(int)height);
		System.out.printf("Ű : %.2f\n" , height);
//		System.out.println("������ : " +weight);
		System.out.printf("�����Դ� : %.1f\n", weight);
//		System.out.println("���� : " +gender);
		System.out.printf("���� : %c\n", gender);
		
	}

}
