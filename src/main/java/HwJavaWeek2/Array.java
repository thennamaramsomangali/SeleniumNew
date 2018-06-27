package HwJavaWeek2;

public class Array {

	public static void main(String[] args) {
		
		
		int oneDim[]= {1,2,3};  //1d array
		System.out.println(oneDim.length);
		for(int i=0;i<=2;i++)  
		{
		System.out.print(oneDim[i]);
		}
		System.out.println();
		
		int[][] twoDim= {{1,2,3},{4,5,6}};
		System.out.println(twoDim.length);
		for(int i=0;i<=1;i++) 	
		{		
			for (int j=0;j<=2;j++)
			{
				System.out.print(twoDim[i][j]);
				
			}
			System.out.println();
		}
		
		
		String[][] strarr={{"a","b","c"},{"d","e","f"}}; //2d array
		System.out.println(strarr.length);
		
		for(int i=0;i<=1;i++) 	
		{		
			for (int j=0;j<=2;j++)
			{
				System.out.print(strarr[i][j]);
				
			}
			System.out.println();
		}
		
		char[][] chararr={{'a','b','c'},{'d','e','f'}}; //2d array
		System.out.println(chararr.length);
		
		for(int i=0;i<=1;i++) 	
		{		
			for (int j=0;j<=2;j++)
			{
				System.out.print(chararr[i][j]);
				
			}
			System.out.println();
		}
		//===================================
		
		int twoDArray[][]= {{1,2,2,2,3},{3,4,5,6,7},{3,4,5,6,7}};   // tow dimensional array
		System.out.println(twoDArray.length);
		for (int i=0;i<=1;i++) {                    

			for(int j=0;j<=4;j++) {
				System.out.print(twoDArray[i][j]+ " ");  //printing in MATRIX format
			}
			System.out.println();
			
			
		}

	}

}