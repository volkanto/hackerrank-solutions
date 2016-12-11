package com.hackerrank.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringCompare {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		Integer B = Integer.valueOf(sc.next());
		
		List<String> setOfA = new ArrayList<>();
		A.chars().forEach(item -> {
			setOfA.add(String.valueOf((char)item));
		});
		List<String> subSetOfA = new ArrayList<>();
		for (int i = 0; i < setOfA.size(); i++) {
			if(i + B > setOfA.size()) {
				break;
			}
			subSetOfA.add(listToString(setOfA.subList(i, i + B)));
		}

		String smallest = subSetOfA.get(0);
		String largest = subSetOfA.get(0);
		
		for (String item : subSetOfA) {
			if(item.compareTo(smallest) <= 0) {
				smallest = item;
			} 
			
			if(item.compareTo(largest) > 0) {
				largest = item;
			}
		}
		
		System.out.println(smallest);
		System.out.println(largest);
		
	}

	private static String listToString(List<String> subList) {
		StringBuilder result = new StringBuilder();
		subList.forEach(item -> {
			result.append(item);
		});
		return result.toString();
	}
	
	
}
