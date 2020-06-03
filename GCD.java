package TenDaysOfCode;

import java.util.Scanner;

public class GCD {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println();
		int a = scn.nextInt();
		int b = scn.nextInt();
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		int gcd = 1;
		for (int i = min; i >= 1; i--) {
			if (max % i == 0 && min % i == 0) {
				gcd = i;
				break;
			}
		}
		System.out.println(gcd);
	}
}
