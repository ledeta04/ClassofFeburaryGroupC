						// This show how we can use Instance and Static together 
/* Notes:-
 * Static: Is a global variable, if we change at one place the others will have the changed value
* Instance variable is an instance specific , if we change some thing each of them they will have there own value.
* If we make a change on the last two it won't affect the top ones.
 */


package com.day3;


class EmpInfo{
	String name = "Hana Velecina";
	static String city = "MD";
}

public class StaticVariableDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EmpInfo anyname = new EmpInfo();
		anyname.name = "Lily";
		anyname.city = "LA";
		
		System.out.println("Employee name: " + anyname.name);
		System.out.println("Employee city: " + anyname.city);
		
		System.out.println("\n");   //I think this is used for to print them separately; 
		
		EmpInfo anyname2 = new EmpInfo();
		System.out.println("Employee name: " + anyname2.name);
		System.out.println("Employee city: " + anyname2.city);
	}

}
