package learningOOPS;

public class ConstructorReturnType {

	public ConstructorReturnType() {  ////constructor overloading not returns value
		System.out.println("empty of polyA");
	}
	
	public ConstructorReturnType(int i) {
		System.out.println("value of i "+i);
	}

	public static void main(String[] args) {

		ConstructorReturnType obj=new ConstructorReturnType(6);   
	}
}
