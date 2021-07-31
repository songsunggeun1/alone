package com.kh.member.run;

import com.kh.member.controller.MemberController;
import com.kh.member.model.vo.Member;
import com.kh.member.view.MemberView;

public class Run {
	
	public static void main(String[] args) {
		MemberView view = new MemberView(); // 입력 및 출력 위해 만든 view클래스를 사용하기 위해 view객체 생성
		MemberController memCtrl = new MemberController(); // 입력 및 출력받은 정보를 DAO클래스에서 DB랑 연동시키기 위해 controller 객체 생성
		exit:
		while(true) {
			int value = view.mainMenu();
			switch(value) {
			case 0:
				break exit;
			case 1:
				memCtrl.printAllMember(); // DAO클래스에서 SELECT * FROM MEMBER를 이용해 정보 전체출력
				break;
			case 2: 
				String memberId = view.inputMemberId();
				memCtrl.printOneById(memberId);
				break;
			case 3:
				String memberName = view.inputMemberName();
				memCtrl.printOneByBname(memberName);
				break;
			case 4: // view객체의 mainMenu메소드의 리턴값 (4)
				Member member = view.inputMember(); // inputMember에서 리턴값인 member객체의 주소 할당
				memCtrl.registerMember(member); // 저장된 정보를 컨트롤러의 registerMember메소드 매개변수로 전달
				break;
			case 5:
				String searchId = view.inputMemberId();
				memCtrl.modifyMember(searchId);
				break;
			case 6:
				String deleteId = view.inputMemberId();
				memCtrl.removeMember(deleteId);
				break;
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
				break;
			}
			
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

}
