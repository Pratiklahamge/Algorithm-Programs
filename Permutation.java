package com.bridgelabz.algo;
import java.util.Scanner;

/**
 * Purpose  - Return all permutations of a String using iterative method.
 * @name  - pratik 
 * @javaversion - 13.0
 * @date   - 17/10/2021
 */

public class Permutation {
	public static void solution(String str){
		int n = str.length();
		int f = factorial(n);

		for (int i=0; i<f; i++){
			StringBuilder sb = new StringBuilder(str);
			int temp = i;
			for (int div=n; div>=1; div--){
				int q = temp / div;
				int r = temp % div;

				System.out.print(sb.charAt(r));
				sb.deleteCharAt(r);

				temp = q;
			}
			System.out.println();
		}
	}
	public static int factorial(int n){
		int val = 1;
		for (int i=2; i<=n; i++){
			val *= i;
		}
		return val;
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a string to return its permutation : ");
			String str = scanner.next();
			solution(str);
		}


	}

}
