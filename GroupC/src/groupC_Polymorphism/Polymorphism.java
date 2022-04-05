package groupC_Polymorphism;

public class Polymorphism {
	
	public double calc(int length, int width) {
		double rect = length * width;
		return rect;
		}
	public double calc(int radius) {
		
		double circleArea = 3.14 * radius * radius;
		return radius;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Polymorphism sofia = new Polymorphism();
		
		double rect = sofia.calc(10, 10);
		System.out.println("rectangle " + rect);
		
		double circle = sofia.calc(5);
		System.out.println("circle " + circle);
		
		
//		System.out.println("rectangle " + sofia.calc(5));
//		System.out.println("Circle " + sofia.calc(10, 10));
//		
		

	}

}
