package java50;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		String s1 = scan.nextLine();  ///next()  consider the space as next string //always use nextline()
		String s2 = scan.nextLine();
		scan.close();

		/*String s1="Cat is";
		String s2="Act is";*/

		String s3 = s1.replaceAll("\\s"," ");
		String s4 = s2.replaceAll("\\s"," ");

		char[] c1 = s3.toLowerCase().toCharArray();
		char[] c2 = s4.toLowerCase().toCharArray();
		
		System.out.println(c1);
		System.out.println(c2);
		
		Arrays.sort(c1);
		Arrays.sort(c2);

		boolean equals = Arrays.equals(c1, c2);
		

		if(equals)
			System.out.println("Anagram"); else System.out.println("Not an anagram");
	}

}
