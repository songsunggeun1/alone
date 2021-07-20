package com.kh.control.run;

import com.kh.control.exercise.Exercise_Break_Continue;
import com.kh.control.exercise.Exercise_ForDouble;
import com.kh.control.exercise.Exercise_Random;

public class Run {
	public static void main(String [] args) {
		Exercise_Break_Continue exBreakContinue
		= new Exercise_Break_Continue();
		
//		exBreakContinue.exercise1();
//		exBreakContinue.exercise2();
		
	    Exercise_ForDouble exForDouble = new Exercise_ForDouble();
//	    exForDouble.exercise1();
//	    exForDouble.exercise2();
//	    exForDouble.exercise3();
	    
	    Exercise_Random exRandom = new Exercise_Random();
//	    exRandom.exercise1();
//	    exRandom.exercise2();
	    exRandom.exercise3();
	}

}
