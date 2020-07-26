package java_1;

import java.util.LinkedList;

public class LinkedListExample_2 {
	public static void main(String[] args) {
		
		//LinkedList 의 삭제
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		for (int i = 0; i < 4; i++) {
			list.add(i);
			System.out.print(list.get(i) + ",");
		}
		
		System.out.println("list.size() : " + list.size()+"\n");
		
		list.remove(3);
		System.out.println(list.get(3));	// 3번 인덱스의 값이 제거됨
		
		// 삭제 할 node 의 다음 node의 이전node 정보를 삭제, 이전 node 의 다음 node정보를 삭제하고 삭제할 node 의 다음 노드 정보를 삽입함
		
	}

}
