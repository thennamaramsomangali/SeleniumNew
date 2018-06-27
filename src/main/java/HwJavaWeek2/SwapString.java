package HwJavaWeek2;

public class SwapString {

	public static void main(String[] args) {
		
		String str1="ganesh";
		String str2="babu";
		
		int str1Length=str1.length();
		System.out.println(str1Length);  //6
		
		str1=str1+str2;
		int str1NewLength=str1.length();
		System.out.println(str1NewLength); //10
		
		str2="";
		
		str2=str1.substring(0, str1Length);   //10.substring(0,6)
		str1=str1.substring(str1Length, str1NewLength);  //10.substring(6,10)
		
		
		System.out.println(str1); //babu
		System.out.println(str2);  //ganesh
		
	}

}
