package groupC_Polymorphism;

public class StaticVariables {
	
	static String city = "DC";
	String name = "Kedru Bushra";
	int age = 32;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Referring to variables without creating object
		
		// We must create an Object for instance variable
		
		StaticVariables s = new StaticVariables();
		
		s.city = "Lorton";
		s.name = "Ashenafi";
		s.age = 34;
		
		System.out.println("city: " + s.city);
		System.out.println("name: " + s.name);
		System.out.println("age: " + s.age);
		
		System.out.println(" ");
		
		StaticVariables s1 = new StaticVariables();
		
		
		
		System.out.println(s1.city);
		System.out.println(s1.name);
		System.out.println(s1.age);

	}

}
