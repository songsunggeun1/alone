package com.kh.control;

import java.util.Scanner;

public class Exam_Break2 {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		���� : // switch���� break;�� �����Ű�� while �����ų�� ����
		while(true) {
			System.out.println("1. �Է�");
			System.out.println("2. ����");
			System.out.println("3. ��ȸ");
			System.out.println("4. ����");
			System.out.println("0. ����");
			System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				System.out.println("�Է¸޴��Դϴ�.");
				break;
			case 2 :
				System.out.println("�����޴��Դϴ�.");
				break;
			case 3 :
				System.out.println("��ȸ�޴��Դϴ�.");
				break;
			case 4: 
				System.out.println("�����޴��Դϴ�.");
				break;
			case 0 :
				System.out.println("���α׷��� �����մϴ�.");
				break ����;
				// ���⿡ ����;�� ��⶧���� 0���� �Է��Ұ�� while�� ���ᰡ �ȴ�
				// switch������ �ƴ϶� while������ ���� �����Ű�� ��ɾ�
			default : 
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				System.out.println();
				
		/* while(true)���ѹݺ��� �ȿ� switch��(���ǹ�)��
		 * break�� �־ while(true)���� ��� �ݺ������� ������ �ȴ�.
		 * �� ���� ���� : , break ����; �� �����ν� ���� ��ų �� �ִ�. 
		 */
			
			}
		}
	}
}
