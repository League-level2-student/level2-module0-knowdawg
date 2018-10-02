package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] str = new String[5];
		str[0] = "YAY";
		str[1] = "YEE";
		str[2] = "YEA";
		str[3] = "YAE";
		str[4] = "YEET";
		//2. print the third element in the array
		System.out.println(str[2]);
		//3. set the third element to a different value
		str[2] = "YEAT";
		//4. print the third element again
		System.out.println(str[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println(str[i]);
			
		}
		
		Random randy = new Random();
		//6. make an array of 50 integers
		int[] in = new int[50];
		
		for (int i = 0; i < 50; i++) {
			
			in[i] = randy.nextInt();
			System.out.println(in[i]);
			
			
		}
		//7. use a for loop to make every value of the integer array a random number
		
		//8. without printing the entire array, print only the smallest number in the array
		
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	}
}
