package codes;

import java.util.Scanner;
//FIND HOW MANY BITS TO CHANNGE TO CONVERT a TO b
public class BitsChangeToConvert_a_To_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("CONVERT a TO b");
		System.out.print("Enter value of a :");
		int a =sc.nextInt();
		System.out.print("Enter value of b :");
		int b= sc.nextInt();
		int count =0;
		int n = a^b;
		int n1=n;
		while(n>0) {
			n=n&(n-1);
			count++;
		}
		System.out.println("Numbers of bits to change = "+count);
		System.out.println();
		System.out.println("a = "+Integer.toBinaryString(a));
		System.out.println("b = "+Integer.toBinaryString(b));
		System.out.println("n1 = "+Integer.toBinaryString(n1));
		
		sc.close();
	}

}
