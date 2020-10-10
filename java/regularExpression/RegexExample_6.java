import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample_6 {
	public static void main(String[] args) {
		//단어의 경계 \b 예시
				String str = "The captain wore this cap and cape proudly as\r\n" + 
						"he sat listening to the recap of how his\r\n" + 
						"crew saved the man from capsized vessel.";
				String regexVal = "\\bcap\\w+";
			
				Pattern pattern = Pattern.compile(regexVal);
				Matcher matcher = pattern.matcher(str);
				while(matcher.find()) {
					System.out.print(matcher.group());
				}
	}
}
