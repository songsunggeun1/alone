package com.kh.exscanner;

import java.util.Scanner;

public class TestScanner100 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("捞抚阑 利绢林技夸 ");
		String name = sc.next();
		
		System.out.print("虐甫 利绢林技夸 ");
		double height = sc.nextDouble();
		
		System.out.print("林家甫 利绢林技夸 ");
		sc.nextLine();
		String adress = sc.nextLine();
		
		System.out.print("己喊阑 利绢林技夸 ");
		char gender = sc.next().charAt(0);
		
		System.out.printf("%s\n" , name);
		System.out.printf("%.2f\n" , height);
		System.out.printf("%s\n" , adress);
		System.out.printf("%c\n" , gender);
		
	}

}
