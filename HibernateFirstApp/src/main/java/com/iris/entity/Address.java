package com.iris.entity;

import javax.persistence.AttributeOverrides;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Table;


@Embeddable
@Table(name="Add_Tab")
public class Address {
	private int houseno;
	private String Street;
	private String locality;
	
	public Address() {}
	

	public Address(int houseno, String street, String locality) {
		
		this.houseno = houseno;
		this.Street = street;
		this.locality = locality;
	}


	public int getHouseno() {
		return houseno;
	}
	
	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}
	
	public String getStreet() {
		return Street;
	}
	
	public void setStreet(String street) {
		Street = street;
	}
	
	public String getLocality() {
		return locality;
	}
	
	public void setLocality(String locality) {
		this.locality = locality;
	}


	
	@Override
	public String toString() {
		return "Address [houseno=" + houseno + ", Street=" + Street + ", locality=" + locality + "]";
	}
	
}
	
