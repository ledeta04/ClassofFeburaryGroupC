package branching;

public class Continue_While_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		while(i<10) {
			
			if(i==6) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
		
	}

}
