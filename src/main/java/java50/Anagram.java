package java50;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*	String str1="Cat"
		String str2="act";
		char[] anag1=str1.replaceAll("\\s", "").toLowerCase().toCharArray();
		char[] anag2=str2.replaceAll("\\s", "").toLowerCase().toCharArray();
		Arrays.sort(anag1);
		Arrays.sort(anag2);
		System.out.println(Arrays.equals(anag1, anag2)? "words are anagrams":"words are not anagrams"); */


		String input1= "CAt is";
		String input2 = "act is";
		isAnagram(input1, input2);

	}

	public static void isAnagram(String input1, String input2){
		//Remove all whitespace first
		String  s1= input1.replaceAll("\\s", "");
		System.out.println(s1);

		String s2 = input2.replaceAll("\\s", "");
		System.out.println(s2);

		boolean status = true;

		if(s1.length() != s2.length())
		{
			status = false;
		}else {
			//Convert into character array

			char[] s1Array = s1.toLowerCase().toCharArray();

			char[] s2Array = s2.toLowerCase().toCharArray();

			//Sorting both character array

			Arrays.sort(s1Array);

			Arrays.sort(s2Array);

			//Check if both arrays are equal

			status = Arrays.equals(s1Array, s2Array);
			
			
		}
		if(status){
			System.out.println(s1+" and "+s2+" are anagrams");
		} else {
			System.out.println(s1+" and "+s2+" are not anagrams");
		}
	}

}

