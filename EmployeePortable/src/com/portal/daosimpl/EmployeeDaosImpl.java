package com.portal.daosimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.portal.daos.EmployeeDao;
import com.portal.entities.Employee;
import com.portal.utility.ConnectionProvider;

public class EmployeeDaosImpl implements EmployeeDao {

	@Override
	public boolean register(Employee emp) {
		try (
				Connection conn=ConnectionProvider.getDBConnection();
				){
				PreparedStatement ps=conn.prepareStatement("insert into EmployeeTab values(empidseq.nextval,?,?,?,?,?)");
				ps.setString(1,emp.getEmployeeName());
				ps.setString(2,emp.getGender());
				ps.setString(3,emp.getQualification());
				ps.setString(4,emp.getContactNo());
				ps.setString(5,emp.getEmailAddress());
				
				int i=ps.executeUpdate();
				if(i!=0){
					ps=conn.prepareStatement("insert into LoginTab(EmpId,Password,Role) values(empidseq.currval,?,'Employee')");
					ps.setString(1,emp.getPassword());
					ps.executeUpdate();
					return true;
				}
				
				}
				catch(Exception e){
					e.printStackTrace();
				}
				return false;
	}

	@Override
	public Employee validate(int empid, String password) {
		try (Connection conn=ConnectionProvider.getDBConnection();){
			PreparedStatement ps=conn.prepareStatement("select EmpId,EmpName,Gender,Qualification,ContactNo,EmailAddress,Role from EmployeeTab join LoginTab using(EmpId) where EmpId=? and Password=?");
			ps.setInt(1,empid);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				System.out.println("I m in if : "+rs.getString(2));
				
				
				String name=rs.getString(2);
				String gender=rs.getString(3);
				String q=rs.getString(4);
				String contactNo=rs.getString(5);
				String email=rs.getString(6);
				String role=rs.getString(7);
				
				Employee emp=new Employee();
				emp.setEmployeeId(empid);
				emp.setEmployeeName(name);
				emp.setGender(gender);
				emp.setEmailAddress(email);
				emp.setQualification(q);
				emp.setContactNo(contactNo);
				emp.setRole(role);
				
				return emp;
				
				
			}
				
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return null;
	}

	@Override
	public Employee getEmployeeById(int empid) {
		try (Connection conn=ConnectionProvider.getDBConnection();){
			PreparedStatement ps=conn.prepareStatement("select *from EmployeeTab where EmpId=?");
			ps.setInt(1,empid);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				System.out.println("I m in if : "+rs.getString(2));
				
				
				String name=rs.getString(2);
				String gender=rs.getString(3);
				String q=rs.getString(4);
				String contactNo=rs.getString(5);
				String email=rs.getString(6);
				
				Employee emp=new Employee();
				emp.setEmployeeId(empid);
				emp.setEmployeeName(name);
				emp.setGender(gender);
				emp.setEmailAddress(email);
				emp.setQualification(q);
				emp.setContactNo(contactNo);
				System.out.println("I m in if 2 : "+rs.getString(2));
				
				return emp;
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		return null;
	}

	@Override
	public boolean updateEmployee(Employee emp) {
		try (
				Connection conn=ConnectionProvider.getDBConnection();
				){
				PreparedStatement ps=conn.prepareStatement("update EmployeeTab set name=?,Qualification=?,contactNo ");
				ps.setString(1,emp.getEmployeeName());
				ps.setString(2,emp.getGender());
				ps.setString(3,emp.getQualification());
				ps.setString(4,emp.getContactNo());
				ps.setString(5,emp.getEmailAddress());
				
				int i=ps.executeUpdate();
				if(i!=0){
					return true;
				}
				
				}
				catch(Exception e){
					e.printStackTrace();
				}
				return false;
				}
		

	@Override
	public boolean Password(int empId, String password) {
		try (Connection conn=ConnectionProvider.getDBConnection();){
			//HttpSession session=request.getSession();
			//session.setAttribute("userEmail","e");
			PreparedStatement ps=conn.prepareStatement("update LoginTab set password=? where empid=?");
			ps.setInt(2,empId);
			ps.setString(1,password);
			int i=ps.executeUpdate();
			if(i!=0){
				ps.executeUpdate();
				return true;
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
				
		return false;
	}

	@Override
	public boolean deleteEmployee(int empid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> eList=new ArrayList<>();
		try (Connection conn=ConnectionProvider.getDBConnection();){
			PreparedStatement ps=conn.prepareStatement("select EmpId,EmpName,Gender,Qualification,ContactNo,EmailAddress,Role from EmployeeTab join LoginTab using(EmpId)");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				
				String name=rs.getString(2);
				String gender=rs.getString(3);
				String q=rs.getString(4);
				String contactNo=rs.getString(5);
				String email=rs.getString(6);
				String role=rs.getString(7);
				
				Employee emp=new Employee();
				emp.setEmployeeId(rs.getInt(1));
				emp.setEmployeeName(name);
				emp.setGender(gender);
				emp.setEmailAddress(email);
				emp.setQualification(q);
				emp.setContactNo(contactNo);
				emp.setRole(role);
				
				eList.add(emp);
				
			}
				
			}
			catch(Exception e){
				e.printStackTrace();
			}
				
		return eList;
	}

}
