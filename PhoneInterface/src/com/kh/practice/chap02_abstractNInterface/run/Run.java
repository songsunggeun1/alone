package com.kh.practice.chap02_abstractNInterface.run;

import com.kh.practice.chap02_abstractNInterface.controller.PhoneController;

public class Run {
	public static void main(String[] args) {
		
		PhoneController p = new PhoneController();
		//PhoneController p 객체를 할당하고
		String [] a = p.method(); // p.method를 String배열안에 저장을 한 후
		for(String str : a) { // a배열이 끝날때까지 String str에 하나씩 넣어준 후
			System.out.println(str); // 하나씩 출력
			System.out.println();
		}
	}
}
