package java_1;

import java.util.ArrayList;

public class ArrayListExample_2 {
	public static void main(String[] args) {
		//ArrayList new-version	generic
		ArrayList<String> al = new ArrayList<String>();
		
			al.add("frist");
			al.add("second");
			al.add("third");
			
			for (int i = 0; i < al.size(); i++) {
				System.out.println(al.get(i));
			}
	}

}
