package java50;

import java.util.Scanner;


public class FindingGivenInputAsNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String str = sc.nextLine();
		int count=0;
		
		int[] arr=new int[str.length()]; // array size should be initialised
		
		for(int i=0;i<str.length();i++) {
			
			arr[i]= str.charAt(i);
			if(Character.isDigit(arr[i])) {
			count++;}
			}
		
		if(count==str.length()) System.out.println("number");
		else System.out.println("not a number");
	}

}
