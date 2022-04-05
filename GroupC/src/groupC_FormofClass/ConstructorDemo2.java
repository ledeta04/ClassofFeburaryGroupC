package groupC_FormofClass;

public class ConstructorDemo2 {
	
	// click Source then click Generate Constructor using fields 
	
	
	int age;
	int salary;

	public ConstructorDemo2(int age, int salary) {
		
		this.age = age;
		this.salary = salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorDemo2 c = new ConstructorDemo2(18, 150000);
		
		System.out.println(c.age);
		System.out.println(c.salary);
		
		

	}

}
