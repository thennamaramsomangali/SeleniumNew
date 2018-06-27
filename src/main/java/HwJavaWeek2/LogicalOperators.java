package HwJavaWeek2;

public class LogicalOperators {

	public static void main(String[] args) {

		int mark1=10;
		int mark2=20;
		
		boolean flag=false;

		if(flag)                           
			System.out.println("positivecase");

		if(!flag) 
			System.out.println("negativecase");   //if flag=true, if condn block ll execute.

		if(mark1==10 && mark2++==20)                //AND logic  //in post increment while printing value will be updated
											//but condition check happens with existing values here 20
		{ 
			System.out.println("and operator and post inc");
			System.out.println(mark2);	    
		}  



		if(mark1==10 && ++mark2==22)  //in pre increment value updated and condition checked and printed
		{
			System.out.println("and operator and pre inc");
			System.out.println(mark2);
		}

		if(mark1==10 || --mark2==21)    //OR operator note:if first condition satisfies, wont check second condn

		{
			System.out.println("or operator and pre dec");
			System.out.println(mark2);
		}

		if(mark1==10 && --mark2==21)
		{
			System.out.println("or operator and pre dec");
			System.out.println(mark2);
		}
	}
}