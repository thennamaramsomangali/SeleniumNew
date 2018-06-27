package learnjava;

import java.util.Scanner;

public class Tablecreation {

	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	int input = scan.nextInt();
	System.out.println(input);
	
	int i,output=0;
	for (i = 1; i < input; i++) {
		output=input*i;
		
		System.out.println(input+"*"+i+"="+output);
	}
	
	}
}