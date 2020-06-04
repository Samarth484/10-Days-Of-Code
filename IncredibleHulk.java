package TenDaysOfCode;

import java.util.Scanner;

public class IncredibleHulk {
static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Enter the numbero f tst");
int t=scn.nextInt();
for(int i=1;i<=t;i++) {
//	System.out.println("Enter the value of n");
	int n=scn.nextInt();
	System.out.println(Integer.bitCount(n));
}
	}

}
