package com.craft.customerPackage;

public class Customer2 {
	
	/*Default Access Modifier allow access 
	to classes within the same Package */
	
	// Default another name is Package access modifier
	
	int age;
	String name;
	
	void printAge() {   // method
		
		System.out.println(age);
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer2 cu = new Customer2();
		
		cu.age = 20;
		cu.name = "Steve";
		cu.printAge();

	}

}
