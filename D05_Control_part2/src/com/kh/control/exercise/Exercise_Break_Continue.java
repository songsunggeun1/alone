package com.kh.control.exercise;

import java.util.Scanner;

public class Exercise_Break_Continue {
	
	public void exercise1() {
		//���� �ϳ��� �Է� ���� ��
		//1���� �Է��� ���ڱ����� ���� ����Ͻÿ�
		/*
		 * �����ϳ� �Է��ϼ��� : 5
		 * 1���� 5������ �� : 15
		 * 1+2+3+4+5 - 1�� �����ϸ鼭 �ݺ��Ͽ� �����ش�?
		 */
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("�����ϳ��� �Է����ּ���.");
		int num = sc.nextInt();
//		for(int i = 1; i <= num; i++) {
//			sum = sum + i;
//		}
//		System.out.println("1���� " + num + "������ �� : "+ sum);
//		//for���� �̿��� Ǯ��
		
		
//		int i = 1;
//		while(i <= num) {
//			sum = sum + i;
//			i++;
//		}
//		System.out.println("1���� " + num + "������ �� : "+ sum);
		//while���� �̿��� Ǯ��
		
		
		int i = 1; // 1���� ���ؾ� �Ǵϱ�
		while(true) { // ��� ���ؾ� �ϴϱ�(���ѹݺ���)
			sum+=i; // 1���� i���� ���ؾ� �ϴϱ�
			if(i==num) break; // i�� �Է��Ѱ����� ���ؾ� �ϴϱ�
			i++; // 1�� ��� �����ϸ鼭 ���ؾ� �ϴϱ�
		}
		System.out.println("1���� " + num + "������ �� : "+ sum);
		//while�� break�� �̿��� Ǯ��
		
		
		
	}

	public void exercise2() {
		/*
		 * 1���� 100������ �������� ���� ����ϴµ�
		 * 4�� ����� ���� ���Ͽ� ����Ͻÿ�.
		 */
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			// i�� 4�� ����� sum+=i�� ������� �ʵ�����
			/*
			 * continue�� ����Ǹ� �ٷ� ���������� ���� �ʰ� �ٷ� ���ǽ����� ����
			 * �׷��� 4�� ����� ������ ��� sum+=i �����ʾƾ� �ǰ�
			 * ���� �ٽ� ���ǽ����� ���ߵǱ� ���� 
			 */
			if(i%4==0) continue; // 4�� ����� ����
			sum+=i; // ������ ���� ��� ���Ѵ�
		}
		System.out.println("�� : " + sum);
		
		
	}
}
