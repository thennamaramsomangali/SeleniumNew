package learnjava;

public class UniqueString {

	public static void main(String[] args) {

		String input="good looking",output=" ";
		
		for(int i =0;i<input.length();i++) {
			
			char eachchar = input.charAt(i);
			
			if(output.indexOf(eachchar)<1 && eachchar!=32) {
				
				output=output+eachchar;
				
			}
			
		}
		System.out.println(output);
	}

}
