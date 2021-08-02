package com.kh.member.view;

import java.util.List;
import java.util.Scanner;

import com.kh.member.model.vo.Member;

public class MemberView {
	
	public MemberView() {}

	public int mainMenu() {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("====== 회원 정보 관리 프로그램 ======");
		System.out.println("1. 회원 정보 전체 조회");
		System.out.println("2. 회원 정보 아이디 조회");
		System.out.println("3. 회원 정보 이름 조회");
		System.out.println("4. 회원 가입");
		System.out.println("5. 회원 정보 수정");
		System.out.println("6. 회원 탈퇴");
		System.out.println("0. 프로그램 종료");
		System.out.print("번호 입력 : ");
		int choice = sc.nextInt();
		return choice;
	}

	public String inputMemberId() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력해주세요 : ");
		return sc.next(); // 변수안쓰고 바로 리턴해주는 방식
	}

	public String inputMemberName() {
		System.out.print("이름을 입력해주세요 : ");
		return new Scanner(System.in).next();
	}

	public Member inputMember() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String memberId = sc.next();
		System.out.print("비밀번호 : ");
		String memberPwd = sc.next();
		System.out.print("이름 : ");
		String memberName = sc.next();
		System.out.print("나이 : ");
		int memberAge = sc.nextInt();
		System.out.print("성별 : ");
		String memberGender = sc.next();
		System.out.print("이메일 : ");
		String memberEmail = sc.next();
		System.out.print("전화번호 : ");
		String memberPhone = sc.next();
		System.out.print("주소 : ");
		sc.nextLine(); // 엔터제거
		String memberAddress = sc.nextLine();
		System.out.print("취미 : ");
		String memberHobby = sc.next();
		Member member = new Member(memberId, memberPwd, memberName, memberGender, memberAge, memberPhone, memberEmail, memberAddress, memberHobby);
		return member;
	}



	public void showAllList(List<Member> mList) {
		for(Member m : mList) {
			System.out.println("====== 회원 정보 조회 결과 ======");
			System.out.println("회원 아이디 : " + m.getMemberId());
			System.out.println("회원 비밀번호 : " + m.getMemberPwd());
			System.out.println("회원 이름 : " + m.getMemberName());
			System.out.println("회원 성별 : " + m.getMemberGender());
			System.out.println("회원 나이 : " + m.getMemberAge());
			System.out.println("회원 이메일 : " + m.getMemberEmail());
			System.out.println("회원 전화번호 : " + m.getMemberPhone());
			System.out.println("회원 주소 : " + m.getMemberAddress());
			System.out.println("회원 취미 : " + m.getMemberHobby());
			System.out.println("가입 날짜 : " + m.getEnrollDate());
			System.out.println("===========================");
		}
	}

	public void showOneById(Member memberOne) {
		System.out.println("====== 회원 정보 조회 결과(아이디) ======");
		System.out.println("회원 아이디 : " + memberOne.getMemberId());
		System.out.println("회원 비밀번호 : " + memberOne.getMemberPwd());
		System.out.println("회원 이름 : " + memberOne.getMemberName());
		System.out.println("회원 성별 : " + memberOne.getMemberGender());
		System.out.println("회원 나이 : " + memberOne.getMemberAge());
		System.out.println("회원 이메일 : " + memberOne.getMemberEmail());
		System.out.println("회원 전화번호 : " + memberOne.getMemberPhone());
		System.out.println("회원 주소 : " + memberOne.getMemberAddress());
		System.out.println("회원 취미 : " + memberOne.getMemberHobby());
		System.out.println("가입 날짜 : " + memberOne.getEnrollDate());
		System.out.println("==================================");
	}
	
	public void displayError(String message) {
		
		System.out.println("서비스 요청 처리 실패 : " + message);
	}
	
	public void displaySuccess(String message) {
		System.out.println("서비스 요청 처리 성공 : " + message);
	}

	public void printMembersByName(List<Member> members) {
		for(Member m : members) {
			System.out.println("회원 아이디 : " + m.getMemberId());
			System.out.println("회원 비밀번호 : " + m.getMemberPwd());
			System.out.println("회원 이름 : " + m.getMemberName());
			System.out.println("회원 성별 : " + m.getMemberGender());
			System.out.println("회원 나이 : " + m.getMemberAge());
			System.out.println("회원 이메일 : " + m.getMemberEmail());
			System.out.println("회원 전화번호 : " + m.getMemberPhone());
			System.out.println("회원 주소 : " + m.getMemberAddress());
			System.out.println("회원 취미 : " + m.getMemberHobby());
			System.out.println("가입 날짜 : " + m.getEnrollDate());
			System.out.println("==================================");
		}
	}

	public Member modifyMember(String searchId) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 회원 정보 수정 ======");
		System.out.print("비밀번호 : ");
		String memberPwd = sc.next();
		System.out.print("이메일 : ");
		String memberEmail = sc.next();
		System.out.print("전화번호 : ");
		String memberPhone = sc.next();
		System.out.print("주소 : ");
		sc.nextLine();
		String memberAddress = sc.nextLine();
		System.out.print("취미 : ");
		String memberHobby = sc.next();
		Member member = new Member(searchId, memberPwd, memberPhone, memberEmail, memberAddress, memberHobby);
		
		return member;
	}

}
