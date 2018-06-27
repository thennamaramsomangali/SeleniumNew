package java50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicateInArrayList1 {

	public static void main(String[] args) {

	List<Integer> l=new ArrayList<>();
	l.add(3);
	l.add(1);
	l.add(1);
	
	System.out.println(l);
	
	Set<Integer> s=new LinkedHashSet<>();
	s.addAll(l);
	System.out.println(s);
	
	l.addAll(s);
	System.out.println(l);
	}

}
