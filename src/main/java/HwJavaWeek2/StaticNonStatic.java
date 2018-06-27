package HwJavaWeek2;



public class StaticNonStatic {

	
	public static String a="Hello";
	public String b="World";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticNonStatic.add();  //add(); is also correct  //calling static fn by class name
		StaticNonStatic obj=new StaticNonStatic();
		obj.sub();		//calling non static fn by obj

	}

	
	public static void add() {
		//StaticNonStatic obj=new StaticNonStatic();
		  //System.out.println(a+obj.b);		
		  System.out.println(a+new StaticNonStatic().b);  ///calling non static variable in static method
	}
	
	public  void sub() {
		
		System.out.println(a+b);		//we can directly call static variable in non static fn
	}
	
	
	/*public static String test1 = "Hello";
	String test2 = "World";
	public static void main(String[] args) {
		 declare 2 String variables (1 static- hello and 1 non static-world.
		 * create two methods 1 static and 1 non static to print both variables.
		 * create a main method to call both the methods.
		 * Expected o/p: Hello World should print twice
		method1();
		StaticNonStatic obj1=new StaticNonStatic();
		obj1.method2();
	}
	public static void method1(){
		StaticNonStatic obj=new StaticNonStatic();
		System.out.println(test1+" "+obj.test2);
	}
	public void method2(){
		System.out.println(test1+" "+test2);

}
*/
}
//static variable/method can be called into non static context
