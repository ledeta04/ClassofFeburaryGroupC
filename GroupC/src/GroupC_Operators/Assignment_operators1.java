package GroupC_Operators;

public class Assignment_operators1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 45;
		int b = 55;
		int c = 65;
		int d = 10; //100 + 65 = 165
		
		d = a + b;
		
		System.out.println("result " + d);
		
		d += c;
		
		System.out.println("result " + d); //165
		
		c -= a;
		
		System.out.println("result " + c);
		
		c *= a;
		
		System.out.println("result " + c);
		
		d /= b;
		
		System.out.println("result " + d); // 3
		
		a %= d;
		
		System.out.println("result " + a); //3     3/45 = 3
		
		int e = 3;
		int f = 10;
		f %=e;
		
		System.out.println("result " + f); 

	}

}
