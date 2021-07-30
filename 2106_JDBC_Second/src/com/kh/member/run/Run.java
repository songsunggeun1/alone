package com.kh.member.run;

import com.kh.member.controller.MemberController;
import com.kh.member.model.vo.Member;
import com.kh.member.view.MemberView;

public class Run {
	
	public static void main(String[] args) {
		MemberView view = new MemberView();
		MemberController memCtrl = new MemberController();
		exit:
		while(true) {
			int value = view.mainMenu();
			switch(value) {
			case 0:
				break exit;
			case 1:
				memCtrl.printAllMember();
				break;
			case 2: 
				String memberId = view.inputMemberId();
				memCtrl.printOneById(memberId);
				break;
			case 3:
				String memberName = view.inputMemberName();
				memCtrl.printOneByBname(memberName);
				break;
			case 4:
				Member member = view.inputMember();
				memCtrl.registerMember(member);
				break;
			case 5:
				String searchId = view.inputMemberId();
				memCtrl.modifyMember(searchId);
				// 밑 방법으로 하지 않고 컨트롤러에서 ID조회
				
//				Member searchOne = memCtrl.searchOneById(searchId);
//				if(searchOne != null) {
//					Member modifyOne = view.modifyMember();
//					memCtrl.modifyMember(modifyOne, searchId);
//				}else {
//					view.displayError("회원 정보 조회 실패");
//				}
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
