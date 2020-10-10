package regexTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample_5 {

	public static void main(String[] args) {

		//Possessive 방식이 일치하는 경우의 예시 
		String str = ",%%interational#@";
		String regex = "[\\w]*+";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher mat = pattern.matcher(str);
		while(mat.find()) {
			System.out.println(mat.group());
		}
		
		
		//Possessive 방식이 일치하지 않는 경우의 예시
		String str2 = "internation";
		String regex2 = "i[.*+]n";
		
		Pattern pattern2 = Pattern.compile(regex2);
		Matcher mat2 = pattern2.matcher(str2);
		while(mat2.find()) {
			System.out.println(mat2.group());
		}
	}
}
