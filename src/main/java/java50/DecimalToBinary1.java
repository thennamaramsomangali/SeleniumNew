package java50;

import java.util.Scanner;

public class DecimalToBinary1 {

	
	public static String convert(int dec,String s) {
		
		
			 String str ="";int remain;String rev="";int bin;
			 
			 if(s.equalsIgnoreCase("1")) {
		      
		      while(dec>0) {
		    	  
		    	   remain = dec%2;
		    	   dec=dec/2;
		    	   
		    	   str=str+remain;
		      }
			 }
			 
			 
			 if(s.equalsIgnoreCase("2")) {
			      
			      while(dec>0) {
			    	  
			    	   remain = dec%8;
			    	   dec=dec/8;
			    	   
			    	   str=str+remain;
			      }
				 }
			 
			 if(s.equalsIgnoreCase("3")) {
				 
			char rem =0;
			      
			      while(dec>0) {
			    	  
			    	   remain = dec%16;
			    	   if(remain>9) {
			    		   remain=remain-9+65-1; //Ascii value of A=65 if remain 10 
			    		   rem=(char) remain;
			    		   str=str+rem;
			    	   }
			    	   if(remain<=9) {
			    	   str=str+remain;
			    	   }
			    	   
			    	   dec=dec/16;
			      }
			      
				 }
			 
			 
			 
		      for (int i =str.length()-1; i>=0; i--) {
				
		    	 rev=rev+str.charAt(i);
			}
			//bin=Integer.parseInt(rev);
			return rev;

			
		}
	     
		
		
	
	
	/*public static int convertDecToBin(int dec){
		
	      String str ="";int remain;String rev="";int bin;
	      
	      while(dec>0) {
	    	  
	    	   remain = dec%2;
	    	   dec=dec/2;
	    	   
	    	   str=str+remain;
	      }
	      
	      for (int i =str.length()-1; i>=0; i--) {
			
	    	 rev=rev+str.charAt(i);
		}
		bin=Integer.parseInt(rev);
		return bin;
		
		
	}*/
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter dec num and press 1 for binary 2 for octal 3 for hexadecimal");
	       System.out.println(convert(sc.nextInt(),sc.next()));
	       
	       
	}

}
