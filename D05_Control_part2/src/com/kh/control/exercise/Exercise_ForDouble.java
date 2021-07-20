package com.kh.control.exercise;

public class Exercise_ForDouble {
	public void exercise1() {
		// 0시 0분부터 23시 59분까지 출력하기!
		for(int hour = 0; hour<=23; hour++) {
			for(int min=0; min<=59; min++) {
				System.out.printf("%2d시 %2d분 \n", hour , min);
			}
		}
		
	}
	public void exercise2() {
		// 구구단을 출력하되(\t)->tap만큼 띄어짐
		// 2단 옆에 3단, 3단 옆에 4단, 4단옆에 5단...9단
		//2 * 1 = 2   3 * 1 = 3     
		//2 * 2 = 4   3 * 2 = 6
		
		//2 * 9 = 18  3 * 9 = 18 
		
//		for(int i = 1; i <= 9; i++) {
//			for(int j = 2; j <=9; j++) {
//				System.out.printf("%2d * %2d = %2d\t", j, i, i*j);
//				if(j==9) {
//					System.out.println();
//				}	
//			}
		
		for(int i =1; i<10; i++) {
			for(int j = 2; j <10; j++) {
				System.out.printf("%d * %d = %d\t",j,i,j*i);
			}
			System.out.println();
		}
	}	
	public void exercise3() {
		//*
		//**
		//***
		//****
		//*****
		//******
		//*******
		//********
		//*********
		//**********

		for(int i = 0; i <10; i++) {
			for(int j = 0; j <i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
			//변하는 변수를 이용해보자
		}
	}
		
		
		
	}
