package com.hackerrank.java;
import java.util.Scanner;

/**
 * A palindrome is a word, phrase, number, or other sequence of characters which
 * reads the same backward or forward.(Wikipedia)
 * 
 * Given a string A, print Yes if it is a palindrome, print No otherwise.
 * Constraints : A will consist at most 50 lower case english letters.
 * 
 * Sample Input : madam | Sample Output : Yes
 * 
 * @author life
 *
 */
public class Palindrome {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();

		if (isWordAcceptable(A)) {
			System.out.println(isPalindrome(A) ? "Yes" : "No");
		} else {
			System.out.println("No");
		}
	}

	private static boolean isWordAcceptable(String argWord) {
		argWord = argWord.trim().toLowerCase();
		if (argWord != null && argWord.length() > 50)
			return false;
		return true;
	}
	
	private static boolean isPalindrome(String argWord) {
		argWord = argWord.trim().toLowerCase();
		if(argWord.length() == 1) {
			return true;
		} else {
			char[] firstPart = null;
			char[] secondPart = null;
			int middle = argWord.length() / 2;
			if(argWord.length() % 2 == 0) {
				firstPart = argWord.substring(0, middle).toCharArray();
				secondPart = argWord.substring(middle, argWord.length()).toCharArray();
				for (int i = 0; i < middle; i++) {
					if(firstPart[i] != secondPart[secondPart.length - (i + 1)]) {
						return false;
					}
				}
				return true;
			} else {
				firstPart = argWord.substring(0, middle).toCharArray();
				secondPart = argWord.substring(middle, argWord.length()).toCharArray();
				for (int i = 0; i < middle; i++) {
					if(firstPart[i] != secondPart[secondPart.length - (i + 1)]) {
						return false;
					}
				}
				return true;
			}
		}
	}
}

// best solution
//import java.io.*;
//import java.util.*;
//
//public class Solution {
//
//    public static void main(String[] args) {
//        
//        Scanner sc=new Scanner(System.in);
//        String A=sc.next();
//        boolean valid = true;
//        
//        for(int i = 0; i < (A.length() / 2); i++) {
//            if(A.charAt(i) != A.charAt((A.length() - 1) - i)) {
//                valid = false;
//                break;
//            } // end if
//        } // end for(i)
//        
//        if(valid) System.out.println("Yes");
//        else System.out.println("No");
//    } // end main
//} //
