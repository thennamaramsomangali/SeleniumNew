package HwJavaWeek2;


public class AccessModifier {

	//public,default,private variable
	public int i=0;
	int j=1;
	private int k=2;
	protected int l=3;
	static int m; 
	
	
	public void add() {                 //public method

		System.out.println("add");
		AccessModifier.m=8;  	//calling static var in non static method
		
	}

	private void sub() {                 //private method

		System.out.println("substract");

	}

	void multiply() {                     //default method

		System.out.println("multiply");

	}


	protected void square () {            //protected method

		System.out.println("square");
		this.i=8;
	}

	public static void divide()         //static method(static is not access modifier)
	{
		System.out.println("divide");
		// this.i=8;  //this should be used in non static method

	}

	public void convert() {   			//non static
		System.out.println("convert");
	}

}


