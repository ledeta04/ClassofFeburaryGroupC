package JavaPractice;

import java.util.Scanner;


public class Day1Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter your First Name: ");
		String firstName = in.next();
		
		System.out.println("Please enter your Last Name: ");
		String lastName = in.next();
		
		System.out.println("Please enter your Age: ");
		int Age = in.nextInt();
		
		System.out.println("Please enter your Salary: ");
		double Salary = in.nextDouble();
		
		System.out.println("Please enter your Bonus here: ");
		double Bonus = in.nextDouble();
		
		System.out.println("Please enter your Zipcode: ");
		int Zipcode = in.nextInt();
		
		System.out.println("Please enter your City: ");
		String City = in.next();
		
		System.out.println("Please enter your State: ");
		String State = in.next();
		
		double totalSalary = Salary + Bonus;
		
		
		System.out.println("GroupC First Name: " + firstName);
		System.out.println("GroupC Last Name: " + lastName);
		System.out.println("GroupC Age: " + Age);
		System.out.println("GroupC Salary: " + Salary);
		System.out.println("GroupC Bonus: " + Bonus);
		System.out.println("GroupC Zipcode: " + Zipcode);
		System.out.println("GroupC City: " + City);
		System.out.println("GroupC State: " + State);
		System.out.println("GroupC Total Salary: " + totalSalary);
		
		
	}

}
