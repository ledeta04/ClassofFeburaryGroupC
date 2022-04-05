package branching;

public class ReturnStatements3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String shouting = caps("what are you doing?!");
		System.out.println(shouting);
		
		int[] awesomeArray = gimmeArrayFromInts(3,7,1);
		System.out.println(awesomeArray[0]);
		System.out.println(awesomeArray[1]);
		System.out.println(awesomeArray[2]);
		
		}
	public static String caps(String s) {
		return s.toUpperCase();

	}
	public static int[] gimmeArrayFromInts(int a, int b, int c) {
	
		int [] array = new int [3]; // declare array
		array[0] = a;
		array[1] = b;
		array[2] = c;
		return array;
	}
}