package arrayDemo;

import java.util.Arrays;

public class Array_Sort_Ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] marksArray = {44,88,22,77,99};
		System.out.println("Before sorting = " + Arrays.toString(marksArray));
		
		Arrays.sort(marksArray);
		
		System.out.println("After sorting = " + Arrays.toString(marksArray));

		
	}

}
