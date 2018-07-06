package learnjava;

public class DuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,2,1,1,2,1,2};
		System.out.println(arr.length);
		
		
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			count=0;
			for (int j = i+1; j < arr.length; j++) {
			
				if(arr[i]==arr[j])
					count++;
				
				
			}
			if (count==1)
			System.out.println(arr[i]);
		}
			
	}
}

