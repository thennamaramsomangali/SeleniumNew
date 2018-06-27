package HwJavaWeek2;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {


		/*int n, count = 0, a, b, c, sum = 0;
	        System.out.print("Armstrong numbers from 100 to 1000:");
	        for(int i = 100; i <= 1000; i++)
	        {
	            n = i;
	            while(n > 0)
	            {
	                b = n % 10;
	                sum = sum + (b * b * b);
	                n = n / 10;
	            }
	            if(sum == i)
	            {
	                System.out.print(i+" ");
	            }
	            sum = 0;
	        }*/

		//another
		int c=0,a,temp;  
		int n=153;//It is the number to check armstrong  
		temp=n;  
		while(n>0)  
		{  
			a=n%10;  
			n=n/10;  
			c=c+(a*a*a);  
			System.out.println(c);
		}  
		if(temp==c)  
			System.out.println("armstrong number");   
		else  
			System.out.println("Not armstrong number");  


		//another

		/*Write a Java Program to print the Armstrong number from 100 to 1000.
		Note : Armstrong number is a number that is equal to the sum of cubes of its digits. 
		For example 153 is an Armstrong number since 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153.
		for(int i=100;i<1000;i++)
		{
			int n=i,sum=0;
			int numLen = String.valueOf(i).length();
			while(n>0)
			{
				int r=n%10;
				sum=sum + (int)(Math.pow(r, numLen));
				n=n/10;
			}
			if (i==sum)
			{
				System.out.println(i+" is Amstrong number");
			}
		}*/


	}

}