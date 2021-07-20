package com.kh.rand;

import java.util.Random;

public class Exam_Random {
	public static void main(String [] args) {
		Random rand = new Random();
		for(int i = 0; i < 10; i++) {
			// nextInt(n) -> 0부터 n-1까지의 랜덤한 수 
			// nextInt(10) -> 0부터 9까지의 랜덤한 수 
		System.out.print(rand.nextInt(10));
		}
	    System.out.println();
	    //조금 응용해보면 내가 원하는 범위의 랜덤한 수를 추출할 수 있지 않을까?
	    //예를 들어 1 ~ 10 사이의 랜덤한 수 출력?
	    /*
	     * nextInt(10) -> 0부터 9까지의 랜덤한 수
	     * nextInt(10) + 1 -> 1부터 10까지 랜덤한 수 
	     */
	    
	    for(int i = 0; i < 20; i++) {
	    	System.out.print(rand.nextInt(10)+1 + " ");
	    }
	    System.out.println();
	    System.out.println();
	    
	    //한번더 응용해보면 그렇다면 만약에 20 ~ 35 사이의 랜덤한 수를 구하고 싶다.
	    //그러면 어떻게 해야 할까?
	    // 20 ~ 35
	    // 0 ~ 15 -> rand.nextInt(16);
	    // 20 ~ 35 -> rand.nextInt(16)+20;
	    
	    
	    // rand.nextInt(n)    ->  0 ~ n-1 사이의 랜덤한 수
	    // rand.nextInt(10)+1   ->  0+1 ~ 9+1 사이의 랜덤한 수
	    // rand.nextInt(20)+1   ->  0+1 ~ 19+1 사이의 랜덤한 수 
	    // rand.nextInt(30)+1   ->  0+1 ~ 29+1 사이의 랜덤한 수
	    // rand.nextInt(16)+20    -> 0+20 ~ 15+20 사이의 랜덤한 수 
	    for(int i = 0; i < 20; i++) {
	    	System.out.print(rand.nextInt(16)+20 + " ");
	    }
	}

}
