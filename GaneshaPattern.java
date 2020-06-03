package TenDaysOfCode;


import java.util.Arrays;
import java.util.Scanner;

public class GaneshaPattern {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the value of n");
		int n = scn.nextInt();
		int col = 0, row = 0;
		char ch[][] = new char[n][n];
		for (char[] vall : ch)
			Arrays.fill(vall, ' ');

		for (col = n - 1; col >= n / 2; col--) {
			ch[0][col] = '*';
		}
		col++;
		for (row = 0; row < n; row++) {
			ch[row][col] = '*';
		}

		row--;
		for (; col >= 0; col--)
			ch[row][col] = '*';

		col++;
		for (row = 0; row <= n / 2; row++)
			ch[row][col] = '*';
		row--;

		for (col = 0; col < n; col++)
			ch[row][col] = '*';

		col--;

		for (; row < n; row++)
			ch[row][col] = '*';

		for (char[] val : ch) {
			for (char value : val)
				System.out.print(value);
			System.out.println();
		}

	}
}

