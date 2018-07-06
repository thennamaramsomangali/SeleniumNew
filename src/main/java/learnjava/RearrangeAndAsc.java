package learnjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RearrangeAndAsc {

	public static void main(String[] args) {

	int input=19673;
	int temp=input;
	
	List<Integer> list=new ArrayList<Integer>();
	while(temp!=0)
	{
		list.add(temp%10);

		temp=temp/10;

	}
		
	Collections.sort(list);
	System.out.println(list.size());
	String output="";int i=0;
	while(i<list.size()) {
		output=output+list.get(i);
		i++;
	}
		System.out.println(output);
	
	}

}
