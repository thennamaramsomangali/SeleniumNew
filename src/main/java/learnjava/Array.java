package learnjava;

public class Array {

	public static void main(String[] args) {
		

		int[] oned= {1,2,3};
		System.out.println(oned.length);//3
		for (int i=0;i<3;i++) {
			System.out.print(oned[i]);
		}
		System.out.println();

		char[][] twod= {{'a','b','c'},{'d','e','f'}};
		System.out.println(twod.length);//2
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(twod[i][j]+" ");
			}
			System.out.println();
		}

		String[][] strarr={{"a","b","c"},{"d","e","f"}};
		System.out.println(strarr.length);//2
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(strarr[i][j]+" ");
			}
			System.out.println();
		}
		int[][] twoDArray= {{1,2,2,2,3},{3,4,5,6,7},{3,4,5,6,7}};   // tow dimensional array
		System.out.println(twoDArray.length);//3
		for (int i=0;i<3;i++) {                    

			for(int j=0;j<5;j++) {
				System.out.print(twoDArray[i][j]+ " ");  //printing in MATRIX format
			}
			System.out.println();
		}


		int[] a=new int[5]; //array size should be given if in this way of array declaration

		System.out.println(a.length); //5

		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);	
		}

		System.out.println();

		int[][] arr=new int[3][3];//3 row and 3 column 

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
				System.out.print(arr[i][j]+" ");

			}
			System.out.println();
		}

		//creating two matrices  
		int a1[][]={{1,3,4},{3,4,5}};  
		System.out.println(a1.length);//2
		int b[][]={{1,3,4},{3,4,5}}; 
		System.out.println(b.length);//2

		//creating another matrix to store the sum of two matrices  
		int c[][]=new int[2][3];  
		System.out.println(c.length);//2

		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 3; j++) {
				c[i][j]=a1[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}


}
