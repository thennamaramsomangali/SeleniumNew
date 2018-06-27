package java50;

public class PrimitivetoWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int-primitive data type ,Integer-wrapper class
		int a=10;
		Integer i = a; //converting int into Integer  //PrimitivetoWrapper
		Integer inp=Integer.valueOf(a); //converting int into Integer
		
		System.out.println(a+" "+i+" "+inp);
		
		Integer in=new Integer(3);  
		
		int aa1 = in;	//wrapper to primitive
		System.out.println(in+" "+aa1);
		
		
		int a1=2;
		Integer aa=Integer.valueOf(a1);
		Integer aaa=a1;
		
		System.out.println(a1+" "+aa+" "+aaa);
		
		
		Integer b=new Integer(3);
		int bb=b;
		System.out.println(b+" "+bb);
	}
	
}
