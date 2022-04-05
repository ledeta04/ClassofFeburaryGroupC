package com.craft.customerPackage;

public class Customer {
	
	// Examples for Private Access Modifier
	// Access is on this class only
	
	private int age;
	private String name;
	
	
	private void printAge() {   // method
		System.out.println(age);
		System.out.println(name);
	}
	
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub

		Customer c = new Customer(); //object
		
		c.age = 18;
		c.name = "Hewan";
		c.printAge();
	}

}
