package java50;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

import java.util.HashMap;

import java.util.Map.Entry;
import java.util.Set;



public class MostRepeatedWordsInTextFile1 {

	public static void main(String[] args) throws IOException {

		//Creating map which holds words as keys and their occurrences as values
		HashMap<String,Integer> hm=new HashMap<>();


		FileReader fileReader = new FileReader("C:\\Users\\Ganeshbabu TS\\Desktop\\a\\write.txt"); //to read file
		BufferedReader br=new BufferedReader(fileReader); //to read line



		String line=null; 

		//Reading the first line into line
		line = br.readLine();

		while(line!=null) {


			//splitting the currentLine into words
			String[] words = line.split(" ");

			//Iterating each word
			for (String word : words) {
				//if word is already present in wordCountMap, updating its count
				if(hm.containsKey(word)) {

					int val = hm.get(word);
					hm.put(word, val+1);
				}
				//otherwise inserting the word as key and 1 as its value
				else
					hm.put(word, 1);
			}
			//Reading next line into line
			line = br.readLine();
		}

		System.out.println(hm);

		//Getting the most repeated word and its occurrence

		String mostrepeatedword=null;
		int count=0;

		Set<Entry<String, Integer>> entrySet = hm.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if(entry.getValue() > count) {
				mostrepeatedword = entry.getKey();
				count= entry.getValue();

			}
		}

		System.out.println("Most repeated word: "+mostrepeatedword);
		System.out.println("Number of occurences: "+count);



		br.close();

	}


}
