package java_1;

import java.util.ArrayList;

public class ArrayListExample_4 {
	public static void main(String[] args) {
		
		//ArrayList 의 데이터 삭제
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// 0~3 의 값을 가진 4개의 인덱스 순차 생성
		for (int i = 0; i < 4; i++) {
			list.add(i);
			System.out.print(list.get(i) + ",");
		}
		/* 결과 : 0,1,2,3, */
		
		System.out.println("list.size() : " + list.size());
		
		list.remove(2);	//2번째 인덱스 삭제
		
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ",");
		}
		/* 결과 : 0,1,3 */
		System.out.println("변경된 list.size() : " + list.size());
	
		// list의 크기가 4 -> 3 변경되었다
		// ArrayList 는 데이터 삭제 시 해당 인덱스를 삭제 후 뒤의 인덱스들을 이동시킴
		
	}

}
