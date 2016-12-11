package com.hackerrank.java;
import java.util.Scanner;

public class StringsIntro {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		System.out.println(sumOfLengths(A, B));
		System.out.println(isFirstLexicographicallyLarger(A, B) ? "Yes" : "No");
		System.out.println(capitalizeLettersAndConcate(A, B));
	}

	static String capitalizeLettersAndConcate(String first, String second) {
		return capitalizeFirstLetter(first) + " " + capitalizeFirstLetter(second);
	}

	static int sumOfLengths(String first, String second) {
		return first.trim().length() + second.trim().length();
	}

	static boolean isFirstLexicographicallyLarger(String first, String second) {
		return first.trim().charAt(0) > second.trim().charAt(0);
	}

	static String capitalizeFirstLetter(String item) {
		return item.trim().replace(item.charAt(0), String.valueOf(item.charAt(0)).toUpperCase().charAt(0));
	}
}
