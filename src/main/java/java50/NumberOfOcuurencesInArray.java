package java50;

import java.util.HashMap;
import java.util.Scanner;

public class NumberOfOcuurencesInArray {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		int[] arr=new int[3];
		
		//int[] arr=new int[3,2];
		//int[] arr={3,2};
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		HashMap<Integer, Integer> map=new HashMap<>();
		for (int eachnum : arr) {
			
			System.out.println(eachnum);
			
			if (map.containsKey(eachnum)) {
				Integer val = map.get(eachnum);
				map.put(eachnum, val+1);
			}
			else
				map.put(eachnum, 1);


		}
		scan.close();
		System.out.println(map);
	}

}
