package TenDaysOfCode;


import java.util.Scanner;

public class DivisibleSubArrays {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number of test cases");
		int t = scn.nextInt();
		for (int i = 1; i <= t; i++) {
//			System.out.println("Enter the length of the array");
			int n = scn.nextInt();
//			System.out.println("Start filling the array");
			int arr[] = new int[n];
			for (int j = 0; j < n; j++)
				arr[j] = scn.nextInt();
			subArrays(arr);
		}

	}

	private static void subArrays(int[] arr) {
//System.out.println(arr[0]);
		int si = 0, ei = 0, n = arr.length,ans=0, count = 0, val = 0, b = 0;
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		String ans = "";
		for (; si < n; si++) {
			ans = 0;
//			System.out.println("\n\nsi now is " + si);
			for (ei = val; ei <= si; ei++) {
//				System.out.println("~~~ei now is " + ei);
				ans+=arr[ei];
			}
//			System.out.println(al);
			if (ans % n == 0)
				count += 1;
			if (si == n - 1) {
				si = ++val - 1;
//				System.out.println(++b + "~~~~~~~~\n si is " + si + " and val is " + val);
//				++val;
			}

		}
		System.out.println(count);

	}

}
// 1 5 5 5 5 5 5 