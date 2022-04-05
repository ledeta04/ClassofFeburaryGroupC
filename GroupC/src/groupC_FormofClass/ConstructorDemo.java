package groupC_FormofClass;

public class ConstructorDemo {
	int age;
	int salary;
	
	ConstructorDemo(){
		age = 56;
		salary = 78000;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorDemo c = new ConstructorDemo();
		
		System.out.println(c.age);
		System.out.println(c.salary);

	}

}
