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
		System.out.print("==== 가위 바위 보 게임 ====");
		System.out.print("숫자를 선택하세요 1.가위 2.바위 3.보 : ");
		String pla = "";
		String com = "";
		int a = rand.nextInt(3)+1;
		int b = sc.nextInt();
		
		if(a == 1) {
			com = "가위";
			}else if(a == 2) {
				com = "바위";
			}else {
				com = "보";
			}
		if(b == 1) {
			pla = "가위";
			}else if(b == 2) {
				pla = "바위";
			}else {
				pla = "보";
			}
		System.out.println("플레이어는 "+ pla + "냈습니다.");
		System.out.println("컴퓨터는 "+ com + "냈습니다.");

		if (a == b) {
			System.out.println("비겼습니다.");
		} else if(b-a==1 || (a==3 && b==1)){
			System.out.println("플레이어가 이겼습니다.");
		}else {
			System.out.println("컴퓨터가 이겼습니다.");
		}
//=================================================================
		System.out.println("======= UP & DOWN GAME ==============");
		int game = rand.nextInt(99)+1;
		
		while(true) {
			System.out.print("player 차례입니다 : ");
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
			System.out.println("comter는 "+ computer + "를 찍었습니다.");
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
