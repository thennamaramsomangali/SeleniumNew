package HwJavaWeek2;

import java.util.Scanner;

public class Fibbonacci {

	public static void main(String[] args) {

		//print numbers even no. from 0 to 200

		/*int x=0,a=0,b=0,sum=0;

		for (x=0;x<100;x++)
		{
			a=x;
			sum=a+x;
			System.out.println(sum);
		}*/

		//using do while loop

		int x=0,a=0,b=1;
		do 
		{
			x=a+b;
			a=b;
			b=x;
			System.out.println(x);
			System.out.println("a "+a);
			System.out.println("b "+b);
			
			System.out.println(x);   
			System.out.println("========");
		}while(x<=10);


		/*int x=0,a=0,b=1;		//x-1,a-1,b-1  x-2,a-1,b-2  x-3,a-2,b-3 ....
			for(;;)		// using empty for loop
			{
			x=a+b;
			a=b;
			b=x;
			if (x>100)
			break;
			System.out.println(x);
			}*/
	}
}		






