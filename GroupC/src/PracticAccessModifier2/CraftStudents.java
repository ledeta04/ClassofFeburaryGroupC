package PracticAccessModifier2;

import PracticAccessModifier1.Kedru;
import PracticAccessModifier1.Ruth;

public class CraftStudents extends Kedru{

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		
		CraftStudents craft = new CraftStudents();
		
		System.out.println(craft.age);
		System.out.println(craft.salary);
		System.out.println(craft.bonus);
		
		System.out.println();
		
		Ruth craft1 = new Ruth();
		
		System.out.println(craft1.age);
		System.out.println(craft1.salary);
		System.out.println(craft1.bonus);
		
		
	}

}
