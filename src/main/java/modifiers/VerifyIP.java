package modifiers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerifyIP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("100.230.450.102 is valid? "+VerifyIP.isValidIP("100.230.450.102"));
		System.out.println("10.2a.56.32 is valid? "+VerifyIP.isValidIP("10.2a.56.32"));
		System.out.println("10.23.45 is valid? "+VerifyIP.isValidIP("10.23.45"));
	}

	public static boolean isValidIP(String ipAddr){

		Pattern ptn = Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
		Matcher mtch = ptn.matcher(ipAddr);
		return mtch.find();
	}
}
