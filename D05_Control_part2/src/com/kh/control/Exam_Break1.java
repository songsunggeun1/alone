package com.kh.control;

import java.util.Scanner;

public class Exam_Break1 {
	public static void main(String [] args) {
		// break���� ���� ����� �ݺ����� ���������� ����
		// for���� ��ø���� �Ǿ����� �� ���������� �Ϸ��� break 2�� �ʿ�.
		
		// ���ڿ��� �Է¹޾� ���� ������ ����ϴ� ���α׷��ε�
		// "end"�� �Է��� �Ǹ� �ݺ��� ������
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("���ڿ� �Է� : ");
			String str = sc.nextLine();
			
			// 1. ���ڿ��� �񱳴� ��� �� ���ΰ�? - equals
			if(str.equals("end")) {
				System.out.println("���α׷��� ����˴ϴ�.");
				break;
			}
			// .equals("");�� ��ü�ð��� ���ű� ������ ������
			
			// 2. ���ڿ��� ����, ������ ��� ����ϴ°��ΰ�? - length()
			System.out.println("���� ���� : " + str.length());
		}
		
		
		
	}

}
