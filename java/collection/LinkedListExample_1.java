package java_1;

import java.util.LinkedList;

public class LinkedListExample_1 {
	public static void main(String[] args) {
		
		// LinkedList 의 추가,삽입
		LinkedList<Integer> link = new LinkedList<Integer>();
		
		link.addFirst(0);
		link.add(1);
		link.add(2);
		link.addLast(3);
		link.add(4,4);
		
		link.add(2,22);	// 2가 저장된 2번인덱스에 22를 저장
		
		for(int i : link) {
			System.out.println(i);
		}
	
		// 결과 : 0,1,22,2,3,4,
		// 삽입할 노드를 생성하고 위치시킬 인덱스의 이전 노드의 다음노드정보와 다음 노드의 이전노드정보를 수정함.
		
		
	}

}
