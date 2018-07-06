package learnjava;

import java.util.Arrays;

public class SecondBigNumber {

	public static void main (String[] agrs) {

		int arr[]= {1,2,3,-2},temp=0;	
		System.out.println(arr); //gives id of array i.e,[I@52e922
		int size = arr.length;
		System.out.println(size);  //4

		for (int i = 0; i < arr.length; i++) {

			for (int j = i+1; j < arr.length; j++) {

				if(arr[i]>arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;

				}

			}

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
		System.out.println(arr[2]); //second big no.

	}
}
