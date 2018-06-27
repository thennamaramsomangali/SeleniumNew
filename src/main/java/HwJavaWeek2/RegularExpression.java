package HwJavaWeek2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		
		String str="bala.pn@tcs.com";
		//String p="\\w{2,}\\W{1}\\w{1,}\\W{1}\\w{2,}\\W{1}\\w{2,5}";
		
		String p1="[a-zA-Z0-9_.]{2,50}@[a-zA-Z]{2,5}.[a-zA-Z]{2,3}";
		
		Pattern pat=Pattern.compile(p1);
		System.out.println(pat);
		System.out.println(p1);
		Matcher m = pat.matcher(str);
		System.out.println(m);
		System.out.println(m.matches());
		
	}

}

