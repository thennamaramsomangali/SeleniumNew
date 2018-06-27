package HwJavaWeek2;

import java.util.Scanner;

public class PasswordValidation {

	public static void main(String[] args) {

		String password="Facebookapp11";
		/*System.out.println("Enter the password:");
		Scanner scan=new Scanner(System.in);
		String password = scan.next();   
		System.out.println(password);
		scan.close();*/

		int lower=0;
		int upper=0;
		int special=0;
		int number=0;

		if (password.length()>=10) 
		{

			
			//if (password.matches("[A-Za-z0-9]*")) 
			//if (password.matches[A-Z] && password.matches[a-z] && password.matches[0-9] )
			//boolean OK= (password.matches([A-Z]) && password.matches([a-z]) && password([0-9]));
			//boolean NOTOK= (!password.matches([A-Z]) && !password.matches([a-z]) && !password([0-9]));
			///boolean upperCase= !password.equals(password.toLowerCase());
			///boolean lowerCase= !password.equals(password.toUpperCase());

			for (int i=0;i<password.length();i++) {
				int eachChar = (int) password.charAt(i);

				if (eachChar>='a' && eachChar<='z')
					lower++;

				else if (eachChar>='A' && eachChar<='Z')
					upper++;

				else if (eachChar>='0' && eachChar<='9')
					number++;
				else 
					special++;
			}
			System.out.println(lower);
			System.out.println(upper);
			System.out.println(number);
			System.out.println(special);
		}
		else {
			System.out.println("Password should be of atleast 10 characters.Please enter correct password");
		
		}
		
		if(lower>=1 && upper>=1 && number==0 && special==0) 
			System.out.println("Password is correct");
			else 
				System.out.println("Password is not correct");
			
		}
	}



