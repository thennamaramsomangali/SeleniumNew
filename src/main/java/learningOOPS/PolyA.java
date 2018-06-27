package learningOOPS;

public  class PolyA {
	
	
	public void show() {
		System.out.println("empty of polyA");
	}
	
	public void show(int i) {
		System.out.println("value of i "+i);
	}
	
	final void run() {
		System.out.println("final method");
		
		
	}
	
	final static int n=8;  //final var should be initialized 

	public static void main(String[] args) {

		PolyA obj=new PolyA();   //method overloading //same class
		obj.show();
		obj.show(5);
		//PolyA.n;  //even accessing final is wrong
		System.out.println(n);
	}
	
	
	
}


//final calss can not be inherited and overridden