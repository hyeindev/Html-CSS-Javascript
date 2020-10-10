package regexTest;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample_3 {
	public static void main(String[] args) throws Exception {

		/*
		 * String str = " dkASdkdkdmkql ";
		 * 
		 * //compile 로 정규식으로부터 패턴을 만들어냄 Pattern pattern =
		 * Pattern.compile("^\s[a-zA-Z]+\s$"); //입력 캐릭터 시퀀스에서 패턴을 찾는 Matcher 객체를 생성
		 * Matcher mat = pattern.matcher(str); System.out.println(mat.matches());
		 * 
		 * boolean boo = Pattern.matches("^\s[a-zA-Z]+\s$", str);
		 * System.out.println(boo);
		 * 
		 * boolean bool = mat.find(); System.out.println(bool);
		 */
		/*
		 * if (mat.find()) { System.out.println(mat.group()); }
		 */

		String str2 = "InteraIandIomnerjwjn";
		Pattern pattern2 = Pattern.compile("I[\\w]+?n");
		Matcher mat2 = pattern2.matcher(str2);

		while(mat2.find()) {
			System.out.println(mat2.group());
		}
	}

}
