package testClass;

import java.util.Scanner;
public class BinaryToGrayCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		System.out.print("Enter any number :");
		int n=sc.nextInt();
		int res=n^(n>>1);
		System.out.println("Gray code = "+res);
		System.out.println("n in binary = "+Integer.toBinaryString(n));
		System.out.println("Gray Code in binary  = "+Integer.toBinaryString(res));
		sc.close();
	}

}
