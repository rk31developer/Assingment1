package com.desing.test;

public class Program2 {

	public static void main(String args[]) {
		int n = 5;
		for (int i = n - (n - 1); i < n; i++) {
			for (int j = n - (n - 1); j < n; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}
}
