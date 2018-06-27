package learningOOPS;

public class ClassB implements InterfaceA {
	

	public void show() {
		System.out.println("hello");
	}

	public void display() {
		System.out.println("hi");
	}
	
	public static void main(String[] args) {
		

		ClassB obj=new ClassB();  //both methods can access
		
		obj.show();
		obj.display();
		
		InterfaceA obj1=new ClassB(); //only show
		obj1.show();
		
		
	}

}


//interface helps to use multiple inheritance //provides security