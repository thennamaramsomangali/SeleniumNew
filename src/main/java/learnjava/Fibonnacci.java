package learnjava;

public class Fibonnacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0,b=1,c=0,input=5;
		
		while(c<input) {
			c=a+b;
			a=b;
			b=c;
			
		}
		System.out.println(c);
		if(c==input)  System.out.println("OK"); else System.out.println("KO");
			
	}

}
