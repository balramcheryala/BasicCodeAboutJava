package Dummy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {
	private static String pattern = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	private static Pattern mypattern = Pattern.compile(pattern);

	public static void main(String args[]) {

		String valEmail1 = "testemail@domain.com";
		String invalEmail1 = "....@domain.com";
		String invalEmail2 = ".$$%%@domain.com";
		String valEmail2 = "test.email@domain.com";

		System.out.println("Is Email ID1 valid? " + valEmail1 + " " + validateEMailID(valEmail1));
		System.out.println("Is Email ID1 valid? " + invalEmail1 + " " + validateEMailID(invalEmail1));
		System.out.println("Is Email ID1 valid? " + invalEmail2 + " " + validateEMailID(invalEmail2));
		System.out.println("Is Email ID1 valid? " + valEmail2 + " " + validateEMailID(valEmail2));

	}

	public static boolean validateEMailID(String emailID) {
		Matcher mtch = mypattern.matcher(emailID);
		if (mtch.matches()) {
			System.out.println("Valid");
		}
		return false;
	}
}
