package codes;
import java.util.Scanner;
public class OddEvenUsingBitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");

		int n = sc.nextInt();
		if((n&1)==0) {
			System.out.println("It is even");
		}else {
			System.out.println("It is odd");
		}
		
		sc.close();
	}

}
