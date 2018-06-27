package learnjava;

import java.util.Scanner;

public class StringSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan=new Scanner(System.in);
		int input = scan.nextInt();
		scan.close();*/

		String input="ganesh",rev="";
		int inputlength = input.length();
		System.out.println(inputlength);

		for(int i=inputlength-1;i>=0;i--) {

			rev=rev+input.charAt(i);
		}

		System.out.println(rev);
	}

}

