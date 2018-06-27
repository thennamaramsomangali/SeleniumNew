package java50;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.aventstack.extentreports.utils.Writer;

public class ReadTextFileAndSort1 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = null; 

		BufferedWriter writer = null;

		//Create an ArrayList object to hold the lines of input file

		ArrayList<String> lines = new ArrayList<String>();



		//Creating BufferedReader object to read the input file

		reader = new BufferedReader(new FileReader("C:\\Users\\Ganeshbabu TS\\Desktop\\a\\write1.txt"));

		//Reading all the lines of input file one by one and adding them into ArrayList

		String currentLine = reader.readLine();

		while (currentLine != null) 
		{
			lines.add(currentLine);

			currentLine = reader.readLine();
		}

		reader.close();
		
		//Sorting the ArrayList

		Collections.sort(lines);

		//Creating BufferedWriter object to write into output file

		writer = new BufferedWriter(new FileWriter("C:\\Users\\Ganeshbabu TS\\Desktop\\a\\write1.txt"));

		//Writing sorted lines into output file

		for (String line : lines)
		{
			
			writer.write("abc");
			
			//writer.write(line); 

			writer.newLine();
		}
		
		writer.close();
		
	}

}
