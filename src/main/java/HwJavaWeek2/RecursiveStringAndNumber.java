package HwJavaWeek2;

import java.util.Scanner;

public class RecursiveStringAndNumber {

	/*Scanner scan=new Scanner(System.in);
	String str = scan.next();
	int num = scan.nextInt();*/
	
	 String str="bala";
	 int num=1234;
	 
	 String reverse="";
	
	public String  recursive(int i)  //this method should return String //This method must return a result of type String
	{
		reverse=reverse+str.charAt(i);
		System.out.println(reverse);
		System.out.println(i);
		
		if(i>0)
		recursive(--i);
		return reverse;
	}
	public static void main(String[] args) 
	
	{
		RecursiveStringAndNumber obj=new RecursiveStringAndNumber();
		
		System.out.println(obj.str.length());
		String reversedString = obj.recursive(obj.str.length()-1);
		System.out.println(reversedString);
		
		obj.reverse="";
		
		String stringNum = Integer.toString(obj.num);
		
		obj.str = stringNum;  //
		String reversedNum = obj.recursive(stringNum.length()-1);
		System.out.println(reversedNum);
	}

}
