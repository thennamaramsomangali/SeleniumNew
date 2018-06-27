package java50;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class MostRepeatedWordsInTextFile {

	public static void main(String[] args) throws IOException {
		
		FileReader fileReader = new FileReader("C:\\Users\\Ganeshbabu TS\\Desktop\\a\\write.txt"); //to read file
		BufferedReader br=new BufferedReader(fileReader); //to read line

		HashMap<String, Integer> map=new HashMap<>();
		//List<Integer> list3=new ArrayList<>();  //line with max word count from the given file.

		int count=0;int max;int max1=0;int count1 = 0;
		String currentLine = br.readLine();
	

		while(currentLine!=null) {

			String[] words=currentLine.split(" ");
			
			count++;
			max = words.length;
			//count part--line with max word count from the given file.
			if(max>max1) {
				max1=max;
				count1=count;
			}

			currentLine = br.readLine();

			for (String  each: words) {

				if(map.containsKey(each)) {
					int val=map.get(each);
					map.put(each, val+1);
				}

				else
					map.put(each, 1);
			}
		}

		System.out.println(map);

		List<Integer> list1=new ArrayList<>(map.values()); // values() method


		Collections.sort(list1);


		for (Entry<String, Integer> each : map.entrySet()) {

			if(each.getValue().equals(list1.get(list1.size()-1))) {
				String mostRepeated = each.getKey();
				System.out.println("mostrepeated word is "+mostRepeated);
			}
		}

		System.out.println("line has max words is " +count1);

		//System.out.println(map);


	}

}
