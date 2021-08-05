package org.kh.library.model.vo;

import java.sql.Date;

public class Library {
	
	private int leaseNo;
	private int bookNo;
	private String userId;
	private Date leaseDate;
	private Date returnDate;
	private String userName;
	private String bookName;
	
	public Library() {}
	
	public Library(String userId, String bookName) {
		super();
		this.userId = userId;
		this.bookName = bookName;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getLeaseNo() {
		return leaseNo;
	}
	public void setLeaseNo(int leaseNo) {
		this.leaseNo = leaseNo;
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getLeaseDate() {
		return leaseDate;
	}
	public void setLeaseDate(Date leaseDate) {
		this.leaseDate = leaseDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	@Override
	public String toString() {
		return "Library [leaseNo=" + leaseNo + ", bookNo=" + bookNo + ", userId=" + userId + ", leaseDate=" + leaseDate
				+ ", returnDate=" + returnDate + ", userName=" + userName + ", bookName=" + bookName
				+ ", getUserName()=" + getUserName() + ", getBookName()=" + getBookName() + ", getLeaseNo()="
				+ getLeaseNo() + ", getBookNo()=" + getBookNo() + ", getUserId()=" + getUserId() + ", getLeaseDate()="
				+ getLeaseDate() + ", getReturnDate()=" + getReturnDate() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
}
