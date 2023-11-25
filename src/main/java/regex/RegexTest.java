package regex;

import java.util.regex.Pattern;

public class RegexTest {

	public static void main(String[] args) {
		String myContent = "My Name is Karthik";
		String myContent2 = "My Name is Kirdhik";
		Pattern myPattern = Pattern.compile("k.r.h.k", Pattern.CASE_INSENSITIVE);
		System.out.println(myPattern.matcher(myContent).find());
		System.out.println(myPattern.matcher(myContent2).find());
		System.out.println(myContent.replaceAll("Kar", "Kir"));
		System.err.println("Error");
	}

}
