package org.kh.library.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.kh.library.common.JDBCTemplate;
import org.kh.library.model.vo.Customer;

public class CumstomerStoreLogic implements CustomerStore{

	@Override
	public ArrayList<Customer> selectAllCustomer(Connection conn) {
		
		Statement stmt = null;
		String sql = "SELECT * FROM CUSTOMER";
		ResultSet rset = null;
		ArrayList<Customer> cList = null;
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);
			cList = new ArrayList<Customer>();
			while(rset.next()) {
				Customer customer = new Customer();
				customer.setUserNo(rset.getInt("USER_NO"));
				customer.setUserId(rset.getString("USER_ID"));
				customer.setUserName(rset.getString("USER_NAME"));
				customer.setUserAge(rset.getInt("USER_AGE"));
				customer.setAddr(rset.getString("ADDR"));
				customer.setGender(rset.getString("GENDER"));
				customer.setEnrollDate(rset.getDate("ENROLL_DATE"));
				cList.add(customer);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(stmt);
			JDBCTemplate.close(rset);
		}
		
		
		return cList;
	}

	@Override
	public Customer selectNameSearch(String cName, Connection conn) {
		
		ResultSet rset = null;
		Statement stmt = null;
		Customer searchName = null;
		String sql = "SELECT * FROM CUSTOMER WHERE USER_NAME = '" + cName + "'"; 
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);
			if(rset.next()) {
				searchName = new Customer();
				searchName.setUserNo(rset.getInt("USER_NO"));
				searchName.setUserId(rset.getString("USER_ID"));
				searchName.setUserName(rset.getString("USER_NAME"));
				searchName.setUserAge(rset.getInt("USER_AGE"));
				searchName.setAddr(rset.getString("ADDR"));
				searchName.setGender(rset.getString("GENDER"));
				searchName.setEnrollDate(rset.getDate("ENROLL_DATE"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(stmt);
		}
		
		return searchName;
	}

	@Override
	public Customer selectIdSearch(String cId, Connection conn) {
		
		ResultSet rset = null;
		Customer searChId = null;
		Statement stmt = null;
		Customer searchId = null;
		String sql = "SELECT * FROM CUSTOMER WHERE USER_ID = '" + cId + "'";
		
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);
			if(rset.next()) {
				searchId = new Customer();
				searchId.setUserNo(rset.getInt("USER_NO"));
				searchId.setUserId(rset.getString("USER_ID"));
				searchId.setUserName(rset.getString("USER_NAME"));
				searchId.setUserAge(rset.getInt("USER_AGE"));
				searchId.setAddr(rset.getString("ADDR"));
				searchId.setGender(rset.getString("GENDER"));
				searchId.setEnrollDate(rset.getDate("ENROLL_DATE"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(stmt);
		}
		return searchId;
	}

	@Override
	public int insertCustomer(Customer customer, Connection conn) {
		
		int result = 0;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO CUSTOMER VALUES(?,?,?,?,?,?,DEFAULT)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, customer.getUserNo());
			pstmt.setString(2, customer.getUserId());
			pstmt.setString(3, customer.getUserName());
			pstmt.setInt(4, customer.getUserAge());
			pstmt.setString(5, customer.getAddr());
			pstmt.setString(6, customer.getGender());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(pstmt);
		}
		
		return result;
	}

	@Override
	public int updateCustomer(Customer customer, Connection conn) {
		
		PreparedStatement pstmt = null;
		int result = 0;
		String sql = "UPDATE CUSTOMER SET USER_NO = ?, ADDR = ? WHERE USER_ID = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, customer.getUserNo());
			pstmt.setString(2, customer.getAddr());
			pstmt.setString(3, customer.getUserId());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(pstmt);
		}
		
		return result;
	}

	@Override
	public int deleteCustomer(String CId, Connection conn) {
		
		PreparedStatement pstmt = null;
		int result = 0;
		String sql = "DELETE FROM CUSTOMER WHERE USER_ID = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, CId);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(pstmt);
		}
		return result;
	}

}
