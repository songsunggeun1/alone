package com.kh.control.run;

import com.kh.control.exercise.Exercise_For;
import com.kh.control.exercise.Exercise_If;
import com.kh.control.exercise.Exercise_Switch;
import com.kh.control.exercise.Exercise_While;
//어떤 위치 어떤 패키지에 있는지 보여준다 Exercise_If적고 ctrl+space bar

public class Run {
	public static void main(String [] args) {
		Exercise_If exIf = new Exercise_If();
		//내가만든 참조형 자료형은 사용한다
		//exIf를 통해서 exercise_If를 사용할 수 있다
		//new라는 키워드를 사용해서 Exercise_If 클래스를 사용할 수 있다
//		exIf.exercise1(); 
//		exIf.exercise2();
//		exIf.exercise3();
		// 메인함수에 적은 후 호출한다
		
		Exercise_Switch exSwitch = new Exercise_Switch();
//		exSwitch.exercise1();
//		exSwitch.exercise2();
//		exSwitch.exercise3();
		
		
		Exercise_For exFor = new Exercise_For();
//		exFor.exercise1();
//		exFor.exercise2();
//		exFor.exercise3();
		
		Exercise_While exWhile = new Exercise_While();
//		exWhile.exercise1();
//		exWhile.exercise2();
//		exWhile.exercise3();
		exWhile.exercise4();
		
		
		
	}

}
