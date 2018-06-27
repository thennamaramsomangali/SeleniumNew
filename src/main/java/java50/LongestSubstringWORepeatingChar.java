package java50;

public class LongestSubstringWORepeatingChar {

	public static void main(String[] args) {

		String str="abcd abcdefghji aaaaaaaaabbbbbbbbbb";
		
		str=str.replaceAll(" ", ""); String str1=""; String str2=""; 
		
		for (int i = 0; i <str.length(); i++) {
			
			str1=str1+str.charAt(i);
			
			for (int j =1; j < str.length(); j++) {
				
				str1=str1+str.charAt(j);
				
				if(str1.charAt(j)==str1.charAt(j-1) && str1.length()>str2.length()) {
					str2=str1;
					break;
				}
				
				
			       /*System.out.println(str1);
				
				   if(str1.charAt(i)==str1.charAt(j))
					   
					
					if(str1.length()>str2.length() ) {
						str2=str1;
					}*/
				
					
			}    str1=" ";
		}
		
		System.out.println(str2);
		
		
		
	}
	
	public static void findLongestSubStr(String str) {
		
		
	}

}
