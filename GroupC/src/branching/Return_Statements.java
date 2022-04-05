package branching;

public class Return_Statements {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=26; i<34; i++) {
			
			new Return_Statements().var(i);
	
			}
		}
	public boolean var(int a) {
		
		if(a%2 ==0) {
			System.out.println("Even Number " + a);
		
		return true;
		}
			System.out.println("Odd Number " + a);
		
		return false;
	}

}
