package codes;
import java.util.Scanner;
public class TrailingZerosInFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number :");
		long n = sc.nextLong();
		long count=0;
		for(int i=5; i<=n;i=i*5) {
			count +=n/i;
		}
		System.out.println(count);
		sc.close();
	}

}
