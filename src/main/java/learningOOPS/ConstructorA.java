package learningOOPS;

public class ConstructorA {
	
	public void ConstructorA() {
		System.out.println("ConstructorA with no args");
		
	}
	
	public void ConstructorA(int i) {
		System.out.println("value of i "+i);
	}

	public static void main(String[] args) {

		ConstructorA obj=new ConstructorA();   //constructor overloading
		obj.ConstructorA();
		obj.ConstructorA(5);
	}
	
}



//no return type of constructor 
