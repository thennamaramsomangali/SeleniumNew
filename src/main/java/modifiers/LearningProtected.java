package modifiers;

import HwJavaWeek2.AccessModifier;

public class LearningProtected  extends AccessModifier {   


	public static void main(String[] args) {

		LearningProtected objBase= new LearningProtected();

		objBase.square(); //calling protected from outside of package(allows only for subclass)
		
		AccessModifier objParent= new AccessModifier();

        // not possible calling protected method using parent class object (objParent.square())
	}
}