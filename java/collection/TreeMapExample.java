package java_1;

import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		
		
		TreeMap<Integer,String> tmap = new TreeMap<Integer,String>();
		
		tmap.put(3, "사과");
		tmap.put(1, "딸기");
		tmap.put(5, "바나나");
		tmap.put(2, "포도");
		
		System.out.println(tmap.get(5));
		tmap.remove(5);
		//remove로 제거 후 출력
		System.out.println(tmap.get(5));
		
		//TreeMap을 출력시 : {} 로 묶은 key=value 형태로 출력됨 (key오름차순정렬)
		System.out.println(tmap);
		//최소Entry 출력 (key=value 형태)
 		System.out.println(tmap.firstEntry());
		//최소 key 출력  (key 형태)
 		System.out.println(tmap.firstKey());
 		//최대 Entry 출력
 		System.out.println(tmap.lastEntry());
 		//최대 key 출력
 		System.out.println(tmap.lastKey());
 		

	}

}
