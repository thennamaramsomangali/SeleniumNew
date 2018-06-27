package java50;

public class ArmstrongNo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int in=153,out=0;
		int temp=in;
		
		while(in!=0) {
			
			int r=in%10;
			int q=in/10;
			in=q;
			out=out+(r*r*r);
		}
		
		if (temp==out)
			System.out.println("OK"); //else System.out.println("KO");
	}

}
