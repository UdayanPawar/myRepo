package com.singleton;

public class Customer {
	
	private String cust_name;

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	@Override
	public String toString() {
		return "Customer [cust_name=" + cust_name + "]";
	}
	
	
	

}
