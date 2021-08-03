package com.kh.member.controller;

import java.util.ArrayList;

import com.kh.member.model.dao.MemberDAO;
import com.kh.member.model.service.MemberService;
import com.kh.member.model.vo.Member;
import com.kh.member.view.MemberView;

public class MemberController {

	public void printAll() {
		
		MemberService mService = new MemberService();
		MemberView mView = new MemberView();
		
		ArrayList<Member> mList = mService.printAll();
		if(!mList.isEmpty()) {
			mView.printAll(mList);
		}else {
			mView.displayError("전체 조회 실패");
		}
		
	}

	public void printOneById(String memberId) {
		
		MemberService mService = new MemberService();
		MemberView mView = new MemberView();
		
		Member member = mService.printOneById(memberId);
		if(member != null) {
			mView.printOneById(member);
		}else {
			mView.displayError("이름으로 조회 실패");
		}
		
	}

	public void printOneByName(String memberName) {
		
		MemberService mService = new MemberService();
		MemberView mView = new MemberView();
		
		ArrayList<Member> nameList = mService.printOneByName(memberName);
		if(!nameList.isEmpty()) {
			mView.printOneByName(nameList);
		}else {
			mView.displayError("이름으로 조회 실패");
		}
		
		
		
	}

	public void inputMember(Member member) {
		
		MemberService mService = new MemberService();
		MemberView mView = new MemberView();
		
		int result = mService.inputMember(member);
		if(result > 0) {
			mView.displaySuccess("회원 가입 성공");
		}else {
			mView.displayError("회원 가입 실패");
		}
		
	}

	public void updateMember(String updateId) {
		
		MemberService mService = new MemberService();
		MemberView mView = new MemberView();
		
		Member searchOne = mService.printOneById(updateId);
		if(searchOne != null) {
			int result = mService.modifyMember(mView.modifyMember(updateId));
			if(result > 0 ) {
				mView.displaySuccess("회원 정보 수정 성공");
			}else {
				mView.displayError("회원 정보 수정 실패");
			}
		}else {
			mView.displayError("아이디 조회 실패");
		}
		
		
	}

	public void deleteMember(String deleteId) {
		
		MemberService mService = new MemberService();
		MemberView mView = new MemberView();
		
		int result = mService.deleteMember(deleteId);
		
		if(result > 0){
			mView.displaySuccess("회원 탈퇴 성공");
		}else {
			mView.displayError("회원 탈퇴 실패");
		}
		
		
	}

}
