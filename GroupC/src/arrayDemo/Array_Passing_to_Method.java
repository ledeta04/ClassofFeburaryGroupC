package arrayDemo;

public class Array_Passing_to_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] studentGrade = {55,65,72.5,75,85.8,95};
		
		calcTotal(studentGrade);
	}
	public static void calcTotal(double[]studentGrade) {
		
		double total = 0;
		
		for(int i = 0; i<studentGrade.length; i++) {
			
			total = total + studentGrade[i];
		}
		System.out.println("total grade: " + total);
		
		
	}

}
