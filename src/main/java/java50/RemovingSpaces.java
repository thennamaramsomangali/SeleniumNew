package java50;

public class RemovingSpaces {

	public static void main(String[] args) {
	
		String str="               aa   b  b  ";
		
		//("\\s+", " ") replaces all spaces(1 or more) with only one space
		//("\\s+", "") replaces all spaces
		//("\\s+$", "") removes the trailing spaces.
		
		System.out.println(str.replaceAll("\\s+"," "));
		System.out.println(str.replaceAll("\\s+",""));
		
		System.out.println(str.replaceAll("\\s+$",""));
		System.out.println(str.replaceAll("\\s+"," ").replaceAll("\\s+$",""));
		
			
		
		String t2 ="!@#$%^&*()-';,./?><+Ab dd";

		String t3 = t2.replaceAll("[^a-zA-Z]"," ").replaceAll("\\s+"," ");

		//replaceAll("[^A-Za-z0-9]",""); //replaceAll("\\W", "");

		System.out.println(t3);

	}

}
