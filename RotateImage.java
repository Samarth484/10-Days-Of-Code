package TenDaysOfCode;

import java.util.Scanner;

public class RotateImage {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the value of n");
		int n = scn.nextInt();
		int count = 0;
		int arr[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = ++count;
			}
		}

		rotate(arr, n);
	}

	private static void rotate(int[][] arr, int n) {
		int row = n - 1, col = 0, i = -1, j = -1;
		int dup[][] = new int[n][n];
		for (col = 0; col < n; col++) {
			++i;
			j = -1;
			for (row = n - 1; row >= 0; row--) {
				dup[row][col] = arr[i][++j];
			}
		}

		for (int val[] : dup) {
			for (int value : val)
				System.out.print(value + " ");
			System.out.println();
		}

	}

}
