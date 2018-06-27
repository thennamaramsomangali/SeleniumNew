package HwJavaWeek2;

import java.util.Scanner;

public class TableCreationHw {

	public static void main(String []args) {
		
		System.out.println("Enter Number");
		Scanner scan=new Scanner(System.in);
		int number = scan.nextInt();
		System.out.println(number);
		scan.close();
		
		
		int x;
		for(x=1;x<5;x++)
		{
			int output=0;  //int input; also same
			output=x*number;
			System.out.println(x+"*"+number+"="+output);
		}
	
		
		/*System.out.println("Number");
		Scanner scan=new Scanner(System.in);
		int input = scan.nextInt();
		System.out.println(input);
		scan.close();
		
		int x;
		
		for(x=1;x<5;x++)
		{
			int output=x*input;
			System.out.println(x+"*"+input+"="+output);
		}
		*/
		
		
	}
	
}

				
		
		
		
		
		
		
		
		
		
		
		
		
		