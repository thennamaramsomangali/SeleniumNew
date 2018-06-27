package HwJavaWeek2;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int a=20;
		if (a>90)
			System.out.println("A-grade");
		else if (a>70 && a<90)
			System.out.println("B-Grade");
		else 
			System.out.println("C-Grade");*/
		
		
		
		for (int a=100;a>=70;a=a-10)
		switch (a)	//switch (a) goes to case a
		
		{
		
		case 100:
		System.out.println("A-grade");
		break;
		
		case 90:
		System.out.println("B-grade");
		break;
		
		case 70:
		System.out.println("B-grade");
		break;
		
		default:
		System.out.println("Done");
		} 
		

	}

}
