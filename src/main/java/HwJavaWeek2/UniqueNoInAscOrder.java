package HwJavaWeek2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UniqueNoInAscOrder {

	public static void main(String[] args) {

		System.out.println("Enter the number:");
		Scanner scan=new Scanner(System.in);
		int input = scan.nextInt();
		System.out.println(input);
		scan.close();

		//int input=186553;
		int dummyInput=input;

		Set<Integer> set=new LinkedHashSet<Integer>();
		//adding each digit in a set to remove duplicates
		while(dummyInput!=0)
		{
			set.add(dummyInput%10);  //set will not add duplicates
			
			dummyInput=dummyInput/10;
			System.out.println(dummyInput);
		}

		
		//copy items of set to list
		List<Integer> list =new ArrayList<Integer>();
		list.addAll(set);

		//sorting as asc order
		Collections.sort(list);


		System.out.println(list);		//prints [1, 3, 5, 6, 8]
		System.out.println(list.size());  //print 5
		String output="";

		int i=0;
		//getting items and concat in string
		while(i<list.size())
		{
			output=output+list.get(i);
			i++;
		}

		System.out.println(output);		//print 013568

	}
}

/*//to convert int to string
	int a = 1234;
    int b = -1234;
    String str1 = Integer.toString(a);
    String str2 = Integer.toString(b);
    System.out.println("String str1 = " + str1); 
    System.out.println("String str2 = " + str2);*/