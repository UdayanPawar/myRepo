package com.singleton;

public class CustomerMain {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		CustomerSingleton cs1 = CustomerSingleton.getCustomerSingletonInstance();
		CustomerSingleton cs2 = (CustomerSingleton) cs1.clone();
		
		System.out.println(cs1.hashCode());
		System.out.println(cs2.hashCode());
		

	}

}
