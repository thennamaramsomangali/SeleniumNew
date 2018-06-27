package HwJavaWeek2;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SortHashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		
		hm.put(21, "twenty one");
		hm.put(41, "forty one");
		hm.put(31, "thirty one");
		hm.put(21, "thirty one");
		hm.put(51," ");
		System.out.println(hm);
		
		Set<Entry<Integer, String>> set1 = hm.entrySet();
		
		/*System.out.println("==========");
		System.out.println(set1);*/
		
		for (Entry<Integer, String> each1 : set1) {
			System.out.println(each1.getKey()+" "+each1.getValue());
			
		}
		TreeMap<Integer, String> tm=new TreeMap<>(hm);
		System.out.println(tm);
		
		Set<Entry<Integer, String>> set2 = tm.entrySet();
		for (Entry<Integer, String> each2 : set2) {
			System.out.println(each2.getKey()+" "+each2.getValue());
			
		}
	}

}
