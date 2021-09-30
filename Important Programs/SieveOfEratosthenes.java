package codes;
//find primes in a given range
import java.util.Arrays;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ans[] = check(20);
		for(int i=0; i<=20; i++)
			System.out.println(i+" "+ans[i]);
	}

static String[] check(long n) {
	String[] isPrime = new String[(int)n+1];
	Arrays.fill(isPrime, "Prime");
	isPrime[0]="Not Prime";
	isPrime[1]="Not Prime";
	for(int i=2; i*i<=n; i++) {
		for(int j=2*i; j<=n; j +=i)
			isPrime[j]="Not Prime";
	}
	
	
	return isPrime;
}
}
