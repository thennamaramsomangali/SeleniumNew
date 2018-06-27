package HwJavaWeek2;

import java.util.Scanner;

public class FactorialDay1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//Factorial 4!=24
			/*	System.out.println("Enter the number for Factor:");
				Scanner scan=new Scanner(System.in);
				int numb=scan.nextInt();
				System.out.println(numb);
				scan.close();
				
				
				int i,fact=1;
				for(i=2;i<=numb;i++){    
					fact=fact*i;    
				}    
				System.out.println("Factorial of "+numb+" is: "+fact);   
				
			}}*/

		//Factorial of 14 is: 1278945280 -- need to use long for finding factorial of numbers 
		//Factorial of 13 is: 1932053504
		//Factorial of 12 is: 479001600
		


		//another way


		//Get input number from user
		/*int inputNumber=0, product=1;
			Scanner scanInputnumber = new Scanner(System.in); // create an object of class Scanner
			while(inputNumber<=0)							 // Get a positive value for input number from user
			{
				System.out.print("Enter a Non-zero number to find Factorial: ");
				inputNumber = scanInputnumber.nextInt();	  // Read input number

			}
			scanInputnumber.close();

			System.out.print("The Factorial of " + inputNumber+ " => ");

			for(int counter=inputNumber;counter>=1;counter--)
			{	
				product = product * counter;			// iterate count upto 1 from input number to find each product
				if(counter > 1)
					System.out.print(counter + " * ");
				else System.out.print(counter + " ");
			}
			System.out.print(" = " +product);
			}

			}*/

		//another way

		Scanner scan=new Scanner(System.in);
		int factorialnumber=scan.nextInt();
		System.out.println(factorialnumber);
		scan.close();
		
		int a=1;

		if (factorialnumber==0)
			System.out.println("1");


		while(factorialnumber!=0)
		{
			a=a*factorialnumber;

			if (factorialnumber==1)
				System.out.println(a);
			factorialnumber--;

		}
		}
	}



	


