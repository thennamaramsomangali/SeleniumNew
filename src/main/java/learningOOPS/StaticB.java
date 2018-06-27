package learningOOPS;

public class StaticB {


	public static int i;
	public static void show() {

		System.out.println(i);
		System.out.println("Hi");

	}
	public static void main(String[] args) {
		StaticB obj=new StaticB();
		obj.i=8;  //OK
		StaticB.show();
		StaticB.i=7; //OK
		StaticB.show(); //OK

	}

}
