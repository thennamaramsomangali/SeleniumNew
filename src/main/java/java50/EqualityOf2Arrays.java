package java50;

public class EqualityOf2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,2,3};
		int[] b= {1,2,4};
		int count=0;

		for (int i = 0; i < a.length; i++) {

			if (a[i]!=b[i])
				count++;
		}
		if(count>0)
			System.out.println("not equals"); else System.out.println("equals");
	}

}
