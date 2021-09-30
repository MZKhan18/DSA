package codes;

public class PalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 11111111111134143L;
		long n1 = n;
		long rev = 0;
		while(n!=0) {
			long x = n%10;
			rev =rev*10 +x;
			n=n/10;
		}
		if(rev==n1)
			System.out.println("It is Palindrome");
		else
			System.out.println("It is not a Palindrome");
	}


}
