package com.kh.member.controller;

import java.util.List;

import com.kh.member.model.dao.MemberDAO;
import com.kh.member.model.service.MemberService;
import com.kh.member.model.vo.Member;
import com.kh.member.view.MemberView;

public class MemberController {
	
	public MemberController() {}

	public void printAllMember() {
		MemberService mService = new MemberService();
		MemberView mView = new MemberView();
		
		List<Member> mList = mService.printAll();
		if(!mList.isEmpty()) {
			mView.showAllList(mList);
		}else {
			mView.displayError("회원 정보 조회 실패");
		}
		
	}

	public void printOneById(String memberId) {
		MemberService mService = new MemberService();
		MemberView mView = new MemberView();
		
		Member memberOne = mService.printOneById(memberId);
		if(memberOne != null) {
			mView.showOneById(memberOne);
		}else {
			mView.displayError("회원 아이디로 검색 실패");
		}
		
	}

	public void printMembersByname(String memberName) {
		
		MemberService mService = new MemberService();
		MemberView mView = new MemberView();
		
		List<Member> members = mService.printMembersByName(memberName);
		if(!members.isEmpty()) { // 객체면 != null, List는 isEmpty
			mView.printMembersByName(members);
		}else {
			mView.displayError("이름으로 조회 실패");
		}
		
	}

	public void registerMember(Member member) {
		
		MemberService mService = new MemberService();
		MemberView mView = new MemberView();
		
		int result = mService.inputMember(member);
		if(result > 0) {
			mView.displaySuccess("회원 가입 성공");
		}else {
			mView.displayError("회원 가입 실패");
		}
		
	}

	public void modifyMember(String searchId) {
		MemberService mService = new MemberService();
		MemberView mView = new MemberView();
		
		int result = 0;
		Member searchOne = mService.printOneById(searchId);
		if(searchOne != null) {
			result = mService.modifyMember(mView.modifyMember(searchId));
			if(result > 0) {
				mView.displaySuccess("회원 정보 수정 완료");
			}else {
				mView.displayError("회원 정보 수정 실패");
			}
		}else {
			mView.displayError("회원 정보 조회 실패");
		}
		
	}

	public void removeMember(String deleteId) {
		
		MemberService mService = new MemberService();
		MemberView mView = new MemberView();
		int result = 0;
		
		result = mService.deleteMember(deleteId);
		if(result > 0) {
			mView.displaySuccess("회원 탈퇴 성공");
		}else {
			mView.displayError("회원 탈퇴 실패");
		}
		
		
	}

}
