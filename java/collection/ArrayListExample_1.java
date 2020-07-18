package java_1;

import java.util.ArrayList;

public class ArrayListExample_1 {
	public static void main(String[] args) {
		
	//array	
		String[] str = new String[2];
		
		str[0]="first";
		str[1]="second";
	//	str[2]="third";		ArrayIndexOutOfBoundsException 발생
		
	
	// ArrayList original-version	
		ArrayList al = new ArrayList();
		
		al.add("first");	//add는 Object 타입으로 매개변수를 받는다. add는 어떤 인자가 올지 알 수 없음
		al.add("second");
		al.add("third");
		
		System.out.println(al.get(2));	//third 출력
		
	}

}
