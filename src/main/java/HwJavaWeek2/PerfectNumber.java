package HwJavaWeek2;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		int i, Number, Sum = 0 ;
		Scanner sc = new Scanner(System.in);		
		System.out.print("Please Enter any Number: ");
		Number = sc.nextInt();
		sc.close();
		System.out.println(Number);
		
		for(i = 1 ; i < Number ; i++)
		{
			if(Number % i == 0) 
			{
				Sum = Sum + i;
				System.out.println(Sum);
			}
		}
		if (Sum == Number)
		{
			//System.out.format("%d is a Perfect Number", Number); // new way of printing
			System.out.println(Number+" is a Perfect Number");
		}
		else 
		{
			System.out.format("%d is NOT a Perfect Number", Number);
		}

	}

}
