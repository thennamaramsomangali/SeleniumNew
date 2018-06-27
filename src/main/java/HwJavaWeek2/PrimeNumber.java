package HwJavaWeek2;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {		/////prime no=paka en

		/*int i=0;
		while(i<1)
		{
		Scanner scanInput = new Scanner(System.in);

		int primeNum=scanInput.nextInt();

		System.out.println(primeNum);

		for(int a=2;a<primeNum;a++)
		{
			if(primeNum%a==0) {
				i++;
			}
		}
		if(i>=1)
		System.out.println("not primeNum");
		else 
			System.out.println("primeNum");

		}*/

		int i=0;

		while(i<1)
		{		
			Scanner inputValue=new Scanner(System.in);

			int number=inputValue.nextInt();

			System.out.println(number);
			
			inputValue.close();
			
			for (int x=2;x<number;x++)
			{
				if(number%x==0) {
					i++;
					
				}
			}
			System.out.println(i);
			
			if (i>=1)
				System.out.println("not prime");
			else
				System.out.println("prime");		
			
			
		}

	}
}




