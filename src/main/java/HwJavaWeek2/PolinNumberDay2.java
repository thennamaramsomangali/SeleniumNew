package HwJavaWeek2;

import java.util.Scanner;

public class PolinNumberDay2 {

	public static void main(String[] args) {
		

		//Palindrome Number
		
		System.out.println("Enter the number for Palindrome:");
		Scanner scan=new Scanner(System.in);
		int numb=scan.nextInt();
		scan.close();
		int rem,sum=0,origNumb;  //as we are using concat sum to be initialised 
		origNumb=numb;    
		while(numb>0)
		{    
			rem=numb%10; 
			sum=(sum*10)+rem;   
			System.out.println(sum);
			numb=numb/10;    
		}    
		if(origNumb==sum)    
			System.out.println(origNumb +" is a Palindrome Number.");    
		else    
			System.out.println(origNumb +" is a Not Palindrome.");  
		
	}

}
