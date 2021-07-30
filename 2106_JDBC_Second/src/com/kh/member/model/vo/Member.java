package com.kh.member.model.vo;

import java.sql.Date;

public class Member {
	
	private String memberId;
	private String memberPwd;
	private String memberName;
	private String memberGender;
	private int memberAge;
	private String memberPhone;
	private String memberEmail;
	private String memberAddress;
	private String memberHobby;
	private Date EnrollDate;
	
	public Member() {}
	// 1. 매개변수 있는 생성자
	// 2. 게터/세터
	// 3. toString()
	// 매개변수있는 생성자 생성시 기본 생성자를 안만들어주면
	// 객체생성이 불가능하다
	public Member(String memberPwd, String memberPhone, String memberEmail, String memberAddress,
			String memberHobby) {
		super();
		this.memberPwd = memberPwd;
		this.memberPhone = memberPhone;
		this.memberEmail = memberEmail;
		this.memberAddress = memberAddress;
		this.memberHobby = memberHobby;
	}
	
	
	public Member(String memberId, String memberPwd, String memberName, String memberGender, int memberAge,
			String memberPhone, String memberEmail, String memberAddress, String memberHobby, Date enrollDate) {
		super();
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.memberGender = memberGender;
		this.memberAge = memberAge;
		this.memberPhone = memberPhone;
		this.memberEmail = memberEmail;
		this.memberAddress = memberAddress;
		this.memberHobby = memberHobby;
		EnrollDate = enrollDate;
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

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
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
		return EnrollDate;
	}

	public void setEnrollDate(Date enrollDate) {
		EnrollDate = enrollDate;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberPwd=" + memberPwd + ", memberName=" + memberName
				+ ", memberGender=" + memberGender + ", memberAge=" + memberAge + ", memberPhone=" + memberPhone
				+ ", memberEmail=" + memberEmail + ", memberAddress=" + memberAddress + ", memberHobby=" + memberHobby
				+ ", EnrollDate=" + EnrollDate + "]";
	}
	

}
