package com.iris.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cust_Tab")
public class Customer {
	@Id
	private String email;
	private String name;
	private int contact;	
	@ElementCollection
	private  Set<Address> a=new HashSet<>();
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;	
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}
	public Set<Address> getA() {
		return a;
	}

	public void setA(Set<Address> a) {
		this.a = a;
	}



	@Override
	public String toString() {
		return "Customer [email=" + email + ", name=" + name + ", contact=" + contact + ", a=" + a + "]";
	}
	
	
}
