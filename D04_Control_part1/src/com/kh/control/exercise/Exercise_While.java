package com.kh.control.exercise;

import java.util.Scanner;

public class Exercise_While {

	public void exercise1() {
		// while���� �̿��Ͽ� 1 ~ 100 ������ Ȧ���� ���� ����Ͻÿ�. 
//		while(true)//�� ��� ���� �ݺ����̱⶧���� �ʱ��, ������ ��������
		int i = 1;
		int sum = 0;
		while(i<100) {
			sum+=i;
			i+=2;
		}
		System.out.println(sum);
	}
	
	public void exercise2() {
		// while���� �̿��Ͽ� ������ �ϳ� �Է¹޾� �� ���� 1 ~ 9������ �� �϶���
		// �� ���� �������� ����Ͻÿ�.
		// ��, ������ ���� ������ "1 ~ 9 ������ ����� �Է��Ͽ��� �մϴ�"�� ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		System.out.println("1~9������ ����� �Է��Ͽ��� �մϴ�");
		int dan = sc.nextInt();
		if(dan>=1 && dan<=9) {
			int i = 1;
			while(i<10) {
				System.out.printf("%d * %d = %d \n", dan,i,dan*i);
				i++;
			}
		}else {
			System.out.println("1~9������ ������ �Է��ϼ���");
		}
	}
	
	public void exercise3() {
		// while���� �̿��Ͽ� -1�� �Էµ� ������ ������ �Է¹ް�
		// -1�� �ԷµǸ� �Է��� ���� ���� ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("�����ϳ� �Է� : ");
		int num = sc.nextInt();
		int sum = 0;
		while(num != -1) { // (true)�ϰ��� break; �ʿ�
			sum += num;
			System.out.print("�����ϳ� �Է� : ");
			num = sc.nextInt();
		}
		System.out.println("�Է��Ͻ� ������ ���� : " + sum +" �Դϴ�");
		//while(true)�� �̿��ؼ� �Ȱ��� ���� �� �ִ�
		//if(num==-1) break; �� ���ǽ��� ���� �� �ִ�.
	}
	
	public void exercise4() {
		/*
		 *  while���� �̿��Ͽ� -1�� �ɶ����� ���� �������� �Է¹ް� ����� ����Ͻÿ�.
		 *  ������ �Է��ϰ� �������� -1�� �Է��ϼ���
		 *  10
		 *  20
		 *  3
		 *  -20
		 *  -10
		 *  -1
		 *  ������ ������ 5���̸� ����� 0.6�Դϴ�.
		 *  
		 *  ������ �Է��ϰ� �������� -1�� �Է��ϼ���
		 *  -1
		 *  �Էµ� ���� �����ϴ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���.");
		int input = sc.nextInt();
		while(input != -1) {
			sum += input;
			count++;
			input = sc.nextInt();
		}
		if(count==0) {
			System.out.println("�Էµ� ���� �����ϴ�.");
		}else {
			//������
			System.out.print("������ ������ "+ count + "���̸� ");
			System.out.println("����� "+ (double)sum/count + " �Դϴ�.");
		}
		
		
		
	}
}
