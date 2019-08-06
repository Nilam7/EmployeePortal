package com.iris.Dao;

import java.util.List;

import com.iris.entity.Customer;

public interface CustomerDao {
	
	public boolean addCustomer(Customer c);
	public boolean delete(int email);
	public Customer update(int email);
	public List<Customer> getAllCustomer();
}
