package PracticAccessModifier1;

public class Kedru {
	
	protected int age = 28;
	protected int salary = 170000;
	protected double bonus = 15000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hana k = new Hana();
		
		Kedru k1 = new Kedru();
		
		System.out.println(k.age);
		System.out.println(k.bonus);
		System.out.println(k.salary);
		
		System.out.println(k1.age);

	}

}
