package HwJavaWeek2;

public class Bicycle {


	public void doRide() {
		System.out.println("Ride");
	}

	public void applyBrake() {
		System.out.println("Brake apply");
	}

	public String getColour() {

		return "pink";						//getColour method returns value	
	}

	public String getColour(String whom) {		
		if (whom.equals("y")) 
			return "pink";					
		else 
			return "blue";

	}


}


