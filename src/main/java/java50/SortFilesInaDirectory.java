package java50;

import java.io.File;
import java.util.Arrays;

public class SortFilesInaDirectory {

	public static void main(String[] args) {
		
		
		File dir = new File("C:/Program Files/Java/jdk1.8.0");

	      File[] files = dir.listFiles();

	      Arrays.sort(files, (f1, f2) -> f1.compareTo(f2));

	      for (File file : files) {
	         if (!file.isHidden()) {
	            if (file.isDirectory()) {
	               System.out.println("DIR \t" + file.getName());
	            } else {
	               System.out.println("FILE\t" + file.getName());
	            }
	         }
	      }
	}

}
