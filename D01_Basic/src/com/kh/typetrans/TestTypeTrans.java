package com.kh.typetrans;

public class TestTypeTrans {
	public static void main(String [] args) {
		int iNum = 12;
		double dNum = 3.3;
		double result = iNum + dNum;
		System.out.println("자동형변환 연산의 결과 : " + result);
		System.out.println("강제형변환을 통한 결과값 :"+(int)result);
		//정수의값만 필요할시 (int)붙여줌으로써 강제형변환을 하여 정수값만 출력
		//큰 데이터타입에서 작은데이터타입으로 변환되면서 데이터의 손실 일어나는 강제형변환
		
	}

}
