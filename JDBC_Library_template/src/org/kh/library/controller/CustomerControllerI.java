package org.kh.library.controller;

import org.kh.library.model.vo.Customer;

public interface CustomerControllerI {
	public void selectAllCustomer();
	public void selectNameSearch(String cName);
	public void selectIdSearch(String cId);
	public void insertCustomer(Customer customer);
	public void updateCustomer(String cId);
	public void deleteCustomer(String cId);
}
