package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.GalaxyNote9;
import com.kh.practice.chap02_abstractNInterface.model.vo.Phone;
import com.kh.practice.chap02_abstractNInterface.model.vo.SmartPhone;
import com.kh.practice.chap02_abstractNInterface.model.vo.V40;

public class PhoneController {

	private String[] result = new String[2];

	public String[] method() {
		Phone[] phone = { new GalaxyNote9(), new V40() }; // phone 객체 배열에 갤럭시, V40 객체 저장(업캐스팅)
		for (int i = 0; i < result.length; i++) { //  
			if (phone[i] instanceof GalaxyNote9) { // for문을 이용하여
				result[i] = ((GalaxyNote9) phone[i]).printInformation();
				// 각 객체의 정보를 문자열 배열의 저장을 하여
			} else {
				result[i] = ((V40) phone[i]).printInformation();
				// 각 객체의 정보를 문자열 배열의 저장을 하여, 다운캐스팅
			}
		}
		return result; // 문자열 배열을 반환하는 메소드
	}
}