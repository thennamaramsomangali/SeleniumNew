package java50;

public class InputIsNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String password="TigerRuns@SpeedOf100KM/hour";
		String password="123456";
		int totalChar = password.length();
		//System.out.println(totalChar);

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

		/*System.out.println("Types of characters:");
		System.out.println(lower);
		System.out.println(upper);
		System.out.println(number);
		System.out.println(special);*/
		
		
		if(number>0 && upper==0 && lower==0 && special==0 ) {
			System.out.println("Number");
		}
		else
			System.out.println("Not a Number");
	}
}


