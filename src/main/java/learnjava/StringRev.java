package learnjava;

import java.util.Scanner;

public class StringRev {

	public static void main(String[] args) {
		
		String str1="ganesh",str2="babu";
		int str1length = str1.length();
		System.out.println(str1length);
		int str2length = str2.length();
		System.out.println(str2length);
		
		String str1new=str1+str2;
		int strnewlength = str1new.length();
		System.out.println(strnewlength);
		
		str2="";
		str2 = str1new.substring(str1length, strnewlength);
		System.out.println(str2);
		
		str1 = str1new.substring(0, str1length);
		System.out.println(str1);
		
		
		
	}

}

