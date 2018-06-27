package java50;

public class DiffBwEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = new String("HELLO"); //object way
		String s2 = new String("HELLO");
		System.out.println(s1 == s2); //false as both have different addresses in memory.
		System.out.println(s1.equals(s2)); //true as comparing the values given in s1 and s2.

		String str1="HELLO";  //literal way 
		String str2="HELLO";
		System.out.println(str1==str2); //true as comparing the values 
	}

}


