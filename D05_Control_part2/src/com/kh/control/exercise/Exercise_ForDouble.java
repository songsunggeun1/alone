package com.kh.control.exercise;

public class Exercise_ForDouble {
	public void exercise1() {
		// 0�� 0�к��� 23�� 59�б��� ����ϱ�!
		for(int hour = 0; hour<=23; hour++) {
			for(int min=0; min<=59; min++) {
				System.out.printf("%2d�� %2d�� \n", hour , min);
			}
		}
		
	}
	public void exercise2() {
		// �������� ����ϵ�(\t)->tap��ŭ �����
		// 2�� ���� 3��, 3�� ���� 4��, 4�ܿ��� 5��...9��
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
			//���ϴ� ������ �̿��غ���
		}
	}
		
		
		
	}
