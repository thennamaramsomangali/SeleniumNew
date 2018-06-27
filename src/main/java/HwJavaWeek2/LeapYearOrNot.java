package HwJavaWeek2;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {


		System.out.println("Enter the year:");
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		System.out.println(number);
		scan.close();

		/*if (number%400==0 && number!=0)

			System.out.println("Given year is a Leap year");

		else if (number%4==0 && number%100!=0)

			System.out.println("Given year is a Leap year");

		else	

			System.out.println("Given year is not a Leap year");
		 */
		if ((number%4==0 && number%100!=0) || (number%400==0)) //2004 satisfies first condition 2000 satisfies 2nd condition
		
			System.out.println("Given year is a Leap year");
		else 
		
			System.out.println("Given year is not a Leap year");
		

	}

}
