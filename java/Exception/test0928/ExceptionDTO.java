package test0928;

public class ExceptionDTO {
	
	private int a;
	private int b;
	
	public int getA() {
		return a;
	}
	public void setA(String str) throws CharException, PeriodException, SpacingException{
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!((int)ch>=48 && (int)ch<=57)) {
				if (ch == '.') {
					throw new PeriodException();
				}

				if (ch == ' ') {
					throw new SpacingException();
				}
				
				throw new CharException(str);
			}

		}
		
		this.a = Integer.parseInt(str);
	}
	public int getB() {
		return b;
	}
	public void setB(String str) throws CharException, PeriodException, SpacingException{
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!((int)ch>=48 && (int)ch<=57)) {
				throw new CharException(str);
			}
			
			if (ch == '.') {
				throw new PeriodException();
			}
			if (ch == ' ') {
				throw new SpacingException();
			}
		}
		this.b = Integer.parseInt(str);
	}
	

	

}
