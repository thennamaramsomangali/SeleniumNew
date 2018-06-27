package HwJavaWeek2;

public class Strings {


	public static void main(String[] args) {

		String[] tamilMovement= {"may17","semmai","pnanbargal"}; //1d array
		//String[][] tamilMovement={{"may17"},{"semmai"},{"pnanbargal"}}; //2d array
		System.out.println(tamilMovement.length);  //Cannot invoke length() on the array type String[]
		//String class in for each loop

		for(String eachtamilMovement:tamilMovement) {  //string is a class act as data type

			System.out.println(eachtamilMovement.length()); //length method
		}


		//String class object creation

		String name1="revolution"; //single string


		System.out.println(name1.length());  //invoking length() method for single string
		
		System.out.println(name1.equals("ganesh")); //compare ganesh with revolution

		System.out.println(name1.indexOf("x"));  // gives index of string.if letter not there returns -1
		
		System.out.println(name1.charAt(0));  //invoking charAt method.

        System.out.println(name1.substring(1)); //invoking substring method.
      
        System.out.println(name1.compareTo("ion")); //lexicograph r followed i positive int.//compares r and i-first letter
        
        System.out.println(name1.compareTo("ton")); //lexicograph r precedes t negative int.//compare r and t-first letter
        
        System.out.println(name1.concat("new")); //invoke concat method.
    }

}
