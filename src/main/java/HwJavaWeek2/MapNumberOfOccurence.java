package HwJavaWeek2;

import org.apache.commons.collections4.map.HashedMap;

public class MapNumberOfOccurence {

	public static void main(String[] args) {

		String str="babu";
		char[] charArray = str.toCharArray();
		System.out.println(charArray);

		HashedMap<Character, Integer> map=new HashedMap<>();

		for (char ch : str.toCharArray()) {

			if(map.containsKey(ch)) {
				int val=map.get(ch);
				map.put(ch, val+1);

			}

			else 
				map.put(ch, 1);
		}
		System.out.println(map);
		
		map.remove('u');
		System.out.println(map);
		System.out.println(map.entrySet());
		System.out.println(map.size());
	}


}
