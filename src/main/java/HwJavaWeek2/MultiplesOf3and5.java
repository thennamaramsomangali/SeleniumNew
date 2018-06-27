package HwJavaWeek2;

import java.util.Scanner;

public class MultiplesOf3and5 {

	//to print multiples of 3 and 5 (for 10 multiples of 3 is 3,6,9 and multiples of 5 is 5,10)
	public static void main(String[] args) {

		System.out.println("Enter the number:");
		Scanner scan=new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(num);
		scan.close();
		
		int result=0,i;
		for(i=1;i<=num;i++)
		{
		if((i%3==0) || (i%5==0))
		result = result + i;
		System.out.println(result);
		}
		System.out.println("THE RESULT IS " + result);

		//by hardcoded value
		
		/*int result = 0, i=1;
		System.out.println("ENTER YOUR NUMBER");
			
		for(i=1;i<20;i++)
		{
		if((i%3==0) || (i%5==0))
		result = result + i;
		System.out.println(result);
		}
		System.out.println("THE RESULT IS " + result);*/

		
		
/*		int inpnum = scan.nextInt();
		System.out.println(inpnum);

		int sum1=0;

		System.out.println("Enter the first divider:");
		int divider1=scan.nextInt();
		int quo1=inpnum/divider1;
		int rem1=inpnum/divider1;

		if(rem1==0)
		{

			for(int j=quo1-1;j<=quo1;j--)
			{
				sum1=sum1+(divider1*j);
				if(j==0)
					break;

			}
		}
		else
		{
			for(int j=quo1;j<=quo1;j--)
			{
				sum1=sum1+(divider1*j);
				if(j==0)
					break;

			}
		}

		System.out.println(sum1);

		int sum2=0;
		System.out.println("Enter the second divider:");
		int divider2=scan.nextInt();
		int quo2=inpnum/divider2;
		int rem2=inpnum%divider2;

		if(rem2==0)
		{
			for(int i=quo2-1;i<=quo2;i--)
			{
				sum2=sum2+(divider2*i);
				if(i==0)
					break;

			}
		}
		else
		{
			for(int i=quo2;i<=quo2;i--)
			{
				sum2=sum2+(divider2*i);
				if(i==0)
					break;

			}
		}

		System.out.println(sum2);

		int answer=sum1+sum2;
		System.out.println(answer);*/
	}
}


