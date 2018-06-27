package HwJavaWeek2;

import java.util.Scanner;

public class ArithmeticDay5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter 2 numbers");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		scan.close();
		
		for (int i=a;a<=b;a++) 
			
		{
			//System.out.println(i);
			System.out.println(a);
		if (a%3 == 0) { System.out.println("FIZZ"); }
		else if (a%5 ==0) {  System.out.println("BUZZ"); }
		else if (a%3==0 && a%5==0)  { System.out.println("FIZZBUZZ"); }
		else { System.out.println(a); }
		}
		}

}
