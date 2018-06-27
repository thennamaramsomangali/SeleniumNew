package java50;

import java.util.ArrayList;
import java.util.List;

public class ReverseEachWord {

	public static void main(String[] args) {
		
		String str="hi am";int k=0;
		
		String rev=" ";
						
		String[] arr=str.split(" ");  //splitting by space into 2 elements(hi-0 and am-1) in string array
		
		for (String each : arr) {
			
			System.out.println(each);
			
			System.out.println(each.length());
			
			for( int i=each.length()-1;i>=0;i--) {
				
				rev=rev+each.charAt(i);
			}
			
			arr[k]=rev;
			rev=" ";
			k++;
			
		}
		
		for (String revStr : arr) {
			
			System.out.println(revStr);
		}
		
	}

}
