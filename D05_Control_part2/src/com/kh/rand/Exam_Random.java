package com.kh.rand;

import java.util.Random;

public class Exam_Random {
	public static void main(String [] args) {
		Random rand = new Random();
		for(int i = 0; i < 10; i++) {
			// nextInt(n) -> 0���� n-1������ ������ �� 
			// nextInt(10) -> 0���� 9������ ������ �� 
		System.out.print(rand.nextInt(10));
		}
	    System.out.println();
	    //���� �����غ��� ���� ���ϴ� ������ ������ ���� ������ �� ���� ������?
	    //���� ��� 1 ~ 10 ������ ������ �� ���?
	    /*
	     * nextInt(10) -> 0���� 9������ ������ ��
	     * nextInt(10) + 1 -> 1���� 10���� ������ �� 
	     */
	    
	    for(int i = 0; i < 20; i++) {
	    	System.out.print(rand.nextInt(10)+1 + " ");
	    }
	    System.out.println();
	    System.out.println();
	    
	    //�ѹ��� �����غ��� �׷��ٸ� ���࿡ 20 ~ 35 ������ ������ ���� ���ϰ� �ʹ�.
	    //�׷��� ��� �ؾ� �ұ�?
	    // 20 ~ 35
	    // 0 ~ 15 -> rand.nextInt(16);
	    // 20 ~ 35 -> rand.nextInt(16)+20;
	    
	    
	    // rand.nextInt(n)    ->  0 ~ n-1 ������ ������ ��
	    // rand.nextInt(10)+1   ->  0+1 ~ 9+1 ������ ������ ��
	    // rand.nextInt(20)+1   ->  0+1 ~ 19+1 ������ ������ �� 
	    // rand.nextInt(30)+1   ->  0+1 ~ 29+1 ������ ������ ��
	    // rand.nextInt(16)+20    -> 0+20 ~ 15+20 ������ ������ �� 
	    for(int i = 0; i < 20; i++) {
	    	System.out.print(rand.nextInt(16)+20 + " ");
	    }
	}

}
