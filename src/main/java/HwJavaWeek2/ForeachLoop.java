package HwJavaWeek2;

public class ForeachLoop {

	public static void main(String[] args) {

		String[] names= {"arun","may17","semmai","poovulagu","thika","kanchi","mann","kudil","arappor","nammalvar"};


		for(String eachname:names) {

			System.out.println(eachname);  //print all

			if(eachname.equalsIgnoreCase("arun"))
				System.out.println(eachname +" male");


			if(eachname.equalsIgnoreCase("semmai"))
				System.out.println(eachname +" male");

		}
	}
}
