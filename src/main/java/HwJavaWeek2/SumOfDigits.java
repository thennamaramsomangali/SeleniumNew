package HwJavaWeek2;

public class SumOfDigits {

	public static void main(String[] args) {
		int inputNumber=12345;
		int sumOfDigit=0;

		while (inputNumber != 0)
		{
			int	quetient = inputNumber/10;
			int remainder = inputNumber%10;
			inputNumber = quetient;
			sumOfDigit = sumOfDigit+remainder;
			System.out.println(sumOfDigit);
		}
		System.out.println(sumOfDigit);	
	}

}
