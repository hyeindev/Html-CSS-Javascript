package regexTest;

import java.util.regex.Pattern;

public class RegexExample_2 {
	public static void main(String[] args) throws Exception {

		/**
		 * 숫자매칭 확인 패턴
		 * 
		 */
		
		// ^ : 문자열의 시작
		// $ : 문자열의 끝
		// ^ ~ $ : 문자의 시작부터 끝까지 
		// [] : 문자열집합의 범위
		
		// 02-0233-4646 을 정규식매칭하기 (과제)
		// String
		
		
	String pattern = "^[0-5]*$"; // 표현식
	String val = "1234532"; // 대상 문자열
	
	//compile메서드는 대상문자열에서 표현식을 반환한다.
	Pattern patternNumber = Pattern.compile(pattern);
	
	//아래 첫번째 매개변수에 pattern 대신 patternNumber 를 대입할 수 있다.
	boolean regex = Pattern.matches(pattern,val);
	
	//val (대상문자열)이 patternNumber (정규표현식) 과 일치하는지 find메서드를 사용하면 t/f 로 반환한다.
	boolean isT = patternNumber.matcher(val).find();
	
	
	System.out.println(isT);
	
	System.out.println(regex);
		

	}

}
