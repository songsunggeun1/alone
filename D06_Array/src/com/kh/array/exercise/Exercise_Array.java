package com.kh.array.exercise;

import java.util.Scanner;

public class Exercise_Array {
	
	public void exercise1() {
		// ���̰� 100�� �迭�� �����ϰ� 1���� 100������ ����
		// ������� �־� �� ���� ����ϴ� �ڵ带 �ۼ��Ͻÿ�.
		int[] nums = new int[100]; // ���̰� 100�� �迭 ����
		for (int i = 0; i < 100; i++) {
			nums[i] = i+1; // 1���� 100������ ���� ������� �־�
			System.out.println(nums[i]);//�� ���� ���
		}
	}
		
	
	public void exercise2() {
		// ���̰� 5�� String �迭�� �����ϰ� "����", "������",
		// "Ű��", "���", "�ٳ���"��
		// �ʱ�ȭ �� ��, for���� Ȱ���ؼ� �ٳ����� ����غ����� !
//		String [] fruits = new String[5];
//		fruits [0] = "����";
//		fruits [1] = "������";
//		fruits [2] = "Ű��";
//		fruits [3] = "���";
//		fruits [4] = "�ٳ���";
		String [] fruits = {"����", "������", 
				"Ű��", "���","�ٳ���"};
		//���̰� 5�� String �迭�� ����� �� ���� ���� �ʱ�ȭ �ϰ�
		for (int i = 0; i < 5; i++) {
//			System.out.println(fruits[1]);
		//for���� Ȱ���ؼ� �����Ƹ� ���
			if (fruits[i].equals("������")) {
				System.out.println(fruits[i]);
			//String���� ==�� �ּҰ��� ��, equals�� value�� ��
			}

		}
		String kiwi = "Ű��";
		String badkiwi = new String("Ű��");
		System.out.println("badkiwi : " + badkiwi); // Ű�� ����
		System.out.println("�ּҰ� �� : " + (kiwi == badkiwi));
		System.out.println("���ڿ� �� : " + kiwi.equals(badkiwi));


	}
	
	public void exercise3() {
		/*
		 * ���� ���� 5���� �Է¹޾� �迭�� �����ϰ�
		 * ���� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 */
		Scanner sc = new Scanner(System.in);
		int [] inputs = new int[5];
		int max = 0;
		System.out.println("��� 5���� �Է��ϼ���.");
		for(int i = 0; i < 5; i++) {
			inputs[i] = sc.nextInt();
//			System.out.print(inputs[i]); -> �Է����ڸ��� ������ �ȴ�.
			// ���� ū�� �Ǻ�
			if(inputs[i] > max){
				max = inputs[i];
			// 1�� �Է��ϸ� max�� 1�� ���ϰ� 0�� �Է��ϸ� ��� 1�̰�
			// 3�� �Է��ϸ� max�� 3���� ���ϴ� ������� ���� ū �� �Ǻ�.
			}
		}
		//���� ū �� ���
		System.out.println("���� ū ����"+ max + "�Դϴ�.");
	}
	
	public void exercise4() {
		/*
		 * ���� ���� 5���� �Է¹޾� �迭�� �����ϰ�
		 * �Է¹��� ������ ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 */
		System.out.println("������ 5���� �����ּ���.");
		Scanner sc = new Scanner(System.in);
		int [] nums = new int[5];
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
		//nums.length�� ���̴� 5�� ����.
			nums[i] = sc.nextInt();
			sum = nums[i]+sum;
		}
		System.out.println("����� " + (double)sum/nums.length + " �Դϴ�");
		
	}
	
	public void exercise5() {
		
		/*
		 *  ����ڿ��� �ֹι�ȣ�� �Է� ���� ��
		 *  ���� �ڸ� ���ĺ��� *�� ����Ǿ� ��µǵ��� ���α׷��� �ۼ��Ͻÿ�
		 *  210618-1124600 -> 210618 - 1******
		 *  200518-3233920 -> 220518 - 3******
		 *   
		 */ 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹε�Ϲ�ȣ �Է�(-����) : ");
		String str = sc.next();
		char[] origin = new char[str.length()];
		for (int i = 0; i < origin.length; i++) {
			origin[i] = str.charAt(i);
			// i�� 0���� 13���� �����ϸ鼭 ���ڿ��� �ϳ��� ����(charAt())
			// ���ڹ迭�� �Ҵ�
		}
		char[] copy = new char[str.length()];
		//���� ���縦 ���ؼ� ������ �Ҵ�(���ڿ��� ���̸�ŭ)
		for (int i = 0; i < copy.length; i++) {
			if (i <= 7) {
				copy[i] = origin[i]; //�Ҵ�� ������ ���� ������ ����
			} else {
				copy[i] = '*'; // �����ڸ� ���� * ǥ��
			}
			System.out.print(copy[i]);
		}
		// �Է¹��� ���ڿ��� ���̸�ŭ ���ڹ迭 �Ҵ�(�迭����)
		// ���� �迭�� ����, ������ �� ���ڿ��� �߶� ���ڷ� ����! -> char [] origin ���.
		// str.chatAt(0); -> ���ڿ��� �迭���� ������� char[]�� ����
		// �ֹε�Ϲ�ȣ�� ����� ���ڿ��� �����ϵ�
		// �����ڸ� ���ĺ��ʹ� *�� ó���Ͽ� ����
		// ���
		
	}
	
	public void exercise6() {
		// 5���� ���� �Է¹��� �Ŀ�
		// ���������� �̿��Ͽ� ������������ ������ �� ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		System.out.println("5���� ����� �Է��ϼ��� : ");
		int [] nums = new int[5];
		int temp;
		for(int i = 0; i<nums.length; i++) {
			nums[i] = sc.nextInt(); // 5���� ���� �Է¹޾�
		}
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = i; j > 0; j--) {
				if(nums[j-1] > nums[j]) {
				temp = nums[j-1];
				nums[j-1] = nums[j];
				nums[j] = temp;
				}
			}
		}
		System.out.println();
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}

}
