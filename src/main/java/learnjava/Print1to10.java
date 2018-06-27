package learnjava;

import java.util.Scanner;

public class Print1to10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan=new Scanner(System.in);
		int input = scan.nextInt();
		scan.close();*/
		
		print(1);
			
		}
	
	public static void print(int input) {
		if(input<=10) {
			System.out.println(input);
			print(input+1);
	}
	}
}

