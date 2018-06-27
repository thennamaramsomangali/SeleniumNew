package HwJavaWeek2;


public class PalindromeNumber {

	public static void main(String[] args) {
		
		int inputNumber = 1001;
		int outputNumber = 0;
		int temp = inputNumber;
		
		while (inputNumber != 0)
		{
			System.out.println("INPUT "+inputNumber);
			int quotient = inputNumber/10;
			System.out.println(quotient);
			int remainder = inputNumber%10;
			System.out.println(remainder);
			outputNumber = outputNumber*10+remainder;
			inputNumber = quotient;	
			System.out.println("OUTPUT "+outputNumber);
		}
		
		if (temp == outputNumber)	{	
			System.out.println();             //print line
			System.out.println("palindrome");
		}
		else 		
			System.out.println("not a palindrome");
		
	}

}
