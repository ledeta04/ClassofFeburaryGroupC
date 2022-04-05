package com.craft.customerPackage;

public class Customer3 {
	
	// Public Access Modifier
	
	public int age;
	public String name;
	
	public void printAge() {   // method
		System.out.println(age);
		System.out.println(name);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer3 cu = new Customer3();
		cu.age = 22;
		cu.name = "Ashenafi";
		//cu.printAge(); // to print out
		System.out.println(cu.age);
		System.out.println(cu.name);
		

	}

}
