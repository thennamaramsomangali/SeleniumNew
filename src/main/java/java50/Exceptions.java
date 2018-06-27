package java50;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{  

			//int[] a=new int[5];  //0-4
			//a[5]=6;  //trying to insert in 5th index but have limit from 0-4
			//a[4]=30/0;  //trying to store value of 30/0 in 4th index.so no error in index 
			//System.out.println(a[4]);

			String str=null;  
			System.out.println(str.length());//NullPointerException 
		}  
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception"); }  
		catch(ArrayIndexOutOfBoundsException e) { 
			System.out.println("Index exception"); }  
		catch(Exception e) { 
			System.out.println("common task completed"); }  

		System.out.println("rest of the code...");
	}

}


