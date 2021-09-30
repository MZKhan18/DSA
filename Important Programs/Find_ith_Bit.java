package codes;
import java.util.Scanner;
// THIS CODE FINDS THAT WHAT BIT IS PRESENT AT PARTICULAR INDEX IN A NUMBER
public class Find_ith_Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter any number :");
		int num = sc.nextInt();
		System.out.print("Enter the index at which bit to find :");
		int index = sc.nextInt();
		int mask = 1<<index;
		if((num&mask)!=0) {
			System.out.println("Bit at that index is 1");
		}else {
			System.out.println("Bit at that index is 0");
		}
		System.out.println();
		System.out.println("Num in binary ="+Integer.toBinaryString(num));
		System.out.println("mask="+Integer.toBinaryString(mask));
		System.out.println("num&mask = "+Integer.toBinaryString(num&mask));
		
		sc.close();
	}

}
