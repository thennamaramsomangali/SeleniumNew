package java50;

public class SumOf2Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input=12;int output=0;
		
		while(input>0) {
			
			int remainder=input%10;
			int quotient=input/10;
			input=quotient;
			output=output+remainder;
			
		}
		System.out.println(output);
	}

}
