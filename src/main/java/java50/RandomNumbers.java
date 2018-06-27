package java50;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumbers {


	public static int genRandom(int max,int min) {

		Random rand=new Random();

		return rand.nextInt((max-min)+1)+min;  //exclude outer bound so add 1.

	}
	public static void main(String[] args) {


		int int1 = ThreadLocalRandom.current().nextInt(100, 20001);//from java 1.7, exclusive upper bound

		System.out.println(int1);


		//second method

		System.out.println(genRandom(51,50));	


		System.out.println(Math.random());   //double value with in a range 0.0 to 1.0


	}

}
