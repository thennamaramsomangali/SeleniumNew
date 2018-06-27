package java50;

public class FibonacciNumber {

	public void IsFibbonacciNumber(int num) {

		int a=0; int b=1;int c=0;

		while(c<=num && num!=0) {

			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
			System.out.println(c);
			if(c==num)
				break;
		}
		
		if(num==c || num==0) 
			System.out.println("fibbonacci series number");
		
		else
			System.out.println("not fibbo number"); 
		}
	
	public static void main(String[] args) {

		FibonacciNumber obj=new FibonacciNumber();

		obj.IsFibbonacciNumber(8);


	}

}
