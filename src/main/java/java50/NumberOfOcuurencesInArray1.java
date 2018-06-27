package java50;

import java.util.HashMap;
import java.util.Scanner;

public class NumberOfOcuurencesInArray1 {

	public static void main(String[] args) {

		int[] arr=new int[4];

		for (int i = 0; i < arr.length; i++) {

			Scanner sc=new Scanner(System.in);
			arr[i] = sc.nextInt();
			

		}
		HashMap<Integer,Integer> hm=new HashMap<>();

		for (int each : arr) {

			if(hm.containsKey(each)) {
				int val = hm.get(each);
				hm.put(each, val+1);
			}

			else hm.put(each, 1);

		}
		System.out.println(hm);
		
	}
}