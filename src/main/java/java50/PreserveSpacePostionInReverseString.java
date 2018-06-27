package java50;

public class PreserveSpacePostionInReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="g ba",rev=" "; int j=0,i;

		char[] arr1=new char[str.length()];

		System.out.println(str.length());
		
		for(i=0;i<str.length();i++) {

			arr1[i]=str.charAt(i);  
		}

		for(i=str.length()-1;i>=0;i--) {
			if(arr1[j]==' ') {
				rev=rev+" ";
				//System.out.println(rev);
			}

			if(arr1[j]!=' ' && str.charAt(i)!=' ') {
				rev=rev+str.charAt(i);
				//System.out.println(rev);

			}
			
			if(str.charAt(i)==' ' && arr1[j]!=' ') {
				rev=rev+arr1[j];
				//System.out.println(rev);
			}

			j++;
		}
		System.out.println(rev);
				
				
	}
}