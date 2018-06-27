package HwJavaWeek2;

import java.util.Scanner;

public class PolinStringDay4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String[] name={"aba","bab"};		
		//String n="aba";
		
		String rev="";
				
		Scanner scanInput=new Scanner(System.in);
		String name = scanInput.next();
		
		//String name = scanInput.nextLine();
			
		System.out.println(name);	
	    int orig = name.length(); 
	    System.out.println("Length of given String "+orig);
	    scanInput.close();
	    
	    
	    for (int i=orig-1;i>=0;i--)  //StringIndexOutOfBoundsException if i=orig
	   
		{
			System.out.println(i);
			rev=rev+name.charAt(i);		//rev=a in first iteration, ab in 2nd , aba in 3rd  (for aba input)
			System.out.println("==============");
			System.out.println(rev);
		}
		if (name.equals(rev))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
		
			//to print each char
		
		String name1="abcd";
		for(int i=0;i<name1.length();i++){
			char c=name1.charAt(i);
		 	System.out.print(c);
		}
}
}
