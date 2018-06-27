package java50;

public class FirstRepeatedAndNonRepeatedString {

	public static void main(String[] args) {

	}

	public static void findFirstRepeatedAndNonRepeatedString(String str) {

		//String str1="";String str2="";

		char[] str1=str.toCharArray();

		for (int i = 0; i < str1.length; i++) {

			for (int j = i+1; i < str1.length-1; i++) {
				if(str1[i]==str1[j]) {
					char str2[i]=str[i];
				}
			}




		}
	}

}
