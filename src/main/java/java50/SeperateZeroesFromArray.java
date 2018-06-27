package java50;

import java.util.Scanner;

public class SeperateZeroesFromArray {

public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("size of Array:");
		int size=sc.nextInt();int tmp=0;int index=0;
		
		int[] arr=new int[size];
		
		for(int i=0; i<size;i++) {
			
			arr[i]=sc.nextInt();
		}
		
		for(int i=0; i<size;i++) {
			
			if(arr[i]==0) {
				
				tmp=arr[index];       //if array size 3,values 1,2,0 then arr[2] will be stored into arr[0] and vice versa
				arr[index]=arr[i];
				arr[i]=tmp;
				index++;
				
			}
		}
		
		for (int each : arr) {
			System.out.print(each+",");
		}
		sc.close();
	}

}
