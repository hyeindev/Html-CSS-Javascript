package java_1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap<String, String> hmap = new HashMap<String, String>();

		hmap.put("dog", "강아지");
		hmap.put("cat", "고양이");
		hmap.put("dinosaor", "공룡");

		// get메서드를 이용한 map의 value 값 출력

		System.out.println(hmap.get("dog"));
		System.out.println(hmap.get("cat"));
		System.out.println(hmap.get("dinosaor"));

		// 향상된 for 문을 이용한 map의 매핑값 전체 출력
		iteratorUsingForEach(hmap);

		// Iterator 인터페이스를 이용한 map의 매핑값 전체 출력
		iteratorUsingIterator(hmap);

	}

	static void iteratorUsingForEach(HashMap hmap) {

		Set<Map.Entry<String, String>> entries = hmap.entrySet();

		for (Map.Entry<String, String> entry : entries) {

			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

	static void iteratorUsingIterator(HashMap hmap) {

		Set<Map.Entry<String, String>> entries = hmap.entrySet();

		Iterator<Map.Entry<String, String>> iter = entries.iterator();

		while (iter.hasNext()) {
			Map.Entry<String, String> entry = iter.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}
}
