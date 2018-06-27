package HwJavaWeek2;


public class AccessModifier {

	//public,default,private variable
	public int i=0;
	int j=1;
	private int k=2;
	protected int l=3;

	public void add() {                 //public method

		System.out.println("add");

	}

	private void sub() {                 //private method

		System.out.println("substract");

	}

	void multiply() {                     //default method

		System.out.println("multiply");

	}


	protected void square () {            //protected method

		System.out.println("square");
	}

	public static void divide()         //static method(static is not access modifier)
	{
		System.out.println("divide");

	}

	static void convert() {   			//default method
		System.out.println("convert");
	}

}
