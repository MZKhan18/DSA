package codes;

import java.util.Scanner;
//THIS CODE SETS BIT (1) AT A GIVEN INDEX IF THERE IS 0, IF THERE IS 1 THEN IT REMAINS SAME

public class Set_ith_Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter any number :");
		int num = sc.nextInt();
		System.out.print("Enter the index at which bit to find :");
		int index = sc.nextInt();
		int mask = 1<<index;
		int result = num|mask;
		System.out.println(result);
		System.out.println();
		System.out.println("Num in binary ="+Integer.toBinaryString(num));
		System.out.println("mask="+Integer.toBinaryString(mask));
		System.out.println("num|mask = "+Integer.toBinaryString(result));
		
		sc.close();
	}

}
