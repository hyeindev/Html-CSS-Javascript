package test0928;

public class CharException extends Exception{


	public CharException(String str) {
			
		super("입력하신 " + str + "은 숫자형태가 아닙니다.");
		
	}
	
}
