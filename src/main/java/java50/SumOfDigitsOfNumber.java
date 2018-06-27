package java50;

public class SumOfDigitsOfNumber {

	public static void main(String[] args) {

		int input,quotient,remainder,temp=0;

		input=123456;

		while(input>0) {

			quotient=input/10;
			remainder=input%10;
			input=quotient;
			temp=temp+remainder;
		}
		
		System.out.println(temp);
	}
}