package learnjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.apache.commons.collections4.Get;

public class UniqueNoInAscOrder {

	public static void main(String[] args) {

		System.out.println("Enter the number:");
		Scanner scan=new Scanner(System.in);
		int input = scan.nextInt();
		System.out.println(input);
		scan.close();

		int temp=input;String output="";
		Set<Integer> set=new LinkedHashSet<Integer>();

		while(temp!=0)
		{
			set.add(temp%10);

			temp=temp/10;

		}

		List<Integer> list=new ArrayList<Integer>();
		list.addAll(set);

		Collections.sort(list);

		int i=0;
		while(i<list.size()) {

			output=output+list.get(i);
			i++;

		}

		System.out.println(output);


	}
}