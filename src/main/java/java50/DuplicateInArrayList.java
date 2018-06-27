package java50;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicateInArrayList {

	public static void main(String[] args) {

		
	
        List<Integer> list=new ArrayList<>();		
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        System.out.println(list.size());
        
              
       Set<Integer> set=new LinkedHashSet<>();
       
       set.addAll(list); 
       
       System.out.println(set.size());
       
       list.addAll(set); 
       
       System.out.println(list.size());
               
	}

}
