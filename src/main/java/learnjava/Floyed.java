package learnjava;

import java.util.Scanner;

public class Floyed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int input = scan.nextInt();
		scan.close();
		
		int k=1;
		for (int i = 1; i <= input; i++) {
			
			for (int j = 1; j <= i; j++) {
				
				
				System.out.print(k);
				k++;
				
			}
			
			System.out.println();
			
		}
	}

}
