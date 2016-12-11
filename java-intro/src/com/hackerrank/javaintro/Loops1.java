package com.hackerrank.javaintro;

import java.util.Scanner;

public class Loops1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int given = scanner.nextInt();
		scanner.close();

		int counter = 1;
		do {
			System.out.println(given + " x " + counter + " = " + given * counter);
			counter++;
		} while (counter <= 10);
	}
}
