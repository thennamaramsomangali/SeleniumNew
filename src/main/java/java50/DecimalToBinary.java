package java50;

import java.util.Scanner;

public class DecimalToBinary {


	public static void main(String[] args) {

		String input=Integer.toBinaryString(10);

		System.out.println(input);

		String input2=Integer.toOctalString(10);

		System.out.println(input2);

		String  input1=Integer.toHexString(17);

		System.out.println(input1);

		//using tostring()

		System.out.println("Decimal to HexaDecimal,Octal and Binary");
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter the number :");
		int num = Integer.parseInt(scan.nextLine());

		String binaryString = Integer.toString(num,2);
		System.out.println("decimal to binary using Integer.toString: " + binaryString);

		//decimal to octal
		String octalString = Integer.toString(num,8);
		System.out.println("decimal to octal using Integer.toString: " + octalString);

		//decimal to hexadecimal
		String hexString = Integer.toString(num,16);
		System.out.println("decimal to hexadecimal using Integer.toString: " + hexString);

	}

}
