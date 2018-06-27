package learnjava;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input=123456789,temp,output=0;
		
		while(input!=0) {
			
			int q=input/10;
			int r=input%10;
			input=q;
			output=output+r;
		}
		System.out.println(output);
		
	
	}

}
