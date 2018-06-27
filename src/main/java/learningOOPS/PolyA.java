package learningOOPS;

public class PolyA {
	
	public void show() {
		System.out.println("empty of polyA");
	}
	
	public void show(int i) {
		System.out.println("value of i "+i);
	}

	public static void main(String[] args) {

		PolyA obj=new PolyA();   //method overloading //same class
		obj.show();
		obj.show(5);
	}
	
}


