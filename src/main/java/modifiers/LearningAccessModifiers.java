package modifiers;

import HwJavaWeek2.AccessModifier;

public class LearningAccessModifiers {
	
	
	public static void main(String []args)
	{
		
		AccessModifier objAM= new AccessModifier();
		
		objAM.add();
		
		System.out.println(objAM.i);
		
		// not able to access private and default methods and variable from other package.
		
		AccessModifier.divide();  //calling static method(public) using class name from other package.
		
		//objAM.divide(); shows warning for calling static method as non static way but reverse not possible.
	}

}
