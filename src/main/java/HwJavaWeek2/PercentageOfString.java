package HwJavaWeek2;

import java.util.Scanner;

public class PercentageOfString {

	public static void main(String[] args) {

		String password="TigerRuns@SpeedOf100KM/hour";
		int totalChar = password.length();
		System.out.println(totalChar);

		int lower=0;
		int upper=0;
		int number=0;
		int special=0;

		for (int i=0;i<totalChar;i++)
		{
			int eachChar =(int) password.charAt(i);  //changing string to int
			
			if(eachChar>='a' && eachChar<='z')
				lower++;
			else if(eachChar>='A' && eachChar<='Z')
				upper++;
			else if(eachChar>='0' && eachChar<='9')
				number++;
			else 
				special++;
		}

		System.out.println("Types of characters:");
		System.out.println(lower);
		System.out.println(upper);
		System.out.println(number);
		System.out.println(special);
	
		float f1,f2,f3,f4=0;
		f1=(lower*100)/totalChar;
		f2=(upper*100)/totalChar;
		f3=(number*100)/totalChar;
		f4=(special*100)/totalChar;
		
		System.out.println("Percentage:");
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		
	}


}
