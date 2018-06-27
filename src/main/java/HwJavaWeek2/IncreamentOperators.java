package HwJavaWeek2;

public class IncreamentOperators {

	int i,j;
	public static void main (String[] args) {

		//post increament

		int i=10;
		int j=20;

		for (i=10;i<=j;i+=2)  //i=i+2;

			System.out.println("post increament "+i);


		// pre increament

		i=20;
		j=30;

		for (i=20;i<=j;++i) //i=i+1;
			System.out.println("pre increament "+i);

		//to print first 100 odd numbers 


		for (i=1;i<=200;i=i+1)
		{
			if (i%2 != 0)
			{
				if(i==99) continue;


				System.out.println("first 100 odd numbers "+i);
			}
		}


		//to print first 100 odd numbers in rev order


		for (i=200;i>=1;i--)	//i=i-1;
		{
			if (i%2 != 0) 
				System.out.println("first 100 odd numbers in rev order "+i);


		}
	}
}





