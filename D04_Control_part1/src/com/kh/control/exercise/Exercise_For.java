package com.kh.control.exercise;

import java.util.Scanner;

public class Exercise_For {
	public void exercise1() {
	// 1���� 100 ������ �ڿ��� �� Ȧ���� ���Ͽ� ����Ͻÿ�.
		int sum = 0;
		for(int i = 1; i<=100; i+=2) {
			sum += i;
		}
		System.out.print("Ȧ���� ���� : "+sum);
	}

	
	public void exercise2() {
	// ������ �ϳ� �Է¹޾Ƽ� �� ���� 1 ~ 9 ������ ���� ����
	// �� ���� �������� ����Ͻÿ�.
	// ��, ������ ���� ������ "1~9 ������ ����� �Է��Ͽ��� �մϴ�"�� ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("1~9������ ���� �ϳ� �Է����ּ���.");
		int dan = sc.nextInt();
		// 1���� ũ�ų� ���� 9���� �۰ų� ����
		if(dan>=1 && dan <=9) {
			// ������ ���
			// �Է¹��� dan���� �������� ���
			for(int i = 1 ; i < 10; i++) {
				//1�� �����ϸ鼭 �ݺ��Ѵ�? �ݺ��� for�̿�
				//�������� 1~9���� ���ϴ� �ݺ����̱� ������ �� �κ��� for�� �̿�
//				System.out.println(dan+" * "+ i+" = "+ (dan*i));
				System.out.printf("%d *%d = %d \n",dan,i,dan*i);
				//���� ����ϰ� ���� ������ ������ ���Ĺ��� �ۼ� ��
				//�޹ٷ� �����Ͽ� ���
			}
		}else {
			System.out.println("1~9������ ����� �Է��Ͽ��� �մϴ�.");
		}
		
		
	}
	
	
	
	public void exercise3() {
		/*
		 * 1���� 10������ ������ ǥ���ϰ� �յ� ���Ͻÿ�
		 * 1+2+3+4+5+6+7+8+9+10=55
		 */
//		int sum = 0;
//		for(int i = 0; i <=10; i++) {
//			sum+=i;
//		}
//		System.out.println("�հ� : " + sum);
		
		/*�� ����� ������ �� ����� �հ踸 ������ ������
		 * �ؿ� ������� 1+2+3+4+5+6+7+8+9=10 ���� ��µǴ� ���� ������
		 */
		
		
		int sum = 0; // ó�������� 0���� �����ؾ� �Ǳ⶧���� ���Ƿ� ������ ���ش�
		for(int i = 1; i<=10; i++){ 
			// 1�� �����ϰ� 10�� �ǰų� ���������� 1�� �����Ѵ�
			sum+=i; // 0�̶�� ������ �����ؼ� i�� �����ؼ� ���Ѵ�
			System.out.print(i); // i�� ���
			if(i<=9) {
			System.out.print("+"); //i�� ����ϰ� 9�϶����� + ���
			}else {
				System.out.print("=");
				System.out.print(sum);//i�� 10�̸� = ��� �� ��������
			}
		}
		
		
	}
}
