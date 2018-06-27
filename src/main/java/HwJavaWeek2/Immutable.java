package HwJavaWeek2;

public class Immutable {

	/*int num=10;
	static int num1=15;

	public void add() {
		int num2=num+num1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Immutable im=new Immutable();


	}*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String s="Sachin";  
		s.concat(" Tendulkar");//concat() method appends the string at the end  
		System.out.println(s);//will print Sachin because strings are immutable objects  

		String str="Sachin";  
		str=str.concat(" Tendulkar");  
		System.out.println(str); */ 


		/*String s1="Sachin";  
		String s2="Sachin";  
		String s3=new String("Sachin");  
		String s4="Saurav"; 
		String s5="SACHIN";
		System.out.println(s1.equals(s2));//true  
		System.out.println(s1.equals(s3));//true  
		System.out.println(s1.equals(s4));//false 
		System.out.println(s1.equals(s5));//false  
		System.out.println(s1.equalsIgnoreCase(s5));//true  

		String s11="Sachin";  
		String s22="Sachin";  
		String s33=new String("Sachin");  
		System.out.println(s11==s22);//true (because both refer to same instance)  
		System.out.println(s11==s33);//false(because s3 refers to instance created in nonpool)  
		 */

		/*String s1="Sachin";  
		String s2="Sachin";  
		String s3="Ratan";  
		System.out.println(s1.compareTo(s2));//0  
		System.out.println(s1.compareTo(s3));//1(because s1>s3)  
		System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )
*/		
		
		/*String s="SachinTendulkar";  
		System.out.println(s.substring(6));//Tendulkar  
		System.out.println(s.substring(0,6));//Sachin  
		System.out.println(s.substring(0,2));//sa
*/		
		/* String s="Sachin";  
		 System.out.println(s.startsWith("Sa"));//true  
		 System.out.println(s.endsWith("n"));//true   

		 String s="Sachin";  
		 System.out.println(s.toUpperCase());//SACHIN  
		 System.out.println(s.toLowerCase());//sachin  
		 System.out.println(s);//Sachin(no change in original) 
		 
		 String s="  Sachin  ";  
		 System.out.println(s);//  Sachin    
		 System.out.println(s.trim());//Sachin  //trim() method eliminates white spaces before and after string.
		 
		 String s="Sachin";  
		 System.out.println(s.charAt(0));//S  
		 System.out.println(s.charAt(3));//h 
*/		 
		int a=10;  
		String s=String.valueOf(a);  
		System.out.println(s+10); 
		
		String s1="Java is a programming language. Java is a platform. Java is an Island.";    
		String replaceString=s1.replace("Java","Kava");//replaces all occurrences of "Java" to "Kava"    
		System.out.println(replaceString);    
		 
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}