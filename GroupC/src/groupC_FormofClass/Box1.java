package groupC_FormofClass;

public class Box1 {
	
	double width;
	double height;
	double depth;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box1 b = new Box1();
		
		b.width = 400;
		b.height = 20;
		b.depth = 10;
		
		double volume;
		
		volume = b.width * b.height * b.depth;
		
		System.out.println("Total Volume " + volume);
		
		
	}

}
