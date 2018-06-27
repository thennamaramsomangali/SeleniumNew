package HwJavaWeek2;

import java.util.Scanner;

public class Floyed {

	public static void main(String[] args) {
/*
		System.out.println("Enter the number of rows:");
		Scanner scan = new Scanner(System.in);
		int numberOfRows = scan.nextInt();
		System.out.println(numberOfRows);
		scan.close();*/ 

		int k=1;
		int numberOfRows=2;
		for (int i = 0; i <= numberOfRows; i++) {
			
			for (int j = 0; j <= i; j++) {
				
				System.out.print(k);
				k++;
				
			}
			
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		/*int k=1;
		for (int i=1;i<=numberOfRows;i++)
		{
			//System.out.println("I  "+i);
			for (int j=1;j<=i;j++)
			{
				//System.out.println("J  "+j);


				System.out.print(k);
				k++;

				//System.out.print("K  "+k);

			}
			System.out.println();
		}*/

	}

}
