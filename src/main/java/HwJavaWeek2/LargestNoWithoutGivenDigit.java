package HwJavaWeek2;

import java.util.Scanner;

public class LargestNoWithoutGivenDigit {

	public static void main(String[] args) {

		/* Get two inputs(1 Number and 1 Digit) from user. 
		 * Write a java program to find the largest number that is less than the given number 
		 * and also should not contain the given digit. 
		 * For ex, If 154 is the given number and 5 is the given digit, 
		 * then you should find the largest number less than 154 such that it should not contain 5 in it. 
		 * In this case, 149 will be the answer.*/
		System.out.println("Enter the Number:");
		Scanner scan = new Scanner(System.in);
		int numb = scan.nextInt();
		System.out.println("Enter the digit 1-9:");
		int digi = scan.nextInt();
		scan.close();
		//numb--;
		String str = Integer.toString(numb);
		while(Integer.toString(numb).contains(Integer.toString(digi))){
			numb--;
		}
		System.out.println("Largest number:"+numb);
	}

}

/*	System.out.println("Enter number and digit");
		Scanner scan=new Scanner(System.in);
		int number = scan.nextInt();
		int digit = scan.nextInt();
		scan.close();


		int sum=0,num3=0,rem=0,result;
		int copynum=number;

		while (number>0){

			rem=number%10;
			number=number/10;
			sum++;
			if(rem==digit)
				num3=sum;

		}

		for (int i=1;i<=num3;i++)

		{
			copynum=copynum/10;

		}

		result=(int) (copynum*(Math.pow(10, num3))+((int) ((digit*(Math.pow(10, num3-1)))-1)));
		System.out.println(result);



	}

}
 */