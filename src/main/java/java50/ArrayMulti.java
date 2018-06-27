package java50;

public class ArrayMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int[][] arr=new int[3][3];//3 row and 3 column 

		arr[0][0]=1;  
		arr[0][1]=2;  
		arr[0][2]=3;  
		arr[1][0]=4;  
		arr[1][1]=5;  
		arr[1][2]=6;  
		arr[2][0]=7;  
		arr[2][1]=8;  
		arr[2][2]=9; 

		System.out.println(arr.length); //3

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j<arr.length; j++) {
				System.out.print(arr[i][j]);

			}
			System.out.println();
		}*/


		/*int[][] arr= {{1,2},{4,5}};

		System.out.println(arr.length);


		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}*/

		
		/*int arr[]= {1,2};
		System.out.println(arr.length);
		Class<? extends int[]> c = arr.getClass();  
		String name=c.getName();  
		  
		System.out.println(name);  //class of array
*/		
		//creating two matrices  
		int a[][]={{1,3,4},{3,4,5}};  
		System.out.println(a.length);
		int b[][]={{1,3,4},{3,4,5}}; 
		System.out.println(b.length);
		  
		//creating another matrix to store the sum of two matrices  
		int c[][]=new int[2][3];  
		System.out.println(c.length);
		
		for (int i = 0; i < 2; i++) {
			
			for (int j = 0; j < 3; j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
