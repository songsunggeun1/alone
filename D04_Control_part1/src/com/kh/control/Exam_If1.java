package com.kh.control;

import java.util.Scanner;

public class Exam_If1 {
	public static void main(String [] args) {
		// ���� �ϳ� �Է����ּ��� : 44
		// ����Դϴ�.
		
		// ���� �ϳ� �Է����ּ��� : -1
		// �����Դϴ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է����ּ��� : ");
		int num1 = sc.nextInt();
		if(num1 > 0) {
			System.out.println("����Դϴ�");
		}else {
			System.out.println("�����Դϴ�");
		}
//		else�� �����ʴ´ٸ� if���� �ѹ��� �ᵵ ������ �����ϰ� else�� �Ἥ ���
		if(num1 < 0) {
			System.out.println("�����Դϴ�");
		}
		//�Է¹��� ������ ���, 0, �������� �Ǻ��Ͻÿ�.
		System.out.println();
		System.out.println();
		
		
		
//		if(num1>0) {
//			System.out.println("����Դϴ�");
//		}
//		if(num1<0) {
//			System.out.println("�����Դϴ�");
//		}
//		if(num1==0) {
//			System.out.println("0�Դϴ�");
//		}
		if(num1 > 0) {
			System.out.println("����Դϴ�");
		}else if(num1 == 0){
			System.out.println("0�Դϴ�");
		}else {
			System.out.println("�����Դϴ�");
			}
		//if�� 3���� ���� if�� 3�� ��� ������ ������
		//else if�� ���� else if�� ���� �� else�� ���� ����
		//�Է��� ���� 0�� �� ���̸� ������.
		
	}

}
