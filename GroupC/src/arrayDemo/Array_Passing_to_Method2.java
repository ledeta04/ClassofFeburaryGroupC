package arrayDemo;

public class Array_Passing_to_Method2 {
	
	
	public void calculateAverage(double[] studentsMarks) {
		double sum = 0;
		double average = 0;
		
		for(int i=0; i<studentsMarks.length; i++) {
			
			sum = studentsMarks[i] + sum;
			
		}
		average = sum/studentsMarks.length;
		
		System.out.println("your mark sum is: " + sum);
		System.out.println("your average is: " + average);
	}
	
	
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		double[] studentsMarks = {67,78,80,95,55,77,56};
		
		Array_Passing_to_Method2 obj = new Array_Passing_to_Method2(); //Object creating
		obj.calculateAverage(studentsMarks); // calling to Array

	}

}
