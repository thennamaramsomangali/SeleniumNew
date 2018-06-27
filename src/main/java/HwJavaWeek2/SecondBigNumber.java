package HwJavaWeek2;

public class SecondBigNumber {

	public static void main (String[] agrs) {

		int arr[]= {1,2,3,-2};	
		System.out.println(arr); //gives id of array i.e,[I@52e922
		int size = arr.length;
		System.out.println(size);  //4


		for (int i=0;i<size;i++) {

			int temp=0;
			for(int j=0;j<size;j++) {

				if(arr[i]<arr[j])    //desc order
				{  
					/*temp = arr[i];  
					arr[i] = arr[j];  
					arr[j] = temp;  */

					temp=arr[j];
					arr[j] = arr[i];     //swap
					arr[i]=temp;											

					System.out.println("i  "+arr[i]);
					System.out.println("j  "+arr[j]);
					//System.out.println(arr[i]+"  "+arr[j]);
 //231  12-2		
					
				}
				
			}
			
		}
				
		/*System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);*/
		
		 
		//printing the sorted array and second largest

		for(int k=0;k<size;k++)
		{
			System.out.println(arr[k]);
		}

		System.out.println("second largest is" +" "+arr[1]);
	}

}
