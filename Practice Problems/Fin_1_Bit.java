package testClass;
import java.util.Scanner;
public class Fin_1_Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any number :");
		long n= sc.nextLong();
		int count=0;
		for(int i=0;i<32; i++) {
			if((n&(1<<i))>=1) {
				count++;
			}
		}
		System.out.println("Count = "+count);
		System.out.println("n in binary = "+Integer.toBinaryString((int) n));
		sc.close();
	}

}
