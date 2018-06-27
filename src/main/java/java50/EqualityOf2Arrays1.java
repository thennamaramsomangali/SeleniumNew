package java50;

public class EqualityOf2Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1={1,2,3,4,6}; int count=0;

		int[] arr2={1,2,3,4,5};
		
		System.out.println(arr1.length);
		System.out.println(arr2.length);
		
		if(arr1.length==arr2.length)
			System.out.println("length equals"); else System.out.println("length no equals");

		for(int i=0;i<arr1.length;i++)

		{
			if(arr1[i]==arr2[i] )
				count++;
		}

		if(count==arr2.length)
			System.out.println("equals");
		else
			System.out.println("KO");

	}

}
