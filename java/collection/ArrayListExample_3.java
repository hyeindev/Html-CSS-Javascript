package java_1;

import java.util.ArrayList;

public class ArrayListExample_3 {
	public static void main(String[] args) {

		//ArrayList 의 데이터 삽입
		
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(0);
		list.add(1, 1);
		list.add(2);
		list.add(3, 3);
		for (int i = 0; i < list.size(); i++) {

			System.out.print(list.get(i) + ",");
		}
		
			System.out.println("list.size() : " + list.size());
		/*
		 * 		결과 : 0,1,2,3, 
		 * 		인덱스를 정하지 않고 add 시 순차적으로 마지막의 다음 인덱스에 저장됨
		 */
		
		
		list.add(2, 10); // 원래 2가 저장된 노드의 값을 10으로 수정
		
	
		//리스트 재출력
		for (int i = 0; i < list.size(); i++) {

			System.out.print(list.get(i) + ",");
		}
		
		/*
		 * 		결과 : 0,1,10,2,3, 
		 * 		기존의 노드가 한칸씩 뒤로 이동했음을 확인
		 */
		
			System.out.println("변경된 list.size() : " + list.size());
			
			// list.size() 도 4 -> 5로 변경되었다.
			// ArrayList 는 데이터 삽입/삭제시 인덱스를 삽입 후 기존의 노드들을 이동시키는 작업을 한다
	}

}
