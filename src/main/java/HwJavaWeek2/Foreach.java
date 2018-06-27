package HwJavaWeek2;

public class Foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names={"abi","hari","suresh","ganesh","30"};


		for (String eachname:names)
		{
			System.out.println(eachname);
		}

		System.out.println("==================");
		String name= "ganesh";

		System.out.println(name.length());
		System.out.println(name.charAt(1));
		System.out.println(name.substring(0, 3));
		System.out.println(name.compareTo("suresh"));  //compares g and s-first letter
		System.out.println(name.concat(" babu"));
	}

}

