package HwJavaWeek2;

/*public class Audi extends Car{

	public void Audi() {
		System.out.println("Audi");
	}

	public static void main(String[] args) {


		Audi aud=new Audi();
		aud.Audi();
		aud.Car();
		aud.Vehicle();

	}

}*/

public class Audi extends Car{
	public Audi() {
		System.out.println("Inside Audi class's default constructor");
	}
	
	public static void main(String[] args) {
		new Audi();
		//Audi aud=new Audi();
		
		
	}
}