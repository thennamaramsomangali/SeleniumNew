package learnjava;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		scan.close();
		
		char[] c1 = s1.replaceAll("\\s", " ").toLowerCase().toCharArray();
		char[] c2 = s2.replaceAll("\\s", " ").toLowerCase().toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		boolean equals = Arrays.equals(c1, c2);
		
		
		//if(c1.equals(c2)) System.out.println("Anagram"); else System.out.println("Not anagram");
		
		if (equals) System.out.println("Anagram"); else System.out.println("Not anagram");
	}

}
