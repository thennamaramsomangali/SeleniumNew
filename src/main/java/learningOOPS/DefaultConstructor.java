package learningOOPS;

public class DefaultConstructor {


	int id;
	String name;

	void display() { 

		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DefaultConstructor obj=new DefaultConstructor();
		obj.display();

	}

}



/*int id;
String name;

DefaultConstructor() {

	System.out.println(id+" "+name);
}

public static void main(String[] args) {
	// TODO Auto-generated method stub

	DefaultConstructor obj=new DefaultConstructor();
	

}

}*/


//The java compiler provides a default constructor if you don't have any constructor.
//A constructor is called "Default Constructor" when it doesn't have any parameter.