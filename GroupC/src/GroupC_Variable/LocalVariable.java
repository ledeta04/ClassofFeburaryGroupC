package GroupC_Variable;

public class LocalVariable {

	
	
	public void methodone() {
		
		int i = 30;  //local variable
		
		System.out.println("value of i: " + i);
		
		}
	
	public void methodtwo() {
		
		int n = 45; // local variable
		
		System.out.println("value of n: " + n);
		
		int i = 40;
		System.out.println("value of i: " + i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalVariable anyname = new LocalVariable(); // creating an Object and 'anyname' is referece variable
		
		anyname.methodone(); // we are calling the method1
		anyname.methodtwo(); // we are calling the method2		
		
		
	}

}
