package test0930;

public class LessThanZero extends Exception {

	public LessThanZero(int a) {
		super(a + "는 0 보다 작습니다.");
	}
}
