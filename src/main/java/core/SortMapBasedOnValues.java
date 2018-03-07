package core;

import java.util.HashMap;
import java.util.Map;

public class SortMapBasedOnValues {

	public static void main(String[] args) {
		Map<Integer, String> unsortedMap = new HashMap<Integer, String>();
		unsortedMap.put(12, "xyz");
		unsortedMap.put(13, "abc");
//		Map<Integer, String> sortedMap = unsortedMap.entrySet().
//				stream().
//				sorted(Entry.comparingByValue())
//				.collect(
//						Collectors.
//						toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, HashMap::new)
//						);
//		
//		sortedMap.entrySet().forEach(e->{System.out.println(e.getKey()+" "+e.getValue());});
		
		unsortedMap.entrySet().stream()
        .sorted((k1, k2) -> k1.getValue().compareTo(k2.getValue()))
        .forEach(k -> System.out.println(k.getKey() + ": " + k.getValue()));
	}

}
