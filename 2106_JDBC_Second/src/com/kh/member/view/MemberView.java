package com.kh.member.view;

import java.util.List;
import java.util.Scanner;

import com.kh.member.model.vo.Member;

public class MemberView {
	
	public MemberView() {
	}
	
	public int mainMenu() { // 메인메뉴
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
	
	public void showAll(List<Member> mList) {
		System.out.println("====== 회원 정보 조회 ======");
		for(Member m : mList) { // for~each문을 활용해  list의 담긴 정보 출력
			System.out.println("====== 회원 전체 정보 조회 ======");
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
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		}
	}
	
	public void displaySuccess(String message) {
		System.out.println("서비스 요청 결과 : " + message); // 데이터 성공시  확인을 해주는 출력 메소드
	}
	
	public void displayError(String message) {
		System.out.println("서비스 요청처리 실패 : " + message);// 데이터 실패시  확인을 해주는 출력 메소드
	}

	public String inputMemberId() { // ID 조회용 메소드 입력된 정보를 리턴해준다
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력하세요 : ");
		String inputId = sc.next();
		return inputId;
	}

	public String inputMemberName() { //  이름 조회용 메소드 입력된 정보를 리턴해준다
			Scanner sc = new Scanner(System.in);
			System.out.print("이름을 입력하세요 : ");
			String inputName = sc.next();
			return inputName;
	}

	public void showOneById(Member memberOne) { // 입력받은 ID로 DAO클래서에서 DB연동해서 저장된 결과를 출력시키는 메소드
		System.out.println("====== 회원 아이디로 검색 결과 ======");
//		System.out.println(memberOne.toString());
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
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	}

	public void showOneName(List<Member> mList) { // 동명이인이 있을수 있기 때문에 출력 for문 활용
		
		for(Member m : mList) {
			System.out.println(m.toString());
//			System.out.println("====== 회원 이름으로 정보 조회 ======");
//			System.out.println("회원 아이디 : " + m.getMemberId());
//			System.out.println("회원 비밀번호 : " + m.getMemberPwd());
//			System.out.println("회원 이름 : " + m.getMemberName());
//			System.out.println("회원 성별 : " + m.getMemberGender());
//			System.out.println("회원 나이 : " + m.getMemberAge());
//			System.out.println("회원 이메일 : " + m.getMemberEmail());
//			System.out.println("회원 전화번호 : " + m.getMemberPhone());
//			System.out.println("회원 주소 : " + m.getMemberAddress());
//			System.out.println("회원 취미 : " + m.getMemberHobby());
//			System.out.println("가입 날짜 : " + m.getEnrollDate());
//			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		}
	}

	public Member inputMember() {
		Scanner sc = new Scanner(System.in);
		Member member = new Member(); // DB에 입력받은 값의 정보를 담아줄 member객체 생성
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
		member.setMemberId(memberId); // 생성한 member객체의 vo클래스 setter를 호출해 입력된 정보를 저장시켜주는 방법
		member.setMemberPwd(memberPwd);
		member.setMemberName(memberName);
		member.setMemberAge(memberAge);
		member.setMemberGender(memberGender);
		member.setMemberEmail(memberEmail);
		member.setMemberPhone(memberPhone);
		member.setMemberAddress(memberAddress);
		member.setMemberHobby(memberHobby);
//////////////////////////////////////////////////////////////////////
//		Member member =  // 매개변수 있는 생성자로 만들어줌으로써 setter값을 이용한 외부호출이 아니라 
//				new Member
//				(memberId, memberPwd, memberName, 
//						memberGender, memberAge, memberPhone, 
//						memberEmail, memberAddress, memberHobby, null);
		// 매개변수 있는 생성자로 만들어줌으로써 setter값을 이용한 외부호출이 아니라 
		// 입력받은 값을 생성자 매개변수를 통해 vo클래스 매개변수에 값을 입력시켜주는 방법
		
		return member; // 위의 두 방법을 통한 입력받은 member객체를 리턴
	}

	public Member modifyMember(String searchId) {
		Member member = null;
		
		try {
			System.out.println("====== 회원 정보 수정 ======");
			Scanner sc = new Scanner(System.in);
			System.out.print("비밀번호 : ");
			String memberPwd = sc.next();
			System.out.print("이메일 : ");
			String memberEmail = sc.next();
			System.out.print("전화번호 : ");
			String memberPhone = sc.next();
			System.out.print("주소 : ");
			sc.nextLine(); // 엔터제거
			String memberAddress = sc.nextLine();
			System.out.print("취미 : ");
			String memberHobby = sc.next();
			member = new Member(memberPwd,
								memberPhone,
								memberEmail,
								memberAddress,
								memberHobby); // 수정할 정보를 받아서 매개변수있는 생성자를 만들어 값을 입력된 값을 저장시킴
			member.setMemberId(searchId); 
			// member생성자안에 searchId를 넣어줄수 있지만 생성자에서 memberId를 생성해줘야 쓸수있음
		}catch(Exception e) {
			System.out.println("입력 오류!!");
		}
		return member;
		
	}

}
