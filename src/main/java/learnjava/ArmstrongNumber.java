package learnjava;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {


	int input=154,output=0,temp;
	temp=input;
	while(input!=0) {
		int q=input/10;
		int r=input%10;
		input=q;
		output=output+(r*r*r);
		
	}
	if(output==temp) System.out.println("OK"); else System.out.println("KO");
	

	}

}