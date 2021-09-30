package testClass;

import java.util.Scanner;

public class ReverseBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number :");
		long n= sc.nextLong();
		long rev=0;
		for(int i=0; i<32; i++) {
			long lsb=1;
			lsb= (n&lsb);
			long revLsb = lsb<<(31-i);
			rev = rev | revLsb;
			n=n>>1;
		}
		System.out.println("Revrse = "+rev);
		sc.close();
	}

}
