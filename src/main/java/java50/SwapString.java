package java50;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="ganesh";
		String str2="babu";
		
		int str1length = str1.length();
		System.out.println(str1length);
		
		str1=str1+str2;
		int str1newlength = str1.length();
		System.out.println(str1newlength);		
		
		System.out.println(str1);
		str2="";
		str2 = str1.substring(0, str1length);
		System.out.println(str2);
		
		str1 = str1.substring(str1length, str1newlength);
		System.out.println(str1);
		

	}

}
