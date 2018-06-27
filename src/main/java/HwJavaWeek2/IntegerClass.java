package HwJavaWeek2;

public class IntegerClass {

	public static void main(String[] args) {
		
		int a=5;
		int b=10;
		String name="1234";
		
		int number=Integer.parseInt(name);  // calling static method of Integer Class Integer.parseInt //converting string to int
			
		System.out.println("Number "+number);
		
		a+=number; //a=a+number;
		
		System.out.println("a "+a);
		
		int returnValue =Integer.compare(number, a-5); // comparing two values returns 0 or +ve or -ve value
		
		System.out.println(returnValue);   //if equals returns 0
		
		int returnValue1 =Integer.compare(number, a);
		System.out.println(returnValue1);   //if not equals returns -1
		
		System.out.println(Integer.bitCount(b));	//for ex:bitcount of 10 is 2
		
		System.out.println(Integer.max(a,b));  //gives max value

		

	}

}



