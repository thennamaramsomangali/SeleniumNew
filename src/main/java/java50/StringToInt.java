package java50;

public class StringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="123";
		
		int int1 = Integer.parseInt("123");
		System.out.println(int1);

		str=Integer.toString(int1);
		System.out.println(str);

		String str1 = String.valueOf(int1); //ValueOf Returns the string representation of the int argument. 

		//The representation is exactly the one returned by the Integer.toString method of one argument.


		System.out.println(str1);
		
		String str2 = String.format("%d",int1);
		System.out.println(str2);

	}

}
