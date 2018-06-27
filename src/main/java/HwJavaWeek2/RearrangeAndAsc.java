package HwJavaWeek2;

import java.util.Arrays;

public class RearrangeAndAsc {

	public static void main(String[] args) {

		/*Write a simple Java program to rearrange a given number in ascending order of their digits.
		Ex   –   Input - 19673
				 Output - 13679*/
		int origDigit = 19673;
		int digit = origDigit;
		String digitStr = Integer.toString(origDigit);  //int to string
		//String digitStr = origDigit+"";
		
		
		System.out.println(digitStr.length());  
		
		int[] arr = new int[digitStr.length()]; //initialising array with memory size
		int index = 0, tmp, val;
		String num="";
		while(digit>0){
			val = digit%10;
			digit = digit/10;
			arr[index] = val;
			index++;
		}
		System.out.println(index);
		
		// Arrays.sort(arr) can also be used for below
		System.out.println(arr.length);
		 
		 
		for (int j = 0; j < arr.length; j++) {
			for (int j2 = j; j2 < arr.length; j2++) {
				if(arr[j]>arr[j2]){
					tmp = arr[j2];
					arr[j2]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		/*System.out.print("The ascending order of number "+origDigit+" is ");
		System.out.println(Arrays.toString(arr).replace(", ", "").replace("[", "").replace("]", ""));
		System.out.print("The ascending order of number "+origDigit+" is ");
		System.out.println(Arrays.toString(arr).replaceAll("[\\W]", ""));
		System.out.print("The ascending order of number "+origDigit+" is ");
		for (int j : arr) {
			System.out.print(j);
		}*/

		for (int i = 0; i < arr.length; i++) {
			
		num=num+Integer.toString(arr[i]); //int array  to string  
		}
		//System.out.println(num);
		
		int output = Integer.parseInt(num); //string to int
		
		System.out.println(output);
	}

}
