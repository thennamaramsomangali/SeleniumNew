package HwJavaWeek2;

import org.apache.xmlbeans.impl.piccolo.xml.ASCIIXMLDecoder;

public class StringHandling {

	public static void main(String[] args) {

		String input1=new String("a1b2c3");

		char[] charArray = input1.toCharArray(); // to iterate each char we are converting to chararray from string
		
		for (int i = 0; i < charArray.length; i++) {
			int c = charArray[i];  //storing ascii value of each char //if chr is stored in int it will give ascii value
			charArray[i]=(char) (c+1);  //to get char output //changing int to char
			
		}

		for (char c : charArray) {

			System.out.print(c);

		}
		
		System.out.println("");

		String str="testleaf";

		char ch='t'; int count=0;

		char[] charArray2 = str.toCharArray(); //to iterate each char we are converting to chararray from string
		

		for (char c : charArray2 ) {

			if(c==ch) {

				count++;
			}


		}

		System.out.println(count);

	}

}
