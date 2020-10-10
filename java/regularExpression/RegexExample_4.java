package regexTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample_4 {
	public static void main(String[] args) {
		
		
		//Possessive 방식이 일치하는 경우의 예시
		
		String input = "\"  abc ab     \"";
		String regex = "\" [^\"]*+\"";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		
		boolean regexBool = Pattern.matches(regex, input);
		System.out.println("matches() : " + regexBool);
		
		boolean regexBool2 =false;
		System.out.println(" [ 일치하는 문자  ]");
		while(regexBool2=matcher.find()) {
			System.out.println(regexBool2);
			System.out.println(matcher.group());
		
		}
	}

}
