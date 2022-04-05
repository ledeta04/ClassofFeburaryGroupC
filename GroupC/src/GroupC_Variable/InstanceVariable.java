package GroupC_Variable;

public class InstanceVariable {
	
	int age = 35; // Instance Variable created outside methods
	
	public void methodone() {
		
		int f = 15; // Local variable
		
		System.out.println("value of f: " + f);
		System.out.println("value of age: " + age);
		
	}
	  
	public void methodtwo() {
		
		int b = 25; // Local variable
		
		System.out.println("value of b: " + b);
		System.out.println("value of age: " + age);
		
		
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstanceVariable ins = new InstanceVariable();
		
		ins.methodone();
		ins.methodtwo();
		
		
		

	}

}
