package branching;

public class ReturnStatements2 {

	public static void main(String[] args) {
		printAMessage();       //call a method
		int sum = add(5,4);    // call a method
		
		System.out.println(sum);
		
	}
	public static void printAMessage() {
		System.out.println("This is my first method");
	}
	public static int add(int a, int b) {
	
		return a+b;
	}
	
	}


