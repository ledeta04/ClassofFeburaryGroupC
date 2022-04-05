package groupC_FormofClass;

public class Methods {
	
	double width =50;
	double height = 5;
	double depth = 10;
	
	 int a = 5;
	 int b = 5;
	 int c = 5;
	
	 	public double calcVolume(double w, double h, double d) {
		
		double volume = width * height * depth;
		
		return volume;
	}
	 	
		public void calcVolume() {
			int volume = a * b * c;
			
			System.out.println("Total amount " + volume);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methods m = new Methods();
		
		m.calcVolume();
		
	

		
		double volume = m.width * m.height * m.depth;
		
		System.out.println("Total volume " + volume);
		
		
		
	}

}
