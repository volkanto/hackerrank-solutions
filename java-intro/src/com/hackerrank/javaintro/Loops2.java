package com.hackerrank.javaintro;

import java.util.Scanner;

public class Loops2 {
	static StringBuilder result = new StringBuilder();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();

			calculateQuery(a, b, n);
		}
		in.close();
		System.out.println(result.toString());
	}

	static void calculateQuery(int a, int b, int n) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < n; i++) {
			builder.append(a + hede(i, b));
			if (i != n - 1) {
				builder.append(" ");
			}
		}
		result.append(builder.toString());
		result.append("\n");
	}

	private static int hede(int i, int b) {
		int result = 0;
		for (int j = 0; j <= i; j++) {
			result += pow(2, j) * b;
		}
		return result;
	}

	public static int pow(int a, int n) {
		if (n == 0) {
			return 1;
		}
		return (a * pow(a, n - 1));
	}
}

// good solution:
//
// public class Solution {
//    
//    static int getValue(int a,int b, int n) {
//    	
//        int sum = a;
//        for(int z=n;z>=0;z--) {
//            sum = sum + ((int) Math.pow(2,z))*b;
//        }
//        
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int t = 0;
//        int a = 0;
//        int b = 0;
//        int n = 0;
//        t = in.nextInt();
//        for(int i=0;i<t;i++) {
//            a = in.nextInt();
//            b = in.nextInt();
//            n = in.nextInt();
//            for(int j =0;j<n;j++) {
//                System.out.print(getValue(a,b,j)+" ");
//            }
//            System.out.println();
//        }
//    }
//}
