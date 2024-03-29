package com.portal.daos;

import java.util.List;

import com.portal.entities.Employee;

public interface EmployeeDao {
	public boolean register(Employee emp);
	public Employee validate(int empid,String password);
	public Employee getEmployeeById(int empid);
	public boolean updateEmployee(Employee emp);
	public boolean Password(int eId,String password);
	public boolean deleteEmployee(int empid);
	public List<Employee> getAllEmployee();
}
