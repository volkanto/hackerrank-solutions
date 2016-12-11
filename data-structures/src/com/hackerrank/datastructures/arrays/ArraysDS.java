package com.hackerrank.datastructures.arrays;

import java.util.Scanner;

public class ArraysDS {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		String second = scanner.nextLine();
		scanner.close();
		
		String[] givenArray = second.split(" ");
		if(givenArray.length != size) {
			System.out.println("Error!");
			return;
		}

		StringBuilder result = new StringBuilder();
		for (int i = givenArray.length - 1; i >= 0; i--) {
			result.append(givenArray[i]); 
			if(i != 0) {
				result.append(" ");
			}
		}
		System.out.println(result);
	}
}
