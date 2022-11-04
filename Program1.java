package com.desing.test;

public class Program1 {
	public static void main(String args[]) {
		int n = 7;
		for (int i = 0; i < n; i++) {
			/*
			 * 
			 * Letter 'I'
			 *
			 */
			for (int j = 0; j < n; j++) {
				if (j == (n - 1) / 2 || i == 0 || i == (n - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			/*
			 * Space ' '
			 *
			 */
			for (int j = 0; j < n; j++) {
				if (j == 0) {

					System.out.print(" ");
				}
			}
			/*
			 * 
			 * Letter 'N'
			 *
			 */
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == j || j == n - 1) {

					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			/*
			 * 
			 * Space
			 *
			 */
			for (int j = 0; j < n; j++) {
				if (j == 0) {

					System.out.print(" ");
				}
			}
			/*
			 * 
			 * Letter 'E'
			 *
			 */
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == 0 || i == n - 1 || (i == (n - 1) / 2) && j <= (n - 1) / 2) {

					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			/*
			 * 
			 * Space
			 *
			 */
			for (int j = 0; j < n; j++) {
				if (j == 0) {

					System.out.print(" ");
				}
			}

			/*
			 * 
			 * Letter 'U'
			 *
			 */
			for (int j = 0; j < n; j++) {
				if ((j == 0 && i != n - 1) || (j == n - 1 && i != n - 1) || (i == n - 1 && j != 0 && j != n - 1)

				// ||(j+i==(n-1) && i>=((n-1)*3/4) && j>=((n-1)*1/4))
				) {

					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			/*
			 * 
			 * Space
			 *
			 */
			for (int j = 0; j < n; j++) {
				if (j == 0) {

					System.out.print(" ");
				}
			}

			/*
			 * 
			 * Letter 'R'
			 *
			 */
			for (int j = 0; j < n; j++) {
				if (j == 0 || (i == 0 && j != n - 1) || (i == (n - 1) / 2 && j != n - 1)
						|| (j == n - 1 && i <= (n - 1) / 2 && i != 0 && i != (n - 1) / 2)
						|| ((i - j == (n - 1) / 2) && i > (n - 1) / 2)) {

					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			/*
			 * 
			 * Space
			 *
			 */
			for (int j = 0; j < n; j++) {
				if (j == 0) {

					System.out.print(" ");
				}
			}

			/*
			 * 
			 * Letter 'U'
			 *
			 */
			for (int j = 0; j < n; j++) {
				if ((j == 0 && i != n - 1 && i != 0) || (j == n - 1 && i != n - 1 && i != 0)
						|| (i == n - 1 && j != 0 && j != n - 1)

						|| (i == 0 && j != 0 && j != n - 1)) {

					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			/*
			 * 
			 * Space
			 *
			 */
			for (int j = 0; j < n; j++) {
				if (j == 0) {

					System.out.print(" ");
				}
			}
			/*
			 * 
			 * Letter 'N'
			 *
			 */
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == j || j == n - 1) {

					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			System.out.println("");
		}
	}
}
