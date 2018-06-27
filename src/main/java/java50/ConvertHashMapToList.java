package java50;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multiset.Entry;

public class ConvertHashMapToList {

	public static void main(String[] args) {
	
		
		HashMap<Character, String> map=new HashMap<>();
		map.put('a', "apple");
		map.put('b',"ball");
		
		List<String> list1=new ArrayList<>(map.values()); // values() method
		List<Character> list2=new ArrayList<>(map.keySet()); //keySet method
		
		//ArrayList<Entry<String, String>> demoList = new ArrayList<Entry<String,String>>(demoEntrySet);
		
		for (Character each : list2) {
			System.out.println(each);
		}
		
		for (String each : list1) {
			System.out.println(each);
		}

	}

}
