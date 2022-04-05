package arrayDemo;

public class Array_Extended_For_Each_Loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] studentGrade = {55,65,72.5,75,85.8,95};
		double average;
		double sum = 0;
		
		for(double kede: studentGrade) {
			sum = sum+kede; 
			
		}
		average = sum/studentGrade.length;
		System.out.println("Total Value " + sum);
		System.out.println("Average Grade: " + average);

	}

}
