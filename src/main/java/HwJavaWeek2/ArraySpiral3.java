package HwJavaWeek2;

public class ArraySpiral3 {

	public static void main(String[] args) {
		
		int a[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int length = a.length;
		System.out.println(length);

		for (int j=0;j<length;j++)
			System.out.print(a[0][j]);

		for (int i=1;i<length-1;i++)
			System.out.print(a[i][3]);

		for(int j=3;j>length-4;j--)
			System.out.print(a[3][j]);

		for(int i=3;i>length-4;i--)
			System.out.print(a[i][0]);

		for(int j=1;j<=length-2;j++)
			System.out.print(a[1][j]);

		for (int j=2;j>=length-3;j--)
			System.out.print(a[2][j]);
	}

}
