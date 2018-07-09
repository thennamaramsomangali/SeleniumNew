package learnjava;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int input=7;
		int count=0;
		Scanner scan=new Scanner(System.in);
		int input = scan.nextInt();

		if(input!=0 && input!=1) {


			for (int i=2;i<input;i++) {
				if(input%i==0) {
					count++;
				}

			}
			if (count>0) System.out.println("not prime");
			else
				System.out.println("prime");
		}
		else System.out.println("0 and 1 are not prime numbers");
	}

}
