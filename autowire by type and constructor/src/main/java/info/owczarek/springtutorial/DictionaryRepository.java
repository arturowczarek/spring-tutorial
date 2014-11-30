package info.owczarek.springtutorial;

import java.util.HashMap;
import java.util.Map;

public class DictionaryRepository {
	public Map<String, String> getMapValue() {
		Map<String, String> result = new HashMap<>();
		result.put("a", "b");
		return result;
	}
}
