package java50;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

public class ConvertHashMapToList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		HashMap<String, Integer> hm=new HashMap<>();

		hm.put("twenty",1);
		hm.put("forty",2);
		hm.put("thirty",3);

		Set<String> set = hm.keySet();
		List<String> list1 = new ArrayList<>(set);
		for (String each1 : list1) {
			System.out.println(each1);
		}
		
		Collection<Integer> val = hm.values();
		List<Integer> list2 = new ArrayList<>(val);
		for (Integer each2 : list2) {
			System.out.println(each2);
		}

	}

}
