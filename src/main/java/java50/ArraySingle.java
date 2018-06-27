package java50;

public class ArraySingle {

	/*int[] a=new int[5];
		
		System.out.println(a.length);

		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);	
		}

		int[] b= {1,2,3,4,5};

		System.out.println(b.length);

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}*/



	public static void main(String args[]){  

		int a[]={33,3,4,5};  
		min(a);//passing array to method 

	}
	static void min(int arr[]){  
		int min=arr[0];  
		System.out.println(arr.length);
		for(int i=1;i<arr.length;i++)  
			if(min>arr[i])  
				min=arr[i];  

		System.out.println(min);
	}  

}

