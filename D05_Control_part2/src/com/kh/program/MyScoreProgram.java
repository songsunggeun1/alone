package com.kh.program;

import java.util.Scanner;

public class MyScoreProgram {
	public static void main(String [] args) {
		/*
		 * ====== ���θ޴� ======
		 * 1. �����Է�
		 * 2. �������
		 * 3. ����
		 * ���� : 1
		 * 
		 * ====== ���� �Է� ======
		 * ���� : 50
		 * ���� : 40
		 * ���� : 30
		 * 
		 * ======���� �޴� ======
		 * 1. �����Է�
		 * 2. �������
		 * 3. ����
		 * ���� : 2
		 * 
		 * ====== ���� ��� ======
		 * ���� : 50
		 * ���� : 40
		 * ���� : 30
		 * 
		 * ���� : 120
		 * ��� : 40.00
		 * 
		 * ======���� �޴� ======
		 * 1. �����Է�
		 * 2. �������
		 * 3. ����
		 * ���� : 3
		 * 
		 * Good Bye ~
		 */
		Scanner sc= new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		float avg = 0;
		���� : // ���ѹݺ� ����
			while(true) {
		System.out.println("====== �޴��� �������ּ��� ======"
				+ "\n1. �����Է�\n2. �������\n3. ����");
		System.out.print("���� : ");
		int choice = sc.nextInt();
			switch(choice) {
			case 1 :
				System.out.println("====== �����Է� ======");
				do {
					System.out.print("���������� �Է��ϼ��� : ");
					kor = sc.nextInt();
					if(kor < 0 || kor > 100) {
						System.out.println("�ٽ� �Է����ּ���.");
					}
				}while(kor < 0 || kor > 100);
				/*do ~ while�� ����� ���� : 
				 * ������ 100���� �Ѿ�� �ȵǱ� ������
				 * �����ȿ� ������ ���ѹݺ����� ���
				 */
				do {
				System.out.print("���������� �Է��ϼ��� : ");
				eng = sc.nextInt();
				if(eng < 0 || eng > 100) {
					System.out.println("�ٽ� �Է����ּ���.");
				}
				}while(eng < 0 || eng > 100);
				do {
				System.out.print("���������� �Է��ϼ��� : ");
				math = sc.nextInt();
				if(math<0 || math>100) {
					System.out.println("������ �ٽ� �Է����ּ���.");
				}
				}while(math<0 || math>100);
				System.out.println("���� : "+kor);
				System.out.println("���� : "+eng);
				System.out.println("���� : "+math);
				break;
				
				
				// The local variable kor may have been initialized
				// kor ������ �ʱ�ȭ ������� �� ����
				/*int math = sc.nextInt();�� ���ٽ�
				 *case 1 �ȿ����� ���������� �Ǳ� ������
				 *�������� int kor = 0; �̶�� ������ �̸� ���ش�.
				 *�׷��߸� case 1�� ����� scanner�� ������ ��� �� �� �ִ�.
				 */
				
			case 2 :
				System.out.println("====== ������� ======");
				total = kor + eng + math;
				avg = total / 3.0f;
				System.out.println("���� : " + kor);
				System.out.println("���� : " + eng);
				System.out.println("���� : " + math);
				System.out.println("���� : " + total);
				System.out.printf("������� : %.2f \n",avg);
				break;
				
				
			case 3 :
				break ����; // ���ѹݺ� ��
				
				default :
					System.out.println("1~3 ������ ���� �����ּ���.");
			}
		}
		System.out.println("GOOD BYE ~");
	}

}
