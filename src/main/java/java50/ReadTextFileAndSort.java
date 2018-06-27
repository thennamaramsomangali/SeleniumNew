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

public class ReadTextFileAndSort {

	public static void main(String[] args) throws IOException {
		
		File myFile=new File("C:\\Users\\Ganeshbabu TS\\Desktop\\a\\write1.txt");
		FileReader fr=new FileReader(myFile);   //to read file
		BufferedReader br =new BufferedReader(fr); //to read line
		//String str=null;
		
		List<String> list=new ArrayList<>();
		String readLine = br.readLine();
		while(readLine!=null)
		{
		list.add(readLine);
		readLine = br.readLine();
		 
		}
		
		br.close();
		
		for (String each : list) {
			
			System.out.println("Read: "+each);
		}
		
		//Collections.sort(list);
		
				
		FileWriter fw =new FileWriter("C:\\Users\\Ganeshbabu TS\\Desktop\\a\\write1.txt");
		
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("suresh");
		
		//bw.flush();
		
		
		for (String each : list) {
			
			System.out.println("Write: "+each);
		}
		bw.close();
	}

}
