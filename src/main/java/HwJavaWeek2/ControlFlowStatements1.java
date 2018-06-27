package HwJavaWeek2;

public class ControlFlowStatements1 {

	public static void main(String[] args) {


		int number1=120;
		int number2=23;
		int number3=45;
		int i=11;
		//else if

		if(number1>number2) {

			System.out.println("Number1 is greater");

		}
		else if(number2>number1) {

			System.out.println("Num2 is greater");

		}

		else {
			System.out.println("Both are equal");
		}

		//Nested if

		if(i>10) 
		{
			if(number1>number2) System.out.println("firstcondn");

			if(number2>number3) System.out.println("secondcondn");

			if(number3>number2) System.out.println("thirdcondn");
		}

		else System.out.println("icondn");



		//if elseif ladder

		if(number1>number2)
			System.out.println("if executed in if elseif ladder");
		else if(number2>number2)
			System.out.println("first elseif executed in if elseif ladder");
		else if(number3>number2)
			System.out.println("second elseif executed in if elseif ladder");
		else System.out.println("else executed in if elseif ladder");


		for(int a=1;a<=7;a++)
			switch(a)
			{
			case 1:
				System.out.println("case1");
				break;
			case 2:
				System.out.println("case2");
				break;
			case 3:
				System.out.println("case3");
				break;
			case 4:
				System.out.println("case4");
				break;
			case 5:
				System.out.println("case5");
				break;
			case 6:
				System.out.println("case6");
				break;

			case 7:
				System.out.println("case7");
				
				
			default:
				System.out.println("default");

			}

	}

}
