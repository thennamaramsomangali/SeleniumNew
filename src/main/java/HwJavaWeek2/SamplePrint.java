package HwJavaWeek2;

public class SamplePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=576;
		int outputvalue=0;
		 
		
		while (i != 0)
		{		
		int remain=i%10;
		System.out.println("remainder"+remain);
		int coeff=i/10;
		System.out.println("coefficient"+coeff);
		i=coeff;
		outputvalue=outputvalue+remain;
		System.out.println(outputvalue);
		}
		System.out.println(outputvalue);
		
		
		
		
	}
	}

