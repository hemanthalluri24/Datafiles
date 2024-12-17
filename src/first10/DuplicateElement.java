package first10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElement {
	public static void main(String[] args) {
		
//		//1st Method
//		
//		String[] elements = { "Java", "Python", "C", "JS", "Java" };
//		for (int i = 0; i < elements.length; i++) {
//			for (int j = i + 1; j < elements.length; j++) {
//				if (elements[i].equals(elements[j])) {
//					System.out.println("Duplicate Element is : " + elements[i]);
//				}
//			}
//		}
//		System.out.println("---------------");
//		
//		//2nd Method 
//		
//		Set<String> store = new HashSet<String>();
//		for (String element : elements) {
//			if (store.add(element) == false) {
//				System.out.println("Duplicate Elements is : " + element);
//			}
//		}
//
//		System.out.println("-----------------");
		
		
		//Third method
		String[] names = { "Java", "Python", "C", "JS", "Java" };
		Map<String, Integer> storeMap=new HashMap<String, Integer>();
		for(String name:names) {
			Integer count = storeMap.get(name);
			if(count == null) {
				storeMap.put(name, 1);
			}else {
				storeMap.put(name, count++);
			}
		}
		
		//get the values from the map
		
		Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
		for(Entry<String, Integer> entry: entrySet) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}

	}

}
