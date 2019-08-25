import java.util.HashMap;

public class HashMapCalculator {
	int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String>hashmap2) {
		int matches = 0;
		for(String key1: hashmap1.keySet()){
			for(String key2: hashmap2.keySet()){
				if(key1 == key2 && hashmap1.get(key1) == hashmap2.get(key2)) {
					matches++;
					break;
				}
			}
		}
		return matches;
	}
}
