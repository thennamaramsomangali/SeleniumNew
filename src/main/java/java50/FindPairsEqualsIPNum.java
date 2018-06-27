package java50;

public class FindPairsEqualsIPNum {


	public static void main(String[] args) {

		int[] inputArray= {0,2,3,2,1,1,7,8,9};
		int  inputNumber=8;int a=0;


		for (int i = 0; i < inputArray.length; i++)

		{
			a=inputArray[i];
			for (int j =i+1; j < inputArray.length; j++)
			{
				/*if(inputArray[i]+inputArray[j] == inputNumber)
				{
					System.out.println(inputArray[i]+" ,"+inputArray[j]);

				}*/

				if(a<inputNumber){
					a=a+inputArray[j];
                                                        //continous sub array
					if(a==inputNumber) {

						for (int k =i; k <=j; k++) {
							System.out.print(inputArray[k]);
						}
						System.out.println();
						break;
					}
				}

					if(a==inputNumber) {
						System.out.println(inputArray[i]);
					}

				
			}
		}
	}}