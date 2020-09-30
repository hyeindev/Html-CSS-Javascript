package test0930;

public class ThrowsTest {
	
	public static String[] strArr = new String[2];

	
	public static void throw1() throws Exception{
		strArr[4] = "Throw Test";
	}
	
	public static void throw2() throws Exception{
		throw1();
	}
	
	public static void main(String[] args) {
		try {
		throw2();
	
		}catch(Exception e) {
			int leng = strArr.length;
			strArr[leng-1] = "Throw Test";
			System.out.println(strArr[leng-1]);
		}
		
		}

}
