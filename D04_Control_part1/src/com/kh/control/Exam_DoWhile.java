package com.kh.control;

import java.util.Scanner;

public class Exam_DoWhile {
	public static void main(String [] args) {
		// �Է��� ���� -1�� �ɶ����� ~~ �Ͻÿ�.
		// -1�� �Է��� �ɶ����� �Է��� ���� ��� ���Ͽ� ����Ͻÿ�.
		Scanner sc= new Scanner(System.in);
		//�ݺ����� �������� �ݺ��� �ǰ�
		//Ư�������� �Ǿ��� �� �ݺ����� ���ߴ� ��
		// 1.���ѹݺ����� ��� �� ���ΰ�?
		// for���� ��� for(;;) {}
		// while���� ��� while(true) {}
		
		// 2.Ư�������� �Ǿ��� �� �ݺ����� ��� ���ߴ� ���ΰ�?
		// if���� ���� �� break;
		
//		do {
//			sum = sum + num; // �� ���� �ʱ�ȭ2�� �� ������ ó�� �ݺ��� 0�� �ɷ���
//			System.out.print("���� �Է� : ");
//			num = sc.nextInt(); // ������(~~�� �ɶ�����)
//		}while(num != -1); // ���ǹ� (num)
//		System.out.println("�Է��Ͻ� ���� ���� : " + sum);
		
		
		
		int num = 0;
		int sum = 0;
		while(true) {
			sum = sum + num;
			System.out.print("���� �Է� : ");
			num = sc.nextInt(); 
			// -1�� �Է��ϱ������� true�̱� ������ ���ѹݺ�
			if(num == -1) break;//-1�� �Է��ϰ� �Ǹ� false
			}
		System.out.println("�Է��Ͻ� ���� ���� : " + sum);
	}

}
