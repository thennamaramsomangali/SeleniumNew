package learnjava;

public class StringLowerToUpper {

	public static void main(String[] args) {

		String input="g i";char output=' ';
		System.out.println(input.length()); //3

		for (int i = 0; i < input.length(); i++) {

			int eachchar=(int)	input.charAt(i);

			output=' ';
			if(eachchar>='a' && eachchar<='z') {

				eachchar=eachchar-32;
				output=(char) eachchar;

			}
			System.out.print(output);
		}
	}
}
/*
			String upperCase = input.toUpperCase();
			System.out.println(upperCase);
		}
 */

