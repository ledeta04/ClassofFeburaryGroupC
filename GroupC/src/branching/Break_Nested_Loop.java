package branching;

public class Break_Nested_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=3; i++) { //1 2 3
			
			for(int j=0; j<=3; j++) {  //0 1 
				if(j==2)
					break;
				System.out.print(j);
				
			}
			
			
		}
		

	}

}
