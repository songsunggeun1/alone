package com.kh.operator;

import java.util.Random;
import java.util.Scanner;

public class Exam_TripleAlone {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println();
		// ===========================================
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("==== ���� ���� �� ���� ====");
		System.out.print("���ڸ� �����ϼ��� 1.���� 2.���� 3.�� : ");
		String pla = "";
		String com = "";
		int a = rand.nextInt(3)+1;
		int b = sc.nextInt();
		
		if(a == 1) {
			com = "����";
			}else if(a == 2) {
				com = "����";
			}else {
				com = "��";
			}
		if(b == 1) {
			pla = "����";
			}else if(b == 2) {
				pla = "����";
			}else {
				pla = "��";
			}
		System.out.println("�÷��̾�� "+ pla + "�½��ϴ�.");
		System.out.println("��ǻ�ʹ� "+ com + "�½��ϴ�.");

		if (a == b) {
			System.out.println("�����ϴ�.");
		} else if(b-a==1 || (a==3 && b==1)){
			System.out.println("�÷��̾ �̰���ϴ�.");
		}else {
			System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
		}
//=================================================================
		System.out.println("======= UP & DOWN GAME ==============");
		int game = rand.nextInt(99)+1;
		
		while(true) {
			System.out.print("player �����Դϴ� : ");
			int player = sc.nextInt();
			if(player < game) {
				System.out.println("UP!!!");
			}else if(player == game){
				System.out.println("BINGO!!!!");
				break;
			}else {
				System.out.println("DOWN!!!");			
			}
			int computer = rand.nextInt(99)+1;
			System.out.println("comter�� "+ computer + "�� ������ϴ�.");
			if(computer < game) {
				System.out.println("UP!!!");
			}else if(computer == game){
				System.out.println("BINGO!!!!");
				break;
			}else {
				System.out.println("DOWN!!!");			
			}			
		}
		
		
		
		
		
		
		
		
	}
	

}
