package com.kh.member.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.member.model.vo.Member;

public class MemberView {
	
	Scanner sc;
	
	public MemberView() {
		sc = new Scanner(System.in);
		
	}

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
		return sc.nextInt();
	}
	
	public void displaySuccess(String message) {
		System.out.println("서비스 요청 처리 성공 : " + message);
	}
	
	public void displayError(String message) {
		System.out.println("서비스 요청 처리 실패 : " + message);
	}

	public void printAll(ArrayList<Member> mList) {
		for(Member m : mList) {
			System.out.println(m.toString());
//			System.out.println("이름 : " + m.getMemberId());
		}
	}

	public String insertMemberId() {
		System.out.print("아이디를 입력해주세요 : ");
		return sc.next();
	}

	public void printOneById(Member member) {
		System.out.println(member.toString());
	}

	public String insertMemberName() {
		System.out.print("이름을 입력해주세요 : ");
		return sc.next();
	}

	public void printOneByName(ArrayList<Member> nameList) {
		for(Member m : nameList) {
			System.out.println(m.toString());
		}
		
	}

	public Member inputMember() {
		System.out.print("아이디 : ");
		String memberId = sc.next();
		System.out.print("비밀번호 : ");
		String memberPwd = sc.next();
		System.out.print("이름 : ");
		String memberName = sc.next();
		System.out.print("성별 : ");
		String memberGender = sc.next();
		System.out.print("나이 : ");
		int memberAge = sc.nextInt();
		System.out.print("이메일 : ");
		String memberEmail = sc.next();
		System.out.print("전화번호 : ");
		String memberPhone = sc.next();
		sc.nextLine();
		System.out.print("주소 : ");
		String memberAddress = sc.nextLine();
		System.out.print("취미 : ");
		String memberHobby = sc.next();
		Member member = new Member(memberId, memberPwd, memberName, memberGender, memberAge, memberPhone, memberEmail, memberAddress, memberHobby);
		return member;
	}

	public Member modifyMember(String updateId) {
		
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
		Member member = new Member(updateId, memberPwd, memberPhone, memberEmail, memberAddress, memberHobby);
		
		return member;
	}

}
