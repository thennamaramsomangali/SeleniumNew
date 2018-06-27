package learnjava;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SortHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm=new HashMap<Integer,String>();
		hm.put(3, "4");
		hm.put(2, "3");
		hm.put(4,"1");
		hm.put(5, " ");
		System.out.println(hm);
		
		Set<Entry<Integer, String>> set1=hm.entrySet();
		
		for (Entry<Integer, String> each1 : set1) {
			System.out.println(each1.getKey()+" "+each1.getValue());
			
		}
		
		TreeMap<Integer, String> tm=new TreeMap<Integer,String>(hm);
		System.out.println(tm);
		
		Set<Entry<Integer,String>> set2=tm.entrySet();
		
		for (Entry<Integer, String> each2 : set2) {
			System.out.println(each2.getKey()+" "+each2.getValue());
			
		}
		
	}


}

