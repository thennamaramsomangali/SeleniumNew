package HwJavaWeek2;

import java.util.Scanner;

public class CombinationOfDigits {

	private static Scanner sc;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Write a Java program to get 3 digit number from the user and print all the possible combinations of the numbers
		 *  with the digits present.
		Ex � Input � 123
			  Output � 123 , 132 , 213 , 231 , 312 , 321*/
		int i, number;
		sc = new Scanner(System.in);		
		System.out.println("Please Enter any Number: ");
		String s = sc.next();
		System.out.println("String "+s);
		i=s.length();
		System.out.println("Length of String "+i);
		int a[]=new int[i];
		i=0;
		number=Integer.parseInt(s);
		System.out.println("After converting String into Integer "+number);
		//Dividing the number in to an array
		while(number>0) {
			int temp=number%10;
			a[i]=temp;
			System.out.println(a[i]);
			number=number/10;
			System.out.println(number);
			i++;
		}
		permute(0, a);
	}
	public  static void permute(int start, int[] input ) {
		System.out.println(input.length);
		if (start == input.length) {
			for(int x: input){
				System.out.print(x);
			}
			System.out.println("");
			return;
		}
		for (int i = start; i < input.length; i++) {
			int temp = input[i];
			input[i] = input[start];
			input[start] = temp;

			permute(start + 1, input);

			temp = input[i];
			input[i] = input[start];
			input[start] = temp;
		}

	}

}
