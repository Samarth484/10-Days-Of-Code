package TenDaysOfCode;


import java.util.Scanner;

public class TrailingZeros {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
System.out.println();
		int n = scn.nextInt();
		int p = 5, ans = 0;
		while (n / p > 0) {
			ans += n / p;
			p *= 5;
		}
		System.out.println(ans);
	}
}
