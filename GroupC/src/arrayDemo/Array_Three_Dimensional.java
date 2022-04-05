package arrayDemo;

public class Array_Three_Dimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ages[][][] = new int [2][3][4];
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				for(int k=0; k<4; k++) {
					
					System.out.print(ages[i][j][k] + " ");
					
				}
				System.out.println();
			}
		}

	}

}
