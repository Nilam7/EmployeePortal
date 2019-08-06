package com.App;

import java.util.HashSet;
import java.util.Set;

import com.iris.Dao.CustomerDao;
import com.iris.DaoImpl.CustomerDaoImpl;
import com.iris.entity.Address;
import com.iris.entity.Customer;

public class CustomerMain {
	public static void main(String[] args) {
		CustomerDao ob=new CustomerDaoImpl();
		Address a=new Address(101,"noida","paras");
		Address a1=new Address(102,"howrah","sandhyabazr");
		Set<Address> b=new HashSet<>();
		b.add(a);
		b.add(a1);
		Customer c=new Customer();
		c.setEmail("nil@iris.com");
		c.setName("ansu");
		c.setContact(785863569);
		c.setA(b);
		System.out.println(ob.addCustomer(c));
		
		
			
		
		
	}
}
