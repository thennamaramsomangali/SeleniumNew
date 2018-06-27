package learnjava;

import java.util.Scanner;

public class PalinNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan=new Scanner(System.in);
		int input = scan.nextInt();
		scan.close();*/

		int input=122,temp=0,output=0;
		temp=input;
		while(input!=0) {
			
			int q=input/10;
			int r=input%10;
			input=q;
			output=(output*10)+r;
		}
		System.out.println(output);
		
		if(output==temp) System.out.println("OK"); else System.out.println("KO");
	}

}

