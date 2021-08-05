package org.kh.library.controller;

import java.util.ArrayList;

import org.kh.library.common.JDBCTemplate;
import org.kh.library.model.service.CustomerServicel;
import org.kh.library.model.vo.Customer;
import org.kh.library.view.LibraryView;

public class CustomerController implements CustomerControllerI{
	
	CustomerServicel cService = new CustomerServicel();
	LibraryView lView = new LibraryView();

	@Override
	public void selectAllCustomer() {
		
		ArrayList<Customer>cList = cService.selectAllCustomer();
		if(!cList.isEmpty()) {
			lView.dispalyCustomerList(cList);
		}else {
			lView.displayError("회원 전체 출력 실패");
		}
		
	}

	@Override
	public void selectNameSearch(String cName) {
		
		Customer searchName = cService.selectNameSearch(cName);
		if(searchName != null) {
			lView.diplayCutomerOne(searchName);
		}else {
			lView.displayError("회원 이름으로 조회 실패");
		}
		
	}

	@Override
	public void selectIdSearch(String cId) {
		
		Customer searchId = cService.selectIdSearch(cId);
		if(searchId != null) {
			lView.diplayCutomerOne(searchId);
		}else {
			lView.displayError("아이디로 조회 실패");
		}
		
	}

	@Override
	public void insertCustomer(Customer customer) {
		
		int result = cService.insertCustomer(customer);
		if(result > 0) {
			lView.displaySucess("회원 가입 성공");
		}else {
			lView.displayError("회원 가입 실패");
		}
		
	}

	@Override
	public void updateCustomer(String cId) {
		
		int result = 0;
		Customer searchId = cService.selectIdSearch(cId);
		if(searchId != null) {
			result = cService.updateCustomer(lView.modifyCustomer(cId));
			if(result > 0) {
				lView.displaySucess("회원 정보 수정 성공");
			}else {
				lView.displayError("회원 정보 수정 실패");
			}
		}else {
			lView.displayError("아이디 조회 실패");
		}
	}

	@Override
	public void deleteCustomer(String cId) {
		
		int result = cService.deleteCustomer(cId);
		if(result > 0) {
			lView.displaySucess("회원 탈퇴 성공");
		}else {
			lView.displayError("회원 탈퇴 실패");
		}
		
	}
	
	

}
