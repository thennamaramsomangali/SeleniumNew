package HwJavaWeek2;

public class StringLowerToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="g u";int temp=0;char opt=' ';
		
		
		for(int i=0;i<str.length();i++) {
			int each=(int) str.charAt(i);
			temp=0;
			opt=' ';
			if(each>='a' && each<='z') {
			temp=each-32;
			opt=(char) temp;
			}
			System.out.print(opt);
		}
		/*
		String str="GANESH BABU";int temp=0;char opt=' ';
		
		
		for(int i=0;i<str.length();i++) {
			int each=(int) str.charAt(i);
			temp=0;
			opt=' ';
			if(each>='A' && each<='Z') {
			temp=each+32;
			opt=(char) temp;
			}
			System.out.print(opt);
			
		}*/

	}

}
