package learnjava;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan=new Scanner(System.in);
		int input = scan.nextInt();
		scan.close();*/

		/*int input=4,output=0,temp=0;
		
		if (input==0) System.out.println("1");
		
		int k=1;
		while(input!=0) {
			
			k=k*input;
			
			if(input==1)
				System.out.println(k);
			input--;
			
		}
		*/
		int input1=4,a=1;
		if (input1==0 ||input1==1) System.out.println("1"); else
		for (int i=2;i<=input1;i++) {
			a=a*i;
			
		}
		System.out.println(a);
		
	}
}



