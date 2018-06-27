package HwJavaWeek2;

import java.util.Iterator;
import java.util.Scanner;

public class FactorsAndPrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Write a simple Java program to print all factors of number 
		 * using non-static method and print all prime factors of number using static method. */
		System.out.println("Enter the number to find prime factors and factors");
		Scanner scan = new Scanner(System.in);
		int numb = scan.nextInt();
		scan.close();
		FactorsAndPrimeFactors.primeFactors(numb);  //since method is in same class we can call as  primeFactors(numb); also
        System.out.println();
        new FactorsAndPrimeFactors().factors(numb); //instread of obj new FactorsAndPrimeFactors() //same
	}
	
	/*public static void primeFactors(int num) {
		System.out.print("Prime factors of number " + num +" are ");
		for (int i = 2; i <= num; i++) {
			boolean flag = false;
			while (num % i == 0) {
				num /= i;  //num=num/i;
				flag = true;
			}
			if (flag)
				//System.out.print(i +", ");
				System.out.print(i +", ");
		}
    }*/
	
	public static void primeFactors(int num) {
		int count=0;int i,j;
		for (i = 2; i <= num; i++) {
			if(num%i==0) {
				for (j = 2; j <= num; j++) {
					if(i%j==0) {
						count++;
					}
					
				}
				if (count==1)
					System.out.println("Primefactors "+i);
				count=0;
			}
			
		}
	}
	
	public void factors(int num) {
		System.out.print("Factors of number " + num +" are ");
		for(int i = 1; i <= num; i++) {
			if(num%i == 0) {
				//System.out.format("%d, ", i);
				System.out.print(i +", ");
			}
		}

	}

}
