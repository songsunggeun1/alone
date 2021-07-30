package net.kh.member.controller;

import java.util.List;

import net.kh.member.model.dao.MemberDAO;
import net.kh.member.model.vo.Member;
import net.kh.member.view.MemberView;

public class MemberController {
	
	public void registerMember(Member member) {
		
		MemberDAO memberDao = new MemberDAO();
		MemberView view = new MemberView();
		

		int result = memberDao.insertMember(member);
		// view에서 받은 member를 매개변수로 받고 DAO로 보낸후 result 리턴값을 받는다
		if(result > 0) {
			view.displaySuccess("가입 성공");
			//성공은 result가 0보다 클 때
			//왜 그러냐면 JDBC에서 사용하는 메소드의
			//리턴값이 성공일 때 0보다 큰 값을 리턴하기 때문
		}else {
			view.displayError("가입 실패");
			//실패는 result가 0 또는 다른값일때
		}
		
	}
	
	
	public void printAll() {
		
		MemberDAO memberDao = new MemberDAO();
		MemberView view = new MemberView();
		List<Member> memberList = memberDao.printAll();
		// MemberDAO에서 mList(ArrayList) 리턴값을 가져옴
		
		if(!memberList.isEmpty()){
			view.showAll(memberList);
		}else {
			view.displayError("회원 정보 조회 실패");
		}
		
	
		
	}

	public void printOneById(String memberId) { // ID로 조회하기
		// view.inputMemberId 리턴값을 run을 통해서 멤버변수로 받음
		MemberDAO memberDao = new MemberDAO();
		MemberView view = new MemberView();
		Member memberOne = memberDao.printOneById(memberId);
		// DAO에서 리턴값으로 받은 member를 null아니면 showOne으로 보냄
		if(memberOne != null) {
			view.showOne(memberOne);
			}else {
				view.displayError("회원 정보 아이디로 조회 실패");
			}
		}

	public void printOneByName(String memberName) { 
		// 이름으로 조회하기(이름으로 조회했을때는 동명이인이 존재할 수 있기 때문에 List로 저장)
		MemberDAO memberDao = new MemberDAO();
		MemberView view = new MemberView();
		List<Member> memberList = memberDao.printOneByName(memberName);
		// 입력받은 name을 DAO에서 DB와 연동시켜 DB에서 받은 데이터를 list에 저장한 데이터를
		// 호출하여 리턴값을 받음
		if(!memberList.isEmpty()){
			view.showOneName(memberList);
		// list에 저장된 데이터를 출력하는 곳으로 이동
		}else {
			view.displayError("회원 정보 조회 실패");
		}
		
	}

	public void removeMember(String memberId) {
		MemberDAO memberDao = new MemberDAO();
		MemberView view = new MemberView();
		int result = memberDao.deleteMember(memberId);
		if(result > 0) {
			view.displaySuccess("회원 탈퇴 성공");
		}else {
			view.displayError("회원 탈퇴 실패");
		}
	}
	public Member getOneById(String memberId) { // ID로 조회하기
		// view.inputMemberId 리턴값을 run을 통해서 멤버변수로 받음
		MemberDAO memberDao = new MemberDAO();
		Member memberOne = memberDao.printOneById(memberId);
		return memberOne;
		}


	public void modifyMember(Member member, String memberId) {
		MemberDAO memberDao = new MemberDAO();
		MemberView view = new MemberView();	
		member.setMemberId(memberId);
		// run에서 받은 memberId정보를 setter로 member의 memberId 멤버변수에
		// 값을 입력시켜주고 DAO에서 id를 쓸수있도록 해줬다 ┐
		int result = memberDao.updateMember(member);
		if(result > 0) {
			view.displaySuccess("회원 정보 수정 성공");
		}else {
			view.displayError("회원 정보 수정 실패");
		}
	}
		
}
