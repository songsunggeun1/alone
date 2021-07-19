package com.kh.variable;

public class TestVarQuiz {
	public static void main(String [] args) {
		System.out.println("hello"+'q');
		//'q'는 유니코드로 출력되지않고 문자열이랑 만나서 문자가 이어짐
		//문자열은 문자, 정수, 실수랑 만나면 이어진다
		System.out.println("hello"+3.14);
		System.out.println(10+20+"hello");
		System.out.println(10+"hello"+20);
		System.out.println("hello"+10);
		System.out.println(10+"hello");
		System.out.println(10+(20+"hello"));
		System.out.println("10"+"20"+"hello");
	}
}
