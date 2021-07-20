package com.kh.control.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random {

	public void exercise1() {
		// 동전 앞 뒤 맞추기
		// 1 또는 2 생성 후 변수에 저장
		// 입력값을 받은 후
		// 저장된 난수와 입력값을 비교하여
		// 같으면 정답, 다르면 오답
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("정수하나를 입력하세요");
		int player = sc.nextInt();
		int computer = rand.nextInt(2) + 1;
		String pla = "";
		String com = "";

		if (player == 1) {
			pla = "앞면";
		} else {
			pla = "뒷면";
		}
		if (computer == 1) {
			com = "앞면";
		} else {
			com = "뒷면";
		}
		System.out.println("당신은 " + pla + " 을 냈습니다.");
		System.out.println("컴퓨터는 " + com + " 을 냈습니다.");
		if (player == computer) {
			System.out.println("맞췄습니다.");

		} else {
			System.out.println("틀렸습니다.");
		}
		
		// 개선사항
		// 1. 한번 입력하면 끝나는데 반복해서 입력하게 해주시고
		// 2. 1 또는 2 이외의 값으르 입력하면 다시 입력하게 해주시고
		// 3. 0을 입력하면 종료되도록 해주세요
		
		
	}
	
	public void exercise2() {
		// 가위/바위/보
		// 숫자를 선택하세요 (1.가위 / 2.바위 / 3.보) : 1
		// 당신은 가위를 냈습니다.
		// 컴퓨터는 바위를 냈습니다.
		// 컴퓨터가 승리하였습니다..loser..
		
		// 숫자를 선택하세요 (1.가위 / 2.바위 / 3.보) : 2
		// 당신은 바위를 냈습니다.
		// 컴퓨터는 바위를 냈습니다.
		// 비겼습니다!!
		
		// 숫자를 선택하세요 (1.가위 / 2.바위 / 3.보) : 3
		// 당신은 보를 냈습니다.
		// 컴퓨터는 바위를 냈습니다.
		// 플레이어가 승리하였습니다!! (^오^)
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int com = rand.nextInt(3)+1;
		System.out.print("숫자를 선택하세요 (1. 가위 / "
				+ "2. 바위 / 3. 보) : ");
		int pla = sc.nextInt();
		String strCom="";
		String strPla="";
		if(com == 1) {
			strCom = "가위";
		}else if(com == 2){
			strCom = "바위";
		}else {
			strCom = "보";
		}
		if(pla == 1) {
			strPla = "가위";
		}else if(pla == 2){
			strPla = "바위";
		}else {
			strPla = "보";
		}
		System.out.println("당신은 "+ strPla+ " 냈습니다.");
		System.out.println("컴퓨터는 "+ strCom+ " 냈습니다.");
		if((com == 1 && pla == 1) || (com == 2 && pla == 2) || (com == 3 && pla == 3)) {
//		if(com - pla == 0) {
//			System.out.println("당신은 "+ pla+ " 냈습니다.");
//			System.out.println("컴퓨터는 "+ com+ " 냈습니다.");
			System.out.println("비겼습니다!!");
		}else if((com == 1 && pla == 2) || (com == 2 && pla == 3) || (com == 3 && pla == 1)) {
//		}else if((pla - com == -1) || (com == 3 && pla == 1)) {
//			System.out.println("당신은 "+ pla+ " 냈습니다.");
//			System.out.println("컴퓨터는 "+ com+ " 냈습니다.");
			System.out.println("당신이 이겼습니다!!");
		}else {
//			System.out.println("당신은 "+ pla+ " 냈습니다.");
//			System.out.println("컴퓨터는 "+ com+ " 냈습니다.");
			System.out.println("컴퓨터가 이겼습니다!!");
		}
		
//		Scanner sc = new Scanner(System.in);
//		Random rand = new Random();
//		System.out.println("숫자하나를 적어주세요 : 1.가위 / 2.바위 / 3.보 입니다.");
//		int player = sc.nextInt();
//		int computer = rand.nextInt(3) + 1;
//		String pla = "";
//		String com = "";
//		if (player == 1) {
//			pla = "가위";
//		} else if (player == 2) {
//			pla = "바위";
//		} else {
//			pla = "보";
//		}
//		if (computer == 1) {
//			com = "가위";
//		} else if (player == 2) {
//			com = "바위";
//		} else {
//			com = "보";
//		}
//
//		while (true) {
//			if (player < 1 || player > 3) {
//				System.out.println("잘못입력했습니다 다시 입력해주세요.");
//				player = sc.nextInt();
//			} else {
//				break;
//			}
//		}
//
//		System.out.println("player : " + pla);
//		System.out.println("computer : " + com);
//		if (player == computer) {
//			System.out.println("비겼습니다.");
//		} else if ((player == 1 && computer == 3) || (player - computer == 1)) {
//			System.out.println("플레이어가 이겼습니다.");
//		} else {
//			System.out.println("컴퓨터가 이겼습니다.");
//		}
		//완벽한 정답  107~146줄
		
	}
	
	public void exercise3() {
		// UP & DOWN 게임
		// 이 게임은 1 ~ 100 사이의 수 하나를 맞추는 게임입니다
		// 0을 입력하면 게임을 종료합니다.
		// 숫자를 입력해주세요(user) : 55
		// UP!!
		// 숫자를 입력해주세요(com) : 35
		// UP!!
		// 숫자를 입력해주세요(user) : 66
		// DOWN!!
		// 숫자를 입력해주세요(com) : 22
		// DOWN!!
		// 숫자를 입력해주세요(user) : 11
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random(); // 이 게임은 1 ~ 100 사이의 수 하나를 맞추는 게임입니다
		int player = 0;
		int computer = 0;
		int bingo = rand.nextInt(100)+1; //정답
		int playerCount = 0; // user가 정답을 3번만에 맞췄습니다!!
		int computerCount = 0; // user가 정답을 3번만에 맞췄습니다!!
//		System.out.println(bingo);
		
		
		while(true) {
			System.out.print("player 차례 : ");
			player = sc.nextInt();
			playerCount++;
			if(player == 0){
				System.out.println("프로그램이 종료됩니다.");
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
				System.out.println("user가 " + playerCount + "번만에 맞췄습니다!!");
				break;
			}
			 System.out.print("computer 차례 : ");
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
				System.out.println("computer가 " + computerCount + "번만에 맞췄습니다!!");
				break;
			}
		}
		
	}
	

	
	

}
