package java50;

public class Print1_10_noLoops1 {


	public void print(int start) {
		
		if(start<=10) {
			System.out.println(start);
			print(start+1);
		}
		
		
	}
	
	public static void main(String[] agrs) {
		Print1_10_noLoops1 obj=new Print1_10_noLoops1();
		obj.print(1);
	}

}
