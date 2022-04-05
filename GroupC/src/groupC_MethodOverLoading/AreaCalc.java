package groupC_MethodOverLoading;

public class AreaCalc {
	
	double calcArea(int lenght, int width) {
		
		double rectArea = lenght * width;
		return rectArea;
	}
	double calcArea(int radius) {
		
		double circleArea = 3.14 * radius * radius;
		return circleArea;
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AreaCalc a = new AreaCalc();
		double rarea = a.calcArea(20, 20);
		System.out.println("Area of rectangle: " + rarea);
		
		double carea = a.calcArea(5);
		System.out.println("Area of Circle: " + carea);
	}

}
