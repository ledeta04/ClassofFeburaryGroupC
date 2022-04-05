package arrayDemo;

public class Array_Multi_Dimensional4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for multidimensional we must use Nested loop to see both row and column out put
		
		int ages[][] = {{12,34,55},{56,77,89},{92,3,4},{54,2,22}};
		
		for(int r=0; r<ages.length; r++) {
			
			for(int c=0; c<3; c++) {
				
				System.out.print(ages[r][c] + " "); //r..row, c...column
			}
			System.out.println();
		}
		
		
		}
		

	}


