package org.logical;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Reverse {
	public static void main(String[] args) {
		String a = "Srinivasu";
		char[] charArray = a.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (char c : charArray) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		Set<Character> keySet = map.keySet();
		for (Character character : keySet) {
			if (map.get(character) >= 1) {
				System.out.println(character + " : " + map.get(character));
			}
		}
	}

}
