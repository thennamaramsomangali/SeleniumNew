package HwJavaWeek2;

import java.util.Scanner;

public class Scanners {
	
	public static void main(String[] args) {		
		Scanner scanInput = new Scanner(System.in);		
		System.out.println(scanInput.nextInt()); //getting integer		
		System.out.println(scanInput.next());   //getting String
		System.out.println(scanInput.nextFloat()); //getting float.	
		scanInput.close();
	}}
	/*public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			
			System.out.println(input.next());
			System.out.println(input.nextBoolean());
			System.out.println(input.nextLine());
			System.out.println(input.nextInt());
			System.out.println(input.nextFloat());
			System.out.println();
			}}*/
