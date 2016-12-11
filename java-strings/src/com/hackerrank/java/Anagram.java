package com.hackerrank.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {
	static Map<String, Integer> firstMap = new HashMap<>();
	static Map<String, Integer> secondMap = new HashMap<>();
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String first = scan.next();
		String second = scan.next();
		scan.close();
        boolean ret = isAnagram(first, second);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}

	static boolean isAnagram(String first, String second) {
		calculateFreq(first.toLowerCase(), firstMap);
		calculateFreq(second.toLowerCase(), secondMap);
		
		if(firstMap.size() != secondMap.size()) {
			return false;
		}
		
		for (String mapKey : firstMap.keySet()) {
			if(secondMap.get(mapKey) == null || secondMap.get(mapKey) != firstMap.get(mapKey)) {
				return false;
			}
		}
		
		return true;
	}
	
	static void calculateFreq(String argItem, Map<String, Integer> map) {
		argItem.chars().forEach(item -> {
			checkAndCalculateMap(map, String.valueOf((char)item));
		});
	}
	
	static void checkAndCalculateMap(Map<String, Integer> map, String key) {
		Integer counter = map.get(key);
		if(counter != null) {
			map.put(key, map.get(key) + 1);
		} else {
			map.put(key, 1);
		}
	}
}
