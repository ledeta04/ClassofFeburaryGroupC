package switchDemo;

public class Enum_Switch {
	
	public enum vowel{a, e, i, o, u,}//initializing
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		vowel [] var = vowel.values();
		for(vowel ch: var) {
			
			switch (ch) {
			case a:
				System.out.print(" "+ 'a');
				break;
			case e:
				System.out.print(" " +'e');
				break;
			case i:
				System.out.print(" " +'i');
				break;
			case o:
				System.out.print(" " +'o');
				break;
			case u:
				System.out.print(" " +'u');
				break;
				
				default:
			System.out.print(" " + "it is consonant");
					
			
			}
		}
	}

}
