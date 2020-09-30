package test0930;

public class CreateExceptionTest {
	public int a(){
		return -1;
	}
	
	public void b() throws LessThanZero {  
			int a=	a();
		if (a<0) {
			throw new LessThanZero(a);
		}
	}
	
	public static void main(String[] args) throws LessThanZero {
		CreateExceptionTest cet = new CreateExceptionTest();
			cet.b();
		
	}

}
