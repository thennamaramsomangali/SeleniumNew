package HwJavaWeek2;

public class HigherSequenceNumber {

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
				//int []arr={10,9,8,-7,6,5,-2,1};  
				int arr[]={10,9,8,-7,6,5,4,2,-3,-2,1}; 
				System.out.println(arr.length);
				
				int maxSequenceStartIndex = 0;
		        int maxSequenceLength = 0;
		        int currentSequenceStartIndex = 0;
		        int currentSequenceLength = 0;
		        for (int i = 0; i < arr.length; i++) {
		        	System.out.println(arr[i]);
		            if(arr[i] < 0) {
		                if(currentSequenceLength > maxSequenceLength) {
		                    maxSequenceLength = currentSequenceLength;
		                    maxSequenceStartIndex = currentSequenceStartIndex;
		                }
		                currentSequenceStartIndex = i + 1;  //1 in 4th iteration
		                currentSequenceLength = 0;
		            }
		            else {
		                currentSequenceLength++; //1 in first iteration
		            }
		        }
		       System.out.println("==================");
		        System.out.println(currentSequenceLength);
		        System.out.println(currentSequenceStartIndex);
		        System.out.println(maxSequenceLength);
		        System.out.println(maxSequenceStartIndex);
		        
		        if(currentSequenceLength > maxSequenceLength) {
		            maxSequenceStartIndex = currentSequenceStartIndex;
		            maxSequenceLength = currentSequenceLength;
		        }
		        
		        
				for(int i=maxSequenceStartIndex;i<maxSequenceStartIndex+maxSequenceLength;i++) {  //first iteration 4<8
					System.out.print(arr[i] + " ");
				}
				System.out.println();
				System.out.println("Length is "+maxSequenceLength);

	}

}
