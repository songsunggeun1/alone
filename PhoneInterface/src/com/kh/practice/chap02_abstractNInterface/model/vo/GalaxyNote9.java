package com.kh.practice.chap02_abstractNInterface.model.vo;

public class GalaxyNote9 extends SmartPhone implements NotePen{
	
	public GalaxyNote9() {
		super.setMaker("삼성");
	}

	@Override
	public String charge() {

		return "고속충전, 고속 무선 충전\n";
	}

	@Override
	public String makeCall() {
		// TODO Auto-generated method stub
		return "번호를 누르고 통화버튼을 누름\n";
	}

	@Override
	public String takeCall() {
		// TODO Auto-generated method stub
		return "전화받기 버튼을 누름\n";
	}

	@Override
	public String picture() {
		// TODO Auto-generated method stub
		return "1300만 화소\n";
	}

	@Override
	public String touch() {
		// TODO Auto-generated method stub
		return "정전식, 와콤펜 지원\n";
	}

	@Override
	public String printInformation() {
		// TODO Auto-generated method stub
		return super.getMaker() + "에서 만들어졌고 제원은 다음과 같다.\n" + this.charge()
		+this.makeCall()+this.takeCall()+this.picture()+this.touch()+this.bluetoothPen();
	}

	@Override
	public boolean bluetoothPen() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
	
	

}
