package net.kh.member.run;

import net.kh.member.controller.MemberController;
import net.kh.member.model.vo.Member;
import net.kh.member.view.MemberView;

public class Run {
	
	public static void main(String[] args) {
		MemberView view = new MemberView(); 
		MemberController mCtrl = new MemberController();
		String memberId = "";
		Member member = null;
		exit :
		while(true) {
			int choice = view.mainMenu();
			switch(choice){
				case 0 :
					break exit ;
				case 1 : 
					mCtrl.printAll();
					break;
				case 2 : 
					memberId = view.inputMemberId();
					mCtrl.printOneById(memberId);
					break;
				case 3 : 
					String memberName = view.inputMemberName();
					mCtrl.printOneByName(memberName);
					break;
				case 4 :
					member = view.inputMember();
					mCtrl.registerMember(member);
					break;
				case 5 : // 정보 수정
					memberId = view.inputMemberId();
					// 1. 회원아이디 존재 확인
					member = mCtrl.getOneById(memberId);
					if(member != null) {
						// 2. 있다면 정보입력
						member = view.modifyMember();
//						member.setMemberId(memberId);
						mCtrl.modifyMember(member, memberId);
			// memberId를 매개변수로 준 이유는 수정된 정보에 ID는 없기 때문에 DAO에서
			// ID를 DB에 보내줄 정보에 넣을수가없다 그래서 매개변수에 memberId를 넣어서
			// DAO에서 memberId를 정보에 넣을수 있도록 해준다
					}else {
						view.displayError("회원 조회 실패");
					}
					break;
				case 6 :
					memberId = view.inputMemberId();
					mCtrl.removeMember(memberId);
					break;
				default :
					System.out.println("번호를 잘못 선택하셨습니다.");
					break;
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

}
