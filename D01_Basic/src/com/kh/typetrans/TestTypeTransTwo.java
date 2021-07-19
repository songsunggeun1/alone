package com.kh.typetrans;

public class TestTypeTransTwo {
	public static void main(String [] args) {
		int num = 2147483647; // 2147483648 출력을 원함
		int result = num + 1;
		System.out.println(result);
		//오버플로우가 일어나면서 -2147483648값이 출력된다
		//int의 최댓값에서 1을 더하면 부호비트가 1이되고 나머지 0이 되서 -2147483648출력 
		long resultTwo = (long)num+1;
		System.out.println(resultTwo);
		//작은 데이터타입에서 큰 데이터타입으로 형변환해서 데이터손실 x
	}

}
