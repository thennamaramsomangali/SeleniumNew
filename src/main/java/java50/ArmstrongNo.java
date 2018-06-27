package java50;

public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input=153;
		int temp=input;
		int output=0;
		
		while(input>0)
		{
			int rem=input%10;
			input=input/10;
			output=output+(rem*rem*rem);
			
		}
		System.out.println(output);
		
		
		if (temp==output)
			System.out.println("OK"); else System.out.println("KO");

	}

}
