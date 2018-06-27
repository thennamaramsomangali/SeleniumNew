package java50;

import java.util.Scanner;

public class BinaryOrNot {

	public static void main(String[] args) {

		int input = 101,count=0;
		String str = Integer.toString(input);

		for (int i = 0; i < str.length(); i++) {

			if(str.charAt(i)=='0' || str.charAt(i)=='1')
				count++;
		}
		if(count==str.length())
		System.out.println("OK");
		else  System.out.println("KO");

	}
}
