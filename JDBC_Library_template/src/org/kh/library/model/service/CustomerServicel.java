package org.kh.library.model.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import org.kh.library.common.JDBCTemplate;
import org.kh.library.model.dao.CumstomerStoreLogic;
import org.kh.library.model.vo.Customer;

public class CustomerServicel implements CustomerService{
	
	private JDBCTemplate prepareConnection;
	CumstomerStoreLogic cDao = null;
	
	public CustomerServicel () {
		
		prepareConnection = JDBCTemplate.getConnection();
		cDao = new CumstomerStoreLogic();
	}

	@Override
	public ArrayList<Customer> selectAllCustomer() {
		
		Connection conn = null;
		ArrayList<Customer> cList = null;
		
		try {
			conn = prepareConnection.createStatement();
			cList = cDao.selectAllCustomer(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		
		
		return cList;
	}

	@Override
	public Customer selectNameSearch(String cName) {
		
		Connection conn = null;
		Customer searchName = null;
		try {
			conn = prepareConnection.createStatement();
			searchName = cDao.selectNameSearch(cName, conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		
		return searchName;
	}

	@Override
	public Customer selectIdSearch(String cId) {
		
		Connection conn = null;
		Customer searchId = null;
		
		try {
			conn = prepareConnection.createStatement();
			searchId = cDao.selectIdSearch(cId, conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		
		return searchId;
	}

	@Override
	public int insertCustomer(Customer customer) {
		
		Connection conn = null;
		int result = 0;
		try {
			conn = prepareConnection.createStatement();
			result = cDao.insertCustomer(customer, conn);
			if(result > 0) {
				JDBCTemplate.commit(conn);
			}else {
				JDBCTemplate.rollback(conn);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		return result;
	}

	@Override
	public int updateCustomer(Customer customer) {
		
		int result = 0;
		Connection conn = null;
		
		try {
			conn = prepareConnection.createStatement();
			result = cDao.updateCustomer(customer, conn);
			if(result > 0) {
				JDBCTemplate.commit(conn);
			}else {
				JDBCTemplate.rollback(conn);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		
		return result;
	}

	@Override
	public int deleteCustomer(String CId) {
		Connection conn = null;
		int result = 0;
		try {
			conn = prepareConnection.createStatement();
			result = cDao.deleteCustomer(CId, conn);
			if(result > 0 ) {
				JDBCTemplate.commit(conn);
			}else {
				JDBCTemplate.rollback(conn);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(conn);
		}
		return result;
	}

}
