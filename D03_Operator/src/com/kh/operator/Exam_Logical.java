package com.kh.operator;

public class Exam_Logical {
	public static void main(String [] args) {
		System.out.println("�������� ����");
		//a�� 50, b�� 30�� �� ������ ������ ����� �����غ��ÿ�
		int a = 50, b = 50;
		boolean result1, result2, result3, result4;
		result1 = (a!=b) && (a<b); // false
		result2 = (a<b) || (a==b); // false
		result3 = (a>b) && (a!=b); // true
		result4 = (a>b) || (a==b); // true
		System.out.println("result1�� ���� : " + result1);
		System.out.println("result2�� ���� : " + result2);
		System.out.println("result3�� ���� : " + result3);
		System.out.println("result4�� ���� : " + result4);
		System.out.println();
		
		System.out.println("�������� ����2");
		int aNum = 70;
		int bNum = 55;
		boolean resultOne, resultTwo, resultThree, resultFour;
		// ���׿�����, �񱳿�����, �������� ���!!
		resultOne = (aNum == bNum) || (aNum++ < 100);
		//(false) || (true) = true / 70, 55
		resultTwo = (aNum < bNum) && (--bNum < 55);
		//(false) && (true) = false / 71 55
		//�� �Ŀ��� false�� ���⶧���� ���� ���� ������ ���� ����
		resultThree = (aNum != bNum) && (bNum-- < aNum++);
		//(true) && (true) = true  71 55
		resultFour = (aNum++ != bNum) || (bNum++ >= 85);
		//(true) || (false) = true / 73 54
		//�� �Ŀ��� true�� ���� ������ ���� ���� ������ ���� ����
		System.out.println("aNum�� �� : " + aNum + ", bNum�� �� : " + bNum);
		System.out.println("resultOne�� ����� : " +resultOne);
		System.out.println("resultTwo�� ����� : " +resultTwo);
		System.out.println("resultThree�� ����� : " +resultThree);
		System.out.println("resultFour�� ����� : " +resultFour);
		System.out.println(1<2 && 3>2 && 4<2);
	}

}
