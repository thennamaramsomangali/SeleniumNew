package HwJavaWeek2;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SortHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(21, "twenty one");
		hm.put(41, "forty one");
		hm.put(31, "thirty one");
		hm.put(21, "thirty one");
		hm.put(51," ");


		System.out.println(hm);

		Set<Entry<Integer, String>> entries = hm.entrySet();

		System.out.println("Before sort: ");
		for (Entry<Integer, String> eachentry : entries) {
			System.out.println(eachentry.getKey()+" "+eachentry.getValue());
		}
		
		TreeMap<Integer, String> tm=new TreeMap<>(hm);

		System.out.println(tm);
		
		
		Set<Entry<Integer, String>> sorted = tm.entrySet();

		System.out.println("After sort: ");
		for (Entry<Integer, String> eachsorted : sorted) {
			
			System.out.println(eachsorted.getKey()+" "+eachsorted.getValue());
		}

	}


}

