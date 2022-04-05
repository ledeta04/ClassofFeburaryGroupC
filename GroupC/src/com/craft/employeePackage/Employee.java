package com.craft.employeePackage;

import com.craft.customerPackage.Customer;
import com.craft.customerPackage.Customer2;
import com.craft.customerPackage.Customer3;

  /* import com.craft.customerPackage.*; 
   we can import all class under this package using 
    */

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer cu = new Customer(); // imported from Customer Package
		
//		cu.age = 44; // Customer is Private not visible
//		cu.name = "Teddy"; // Customer is Private not visible
//		
//		System.out.println(cu.age);
//		System.out.println(cu.name);
//		
//		Customer2 c = new Customer2();
//		c.age = 24; // Default not access outside the package
		
		Customer3 ashu = new Customer3();
		ashu.age = 35;
		ashu.name = "Ashenafi"; // Public have access outside the package
	
		
		
	}

}
