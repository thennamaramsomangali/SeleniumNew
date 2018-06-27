package HwJavaWeek2;

public class UniqueString {

	public static void main(String[] args) {

		String inputString="good";
		String output="";
		
		for(int i=0;i<inputString.length();i++)
		{
			char eachChar = inputString.charAt(i);
			System.out.println("EACH CHAR  "+eachChar);
		if(output.indexOf(eachChar)<0 && eachChar!=32) //&& eachChar!=32 for space
			
				output=output+eachChar;
				System.out.println("OUTPUT  "+output);
				
		}
		System.out.println(output);
		
	/*	Write a simple Java program to identify and form a string with unique characters. 
		Ex. Input=Good Looking. 
			Output should be = godlkin.
		String input="Good looking";
		String output="";
		char b[]=input.toLowerCase().replace(" ", "").toCharArray();
		System.out.println("Input:"+input);
		for (int i=0;i<b.length;i++) {
			if(!output.contains(b[i]+"")) {
				output = output + b[i];
			}
		}
		for (int i=0;i<b.length;i++) {
			if(output.indexOf(b[i]) == -1) {
				output = output + b[i];
			}
		}
		System.out.println("Output:"+output);*/
	}

}
