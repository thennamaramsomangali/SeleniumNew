package HwJavaWeek2;

import java.util.Scanner;

public class ArithmeticDay3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1.Write a Java Program to get 3 user inputs 
		Two Numbers 
		One String which can be either of the below “Add”/”Subtract”/“Multiply”/”Divide”
		2. Perform the equivalent arithmetic operation.
		3. Print the result in the console.*/

		double var1,var2;
		
		Scanner scan=new Scanner(System.in);
		//get input for var1
		System.out.println("Enter the First number:");
		var1=scan.nextDouble();
		//double nextDouble = scan.nextDouble();  //also same
		//get input for var2
		System.out.println("Enter the Second number:");
		var2=scan.nextDouble();
		//get input for operation
		System.out.println("Enter the Operation:Add/Subtract/Multiply/Divide:");
		String operator=scan.next();
		scan.close();
			
		switch(operator)
		{
		case "Add":
			System.out.println("Addition of " + var1 + " and " + var2 + " is " + (var1 + var2));
			break;
		case "Subtract":
			System.out.println("Subtraction of " + var1 + " and " + var2 + " is " + (var1 - var2));
			break;
		case "Multiply":
			System.out.println("Multiplication of " + var1 + " and " + var2 + " is " + (var1 * var2));
			break;
		case "Divide":
			if (var2 != 0)
				System.out.println("Division of " + var1 + " and " + var2 + " is " + (var1 / var2));
			else
				System.out.println("Division cannot be performed for the entered second number (Zero)");
			break;
		default:
			System.out.println("Enter a Valid Operation");
			
		}
		
		
	}

}
