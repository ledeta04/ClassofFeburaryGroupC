package GroupC_Operators;

public class Ternary_Operators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		 if () {
//             number = 10; 
//           }
//		 else {
//			 	number = -10;

//			 		The above can be replaced with:
//			 		number = (expression) ? 10 :  -10;
//             double number = -5.5;
//              String result;
//              result = (number > 0.0) ? "positive" : "not positive";

		int a = 120;
		
		if (a>100 && a<=150) {
			
			System.out.println("Positive");
		}
		
		else {
			System.out.println("Negative value");
			
		}
		
		int b = 120;
		
		String result;
		
		result = (b>150) ? "even number" : "odd number";
		
		System.out.println("number " + result);
		

	}
	
	

}
