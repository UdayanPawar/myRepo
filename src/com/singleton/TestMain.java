package com.singleton;

public class TestMain {
	
	public static void main(String[] args) {
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		System.out.println("c1.hashCode()>>"+c1.hashCode());
		System.out.println("c2.hashCode()>>"+c2.hashCode());

	}

}
