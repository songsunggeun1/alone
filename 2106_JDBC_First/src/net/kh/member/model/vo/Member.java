package net.kh.member.model.vo;

import java.sql.Date;

public class Member {
	
	private String memberId;
	private String memberPwd;
	private String memberName;
	private String memberGender;
	private int memberAge;
	private String memberEmail;
	private String memberPhone;
	private String memberAddress;
	private String memberHobby;
	private Date enrollDate;
	// Date는 util과 sql이 있는데 우리는 sql로 사용할거기 때문에 sql로 import
	// 오라클의 MEMBER_ID에서 _는 지워준다
	
	
	public Member() {}
	
	
	public Member(String memberId, String memberPwd, String memberName, String memberGender, int memberAge,
			String memberEmail, String memberPhone, String memberAddress, String memberHobby, Date enrollDate) {
		super();
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.memberGender = memberGender;
		this.memberAge = memberAge;
		this.memberEmail = memberEmail;
		this.memberPhone = memberPhone;
		this.memberAddress = memberAddress;
		this.memberHobby = memberHobby;
		this.enrollDate = enrollDate;
	}
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPwd() {
		return memberPwd;
	}
	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberGender() {
		return memberGender;
	}
	public void setMemberGender(String memberGender) {
		this.memberGender = memberGender;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public String getMemberAddress() {
		return memberAddress;
	}
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
	public String getMemberHobby() {
		return memberHobby;
	}
	public void setMemberHobby(String memberHobby) {
		this.memberHobby = memberHobby;
	}
	public Date getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}
	
	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}


	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberPwd=" + memberPwd + ", memberName=" + memberName
				+ ", memberGender=" + memberGender + ", memberAge=" + memberAge + ", memberEmail=" + memberEmail
				+ ", memberPhone=" + memberPhone + ", memberAddress=" + memberAddress + ", memberHobby=" + memberHobby
				+ ", enrollDate=" + enrollDate + "]";
	}
}
