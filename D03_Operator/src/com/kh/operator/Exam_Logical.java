package com.kh.operator;

public class Exam_Logical {
	public static void main(String [] args) {
		System.out.println("논리연산자 예제");
		//a가 50, b가 30일 때 다음의 논리연산 결과를 예상해보시오
		int a = 50, b = 50;
		boolean result1, result2, result3, result4;
		result1 = (a!=b) && (a<b); // false
		result2 = (a<b) || (a==b); // false
		result3 = (a>b) && (a!=b); // true
		result4 = (a>b) || (a==b); // true
		System.out.println("result1의 값은 : " + result1);
		System.out.println("result2의 값은 : " + result2);
		System.out.println("result3의 값은 : " + result3);
		System.out.println("result4의 값은 : " + result4);
		System.out.println();
		
		System.out.println("논리연산자 예제2");
		int aNum = 70;
		int bNum = 55;
		boolean resultOne, resultTwo, resultThree, resultFour;
		// 단항연산자, 비교연산자, 논리연산자 고려!!
		resultOne = (aNum == bNum) || (aNum++ < 100);
		//(false) || (true) = true / 70, 55
		resultTwo = (aNum < bNum) && (--bNum < 55);
		//(false) && (true) = false / 71 55
		//앞 식에서 false가 났기때문에 뒤의 식은 연산을 하지 않음
		resultThree = (aNum != bNum) && (bNum-- < aNum++);
		//(true) && (true) = true  71 55
		resultFour = (aNum++ != bNum) || (bNum++ >= 85);
		//(true) || (false) = true / 73 54
		//앞 식에서 true가 났기 때문에 뒤의 식은 연산을 하지 않음
		System.out.println("aNum의 값 : " + aNum + ", bNum의 값 : " + bNum);
		System.out.println("resultOne의 결과는 : " +resultOne);
		System.out.println("resultTwo의 결과는 : " +resultTwo);
		System.out.println("resultThree의 결과는 : " +resultThree);
		System.out.println("resultFour의 결과는 : " +resultFour);
		System.out.println(1<2 && 3>2 && 4<2);
	}

}
