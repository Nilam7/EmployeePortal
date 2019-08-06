package com.iris.DaoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.iris.Dao.CustomerDao;
import com.iris.entity.Customer;

public class CustomerDaoImpl implements CustomerDao {

	public boolean addCustomer(Customer c) {
		try {
			Session session=SessionFactoryProvider.getSF().openSession();
			Transaction tx=session.beginTransaction();
			
			session.save(c);
			tx.commit();
			session.close();
			System.out.println("welcome");
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

	public boolean delete(int email) {
		
		return false;
	}

	public Customer update(int email) {
		
		return null;
	}

	public List<Customer> getAllCustomer() {
		try {
			Session session=SessionFactoryProvider.getSF().openSession();
			Query<Customer> query=session.createQuery("from Customer");
			List<Customer> customerList= query.getResultList();
			return customerList;
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return null;
		
	}

	
	

}
