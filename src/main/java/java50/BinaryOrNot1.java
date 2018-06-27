package java50;

import java.util.Scanner;

public class BinaryOrNot1 {

	public static void main(String[] args) {

		String s="ga1";int count=0;

		System.out.println(s.length());

		for (int i=0; i < s.length(); i++) {
			if (s.charAt(i)!='0' && s.charAt(i)!='1')
				count++;
		}

		if (count==0)
			System.out.println("Binary"); else System.out.println("Not Binary");

		
		
		/*for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c==s.charAt(i))
				System.out.println();
		}

		System.out.println(count);
		if (count==0)
			System.out.println("Binary"); else System.out.println("Not Binary");*/

		


		

	}
}
