package com.singleton;

import java.io.Serializable;

public class CustomerSingleton implements Cloneable,Serializable{
	
	private CustomerSingleton() {
		
	}
	
	private static CustomerSingleton instance;

	
	public static CustomerSingleton getCustomerSingletonInstance() {
	
		if(instance==null) { //object is not created yet
			instance = new CustomerSingleton();
			return instance;
		}else { //object is already created
			return instance;
		}
		//return instance; //this is for if condition,write here or in if condn
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return instance;
	}
	
	protected Object readResolve() {
		return instance;
	}
	

}
