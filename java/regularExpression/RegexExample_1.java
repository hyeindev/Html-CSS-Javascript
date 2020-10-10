package regexTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample_1 {
	public static void main(String[] args) {
		
		String str = "aafwewfAA";
		String value = "^[a-z]+[A-Z]+$";
		
		boolean bool = Pattern.matches(value, str);
		
		//compile 은 static 메서드
		Pattern pattern = Pattern.compile(value);
		
		Matcher mat = pattern.matcher(str);
		
		while(mat.find()) {
			System.out.println(mat.group());
		}
		
		System.out.println(bool);
		
	}

}
