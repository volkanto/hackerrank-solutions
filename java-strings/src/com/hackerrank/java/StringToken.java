package com.hackerrank.java;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringToken {
	public static void main(String[] args) {
		String pattern = "[A-Za-z !,?._'@]+";
		String patternToken = "[ !,?._'@]+";
		String key = "           YES      leading spaces        are valid,    problemsetters are         evillllll";
		String[] splitted = key.split(patternToken);
		System.out.println(Arrays.asList(splitted).stream().filter(item -> item.matches(pattern)).count());
		Arrays.asList(splitted).stream().filter(item -> item.matches(pattern)).forEach(System.out::println);
	}

	/**
	 * second and more efficient solution
	 * 
	 * @param key
	 * @param pattern
	 */
	public static void solution(String key, String pattern) {
		StringTokenizer token = new StringTokenizer(key, pattern);
		System.out.println(token.countTokens());
		while (token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
	}
}
