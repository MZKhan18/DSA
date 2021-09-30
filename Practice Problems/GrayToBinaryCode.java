package testClass;

import java.util.Scanner;

public class GrayToBinaryCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		System.out.print("Enter any number :");
		int n=sc.nextInt();
		int res=n;
		int n1 =n;
		while(n>0)
		{
			n = n>>1;
			res = res^n;
		}
		
		System.out.println("Binary code = "+res);
		System.out.println("Gray code in binary = "+Integer.toBinaryString(n1));
		System.out.println("binary  = "+Integer.toBinaryString(res));
		sc.close();
	}

}
