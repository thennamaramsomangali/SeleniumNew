package java50;

public class Print1_10_noLoops {


	public void print1_10(int start) {

		if(start<=10) {
			System.out.println(start);
			print1_10(start+1);
		}
	}

	public static void main(String[] args) {

		Print1_10_noLoops obj=new Print1_10_noLoops();
		obj.print1_10(1);

	}

}
