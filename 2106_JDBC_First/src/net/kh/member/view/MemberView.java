package net.kh.member.view;

import java.util.List;
import java.util.Scanner;

import net.kh.member.model.vo.Member;

public class MemberView {
	
	public int mainMenu() { // 메인메뉴
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 회원관리 프로그램 ======");
		System.out.println("1. 회원정보 전체조회");
		System.out.println("2. 회원 아이디로 조회");
		System.out.println("3. 회원 이름으로 조회");
		System.out.println("4. 회원 가입");
		System.out.println("5. 회원 정보 변경");
		System.out.println("6. 회원 탈퇴");
		System.out.println("0. 프로그램 종료");
		System.out.print("번호 선택 : ");
		int input = sc.nextInt();
		return input;
	}
	
	public Member inputMember() { // 회원가입

		Scanner sc = new Scanner(System.in);
		Member member = new Member();
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
		member.setMemberId(memberId);
		member.setMemberPwd(memberPwd);
		member.setMemberName(memberName);
		member.setMemberAge(memberAge);
		member.setMemberGender(memberGender);
		member.setMemberEmail(memberEmail);
		member.setMemberPhone(memberPhone);
		member.setMemberAddress(memberAddress);
		member.setMemberHobby(memberHobby);
		return member;
		// member는 컨트롤러 갔다가 DAO로 넘어간다
	}

	public void displaySuccess(String message) {
		System.out.println("서비스 요청 결과 : " + message);
	}
	
	public void displayError(String message) {
		System.out.println("서비스 요쳥 실패 : " + message);
	}
	

	public void showAll(List<Member> memberList) {
		System.out.println("====== 전체 회원 정보 조회 ======");
		for(int i = 0; i < memberList.size(); i++) {
//			System.out.println(memberList.get(i));// Member클래스에 toString 대로 나온다(한번에 출력)
			
			System.out.println("회원 아이디 : " + memberList.get(i).getMemberId());
			System.out.println("회원 비밀번호 : " + memberList.get(i).getMemberPwd());
			System.out.println("회원 이름 : " + memberList.get(i).getMemberName());
			System.out.println("회원 성별 : " + memberList.get(i).getMemberGender());
			System.out.println("회원 나이 : " + memberList.get(i).getMemberAge());
			System.out.println("회원 이메일 : " + memberList.get(i).getMemberEmail());
			System.out.println("회원 전화번호 : " + memberList.get(i).getMemberPhone());
			System.out.println("회원 주소 : " + memberList.get(i).getMemberAddress());
			System.out.println("회원 취미 : " + memberList.get(i).getMemberHobby());
			System.out.println("가입 날짜 : " + memberList.get(i).getEnrollDate());
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-===-=-=-=-=-=-=-=-=-=");
			// 컬럼별로 한개씩 출력

		}

	}
	
	public String inputMemberId() {
		Scanner sc = new Scanner(System.in);
		System.out.print("회원의 아이디 입력 : ");
		String inputId = sc.next();
		return inputId;
	}
	
	public Member modifyMember() { // 회원가입
		System.out.println("====== 회원 정보 수정 ======");
		Scanner sc = new Scanner(System.in);
		Member member = new Member();
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
		member.setMemberPwd(memberPwd);
		member.setMemberEmail(memberEmail);
		member.setMemberPhone(memberPhone);
		member.setMemberAddress(memberAddress);
		member.setMemberHobby(memberHobby);
		return member;
		// member는 컨트롤러 갔다가 DAO로 넘어간다
	}

	public void showOne(Member memberOne) {
		//System.out.println(memberOne.toString()); getter,setter toString으로 한번에 출력
		//Controller PrintOneBy에서 받은 member를 출력
		System.out.println("====== 회원 정보 아이디로 정보 조회 ======");
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
	}
	public String inputMemberName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("조회할 회원의 이름 입력 : ");
		String inputName = sc.next();
		return inputName;
	}
	public void showOneName(List<Member> memberList) {
		// 저장된 리스트를 for문을 이용해서 출력
		for(Member m : memberList) {
			System.out.println("====== 회원 정보이름으로 정보 조회 ======");
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
}
