package com.kh.member.run;

import com.kh.member.controller.MemberController;
import com.kh.member.model.vo.Member;
import com.kh.member.view.MemberView;

public class Run {
	
	public static void main(String[] args) {
		
		MemberView mView = new MemberView();
		MemberController mCtrl = new MemberController();
		
		
		종료 :
		while(true) {
			int choice = mView.mainMenu();
			switch(choice) {
			case 0 :
				break 종료;
			case 1:
				mCtrl.printAll();
				break;
			case 2:
				String memberId = mView.insertMemberId();
				mCtrl.printOneById(memberId);
				break;
			case 3:
				String memberName = mView.insertMemberName();
				mCtrl.printOneByName(memberName);
				break;
			case 4:
				Member member = mView.inputMember();
				mCtrl.inputMember(member);
				break;
			case 5:
				String updateId = mView.insertMemberId();
				mCtrl.updateMember(updateId);
				break;
			case 6:
				String deleteId = mView.insertMemberId();
				mCtrl.deleteMember(deleteId);
				break;
				default :
					System.out.println("번호를 잘못 입력하셨습니다.");
					break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
