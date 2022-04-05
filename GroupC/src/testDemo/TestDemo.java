package testDemo;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{

			int a =5 /0;

			System.out.print("TRY");

			}

			catch(ArithmeticException e){

			System.out.print("CATCH");
		}

	}

}
