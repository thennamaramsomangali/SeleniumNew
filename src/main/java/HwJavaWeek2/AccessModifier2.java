package HwJavaWeek2;

public class AccessModifier2 {


	public static void main(String[] args) {

		AccessModifier obj= new AccessModifier();


		obj.add();   //calling public method within package(from other class)

		System.out.println(obj.i); //accessing public variable within the package.

		//obj.sub(); 				//not able to call private method within the package
		//System.out.println(obj.k); 		//not able to call private variable within the package


		
		obj.multiply();								//calling default method 
		System.out.println(obj.j);					//calling default variable

					
		obj.square();					//calling protected method within package.
		System.out.println(obj.l);	//can not protected variable within package.

		

	}
}