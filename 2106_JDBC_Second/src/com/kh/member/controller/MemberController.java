package com.kh.member.controller;

import java.util.List;

import com.kh.member.model.dao.MemberDAO;
import com.kh.member.model.vo.Member;
import com.kh.member.view.MemberView;

public class MemberController {
	
	public MemberController() {}

	public void printAllMember() {
		MemberDAO mDao = new MemberDAO();// 전달받은 값을 DB와 직접적인 연동(전송 및 전달값 받기)을 위한 DAO클래스 객체 생성
		MemberView mView = new MemberView();// 연동 성공, 실패시 사용자에게 결과 알려주기 위한 view객체 생성
		List<Member> mList = mDao.printMemberList(); // 전체조회기 때문에 printMemberList에서 리스트를 생성하여 다중조회
		if(!mList.isEmpty()) { // 입력한 셀렉문의 정보의 유무를 파악하기 위해 isEmpty 사용
			mView.showAll(mList);
		}else {
			mView.displayError("회원 정보 조회 실패");
		}
		
	}

	public void printOneById(String memberId) {
		MemberDAO mDao = new MemberDAO();
		MemberView mView = new MemberView();
		Member memberOne = mDao.printOneById(memberId); // Id는 unique 값이기때문에 중복이 될수 있어서 member객체(리스트X)
		if(memberOne != null) { // ID조회의 여부확인
			mView.showOneById(memberOne); // 조회된 아이디 출력
		}else {
			mView.displayError("아이디로 조회 실패");
		}
	}

	public void printOneByBname(String memberName) {
		MemberDAO mDao = new MemberDAO();
		MemberView mView = new MemberView();
		
		List<Member> mList = mDao.printMembersByName(memberName); // 동명이인이 있을수 있기때문에 ID랑은 다르게 member객체로 이루어진 list활용
		if(!mList.isEmpty()) { // 데이터 조회 확인
			mView.showOneName(mList);
		}else {
			mView.displayError("이름으로 조회 실패");
		}
	}

	public void registerMember(Member member) { // run클래스에서  전달받은 값
		MemberDAO mDao = new MemberDAO(); // 전달받은 값을 DB와 직접적인 연동(전송 및 전달값 받기)을 위한 DAO클래스 객체 생성
		MemberView mView = new MemberView(); // 연동 성공, 실패시 사용자에게 결과 알려주기 위한 view객체 생성
		
		int result = mDao.insertMember(member);
		// 매개변수로 전달받은 값을 mDao클래스 insertMember메소드 매개변수로 전달받은 값을 DAO에서 처리한 리턴값을 result의 저장
		if(result > 0) {
			mView.displaySuccess("회원 가입 성공"); // 조건문 true시 "회원 가입 성공" displaySuccess메소드로 값을 전달
		}else {
			mView.displayError("회원 가입 실패"); // 조건문 false시 "회원 가입 실패" displaySuccess메소드로 값을 전달
		}
		
	}

	public void removeMember(String deleteId) {
		MemberDAO mDao = new MemberDAO();
		MemberView mView = new MemberView();
		
		int result = mDao.deleteMember(deleteId);
		if(result > 0) { // 탈퇴 성공, 실패 확인
			mView.displaySuccess("회원 탈퇴 성공");
		}else {
			mView.displayError("회원 탈퇴 실패");
		}
		
	}

	public void modifyMember(String searchId) {
		MemberDAO mDao = new MemberDAO();
		MemberView mView = new MemberView();
		int result = 0;
		// 1. ID 존재 여부 확인
		// - 아이디가 있으면 입력을 받고
		// - 아이디가 없으면 조회 실패 메세지 출력
		Member searchOne = mDao.printOneById(searchId); // 조회 하고 싶은 아이디를 입력하여 DB에서 데이터를 가져와서
		if(searchOne != null) {
			Member member = mView.modifyMember(searchId); // 조회받은 아이디의 수정한 정보를 member객체로 생성해서
			result = mDao.updateMember(member); // 수정된 정보를 DB에 다시 넘어준다
			if(result > 0) { // 수정된 정보 DB에 반영이 됐는지 성공, 실패 확인
				mView.displaySuccess("회원 정보 수정 성공");
			}else {
				mView.displayError("회원 정보 수정 실패");
			}
		}else {
			mView.displayError("회원 정보 조회 실패");
		}
	}

}
