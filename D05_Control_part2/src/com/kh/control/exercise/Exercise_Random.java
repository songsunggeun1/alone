package com.kh.control.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random {

	public void exercise1() {
		// ���� �� �� ���߱�
		// 1 �Ǵ� 2 ���� �� ������ ����
		// �Է°��� ���� ��
		// ����� ������ �Է°��� ���Ͽ�
		// ������ ����, �ٸ��� ����
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("�����ϳ��� �Է��ϼ���");
		int player = sc.nextInt();
		int computer = rand.nextInt(2) + 1;
		String pla = "";
		String com = "";

		if (player == 1) {
			pla = "�ո�";
		} else {
			pla = "�޸�";
		}
		if (computer == 1) {
			com = "�ո�";
		} else {
			com = "�޸�";
		}
		System.out.println("����� " + pla + " �� �½��ϴ�.");
		System.out.println("��ǻ�ʹ� " + com + " �� �½��ϴ�.");
		if (player == computer) {
			System.out.println("������ϴ�.");

		} else {
			System.out.println("Ʋ�Ƚ��ϴ�.");
		}
		
		// ��������
		// 1. �ѹ� �Է��ϸ� �����µ� �ݺ��ؼ� �Է��ϰ� ���ֽð�
		// 2. 1 �Ǵ� 2 �̿��� ������ �Է��ϸ� �ٽ� �Է��ϰ� ���ֽð�
		// 3. 0�� �Է��ϸ� ����ǵ��� ���ּ���
		
		
	}
	
	public void exercise2() {
		// ����/����/��
		// ���ڸ� �����ϼ��� (1.���� / 2.���� / 3.��) : 1
		// ����� ������ �½��ϴ�.
		// ��ǻ�ʹ� ������ �½��ϴ�.
		// ��ǻ�Ͱ� �¸��Ͽ����ϴ�..loser..
		
		// ���ڸ� �����ϼ��� (1.���� / 2.���� / 3.��) : 2
		// ����� ������ �½��ϴ�.
		// ��ǻ�ʹ� ������ �½��ϴ�.
		// �����ϴ�!!
		
		// ���ڸ� �����ϼ��� (1.���� / 2.���� / 3.��) : 3
		// ����� ���� �½��ϴ�.
		// ��ǻ�ʹ� ������ �½��ϴ�.
		// �÷��̾ �¸��Ͽ����ϴ�!! (^��^)
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int com = rand.nextInt(3)+1;
		System.out.print("���ڸ� �����ϼ��� (1. ���� / "
				+ "2. ���� / 3. ��) : ");
		int pla = sc.nextInt();
		String strCom="";
		String strPla="";
		if(com == 1) {
			strCom = "����";
		}else if(com == 2){
			strCom = "����";
		}else {
			strCom = "��";
		}
		if(pla == 1) {
			strPla = "����";
		}else if(pla == 2){
			strPla = "����";
		}else {
			strPla = "��";
		}
		System.out.println("����� "+ strPla+ " �½��ϴ�.");
		System.out.println("��ǻ�ʹ� "+ strCom+ " �½��ϴ�.");
		if((com == 1 && pla == 1) || (com == 2 && pla == 2) || (com == 3 && pla == 3)) {
//		if(com - pla == 0) {
//			System.out.println("����� "+ pla+ " �½��ϴ�.");
//			System.out.println("��ǻ�ʹ� "+ com+ " �½��ϴ�.");
			System.out.println("�����ϴ�!!");
		}else if((com == 1 && pla == 2) || (com == 2 && pla == 3) || (com == 3 && pla == 1)) {
//		}else if((pla - com == -1) || (com == 3 && pla == 1)) {
//			System.out.println("����� "+ pla+ " �½��ϴ�.");
//			System.out.println("��ǻ�ʹ� "+ com+ " �½��ϴ�.");
			System.out.println("����� �̰���ϴ�!!");
		}else {
//			System.out.println("����� "+ pla+ " �½��ϴ�.");
//			System.out.println("��ǻ�ʹ� "+ com+ " �½��ϴ�.");
			System.out.println("��ǻ�Ͱ� �̰���ϴ�!!");
		}
		
//		Scanner sc = new Scanner(System.in);
//		Random rand = new Random();
//		System.out.println("�����ϳ��� �����ּ��� : 1.���� / 2.���� / 3.�� �Դϴ�.");
//		int player = sc.nextInt();
//		int computer = rand.nextInt(3) + 1;
//		String pla = "";
//		String com = "";
//		if (player == 1) {
//			pla = "����";
//		} else if (player == 2) {
//			pla = "����";
//		} else {
//			pla = "��";
//		}
//		if (computer == 1) {
//			com = "����";
//		} else if (player == 2) {
//			com = "����";
//		} else {
//			com = "��";
//		}
//
//		while (true) {
//			if (player < 1 || player > 3) {
//				System.out.println("�߸��Է��߽��ϴ� �ٽ� �Է����ּ���.");
//				player = sc.nextInt();
//			} else {
//				break;
//			}
//		}
//
//		System.out.println("player : " + pla);
//		System.out.println("computer : " + com);
//		if (player == computer) {
//			System.out.println("�����ϴ�.");
//		} else if ((player == 1 && computer == 3) || (player - computer == 1)) {
//			System.out.println("�÷��̾ �̰���ϴ�.");
//		} else {
//			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
//		}
		//�Ϻ��� ����  107~146��
		
	}
	
	public void exercise3() {
		// UP & DOWN ����
		// �� ������ 1 ~ 100 ������ �� �ϳ��� ���ߴ� �����Դϴ�
		// 0�� �Է��ϸ� ������ �����մϴ�.
		// ���ڸ� �Է����ּ���(user) : 55
		// UP!!
		// ���ڸ� �Է����ּ���(com) : 35
		// UP!!
		// ���ڸ� �Է����ּ���(user) : 66
		// DOWN!!
		// ���ڸ� �Է����ּ���(com) : 22
		// DOWN!!
		// ���ڸ� �Է����ּ���(user) : 11
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random(); // �� ������ 1 ~ 100 ������ �� �ϳ��� ���ߴ� �����Դϴ�
		int player = 0;
		int computer = 0;
		int bingo = rand.nextInt(100)+1; //����
		int playerCount = 0; // user�� ������ 3������ ������ϴ�!!
		int computerCount = 0; // user�� ������ 3������ ������ϴ�!!
//		System.out.println(bingo);
		
		
		while(true) {
			System.out.print("player ���� : ");
			player = sc.nextInt();
			playerCount++;
			if(player == 0){
				System.out.println("���α׷��� ����˴ϴ�.");
				break;
			}else if(player < bingo) {
				System.out.println("UP!!");
				System.out.println("---------------------------");
//				playerCount++;
			}else if(player > bingo) {
				System.out.println("DOWN!!");
				System.out.println("---------------------------");
//				playerCount++;
			}else {
//				playerCount++;
				System.out.println("user�� " + playerCount + "������ ������ϴ�!!");
				break;
			}
			 System.out.print("computer ���� : ");
			computer = rand.nextInt(100)+1;
			computerCount++;
			System.out.println(computer);
			if(computer > bingo) {
				System.out.println("DOWN!!");
				System.out.println("---------------------------");
//				computerCount++;
			}else if(computer < bingo) {
				System.out.println("UP!!");
				System.out.println("---------------------------");
//				computerCount++;
			}else {
//				computerCount++;
				System.out.println("computer�� " + computerCount + "������ ������ϴ�!!");
				break;
			}
		}
		
	}
	

	
	

}
