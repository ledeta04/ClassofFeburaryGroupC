package groupC_MethodOverLoading;

public class MethodOverloadDemo {
	
	public int addition(int a, int b) {
		return a + b;
	}
	public double addition(double a, int c, int d, int e) {
		return a + c + d + e;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloadDemo m = new MethodOverloadDemo();
		
		int sofi = m.addition(26, 30);
		System.out.println("Total value: " + sofi);
		
		double hana = m.addition(10, 5, 12, 5);
		System.out.println("Total amount: " + hana);

	}

}
