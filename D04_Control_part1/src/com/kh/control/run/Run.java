package com.kh.control.run;

import com.kh.control.exercise.Exercise_For;
import com.kh.control.exercise.Exercise_If;
import com.kh.control.exercise.Exercise_Switch;
import com.kh.control.exercise.Exercise_While;
//� ��ġ � ��Ű���� �ִ��� �����ش� Exercise_If���� ctrl+space bar

public class Run {
	public static void main(String [] args) {
		Exercise_If exIf = new Exercise_If();
		//�������� ������ �ڷ����� ����Ѵ�
		//exIf�� ���ؼ� exercise_If�� ����� �� �ִ�
		//new��� Ű���带 ����ؼ� Exercise_If Ŭ������ ����� �� �ִ�
//		exIf.exercise1(); 
//		exIf.exercise2();
//		exIf.exercise3();
		// �����Լ��� ���� �� ȣ���Ѵ�
		
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
