package HwJavaWeek2;

public class CallRBI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI bank=new SBI();
		SBI bank2=new SBI();
		
		//using bank object, we can call all methods of RBI only
		//using bank2 object, we can call all methods of RBI and SBI also
		//SBI have methods of RBI as default
	}

	}




/*
  =========abstract class======
 * class Mobile          //abstract class as it has abstract method frontlight()
 * {
	public void camera() {

	}
	public void backlight() {

	}
	public void frontlight()	//only decleared so called as abstract method
}

if class have min one abstact method it is called as abstract class
cannot create obj for abstacr class



class NewMobile extends Mobile{

}
	//here need to define all methods which is abstract of abstract class
	 now NewMobile class becomes concrete class  
	 
	 class-imaginary
	 obj-has momory.jvm is creating obj
	 
	 static method and static variables are called using class name and not using object name
	 instantiaing meaning creating obj
	 
	 
	 
	 
	 
	 ===============polymorphism-============================
	 
	    
	 
	 
	 */
