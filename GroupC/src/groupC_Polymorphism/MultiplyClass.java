package groupC_Polymorphism;

public class MultiplyClass {
	
	
	public int multiply(int a, int b ) {
		
		return a*b;
	}
	public double multiply(double a, double b) {
		
		return a * b;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultiplyClass m = new MultiplyClass();
		
//		int result1 = m.multiply(25, 10);
//		System.out.println("Total " + result1);
//		
//		double result2 = m.multiply(15, 15);
//		System.out.println("Total two " + result2);
		
		System.out.println(" Total value " + m.multiply(25, 10));
		System.out.println(" Total value two " + m.multiply(15, 15));

	}

}
