package codes;

public class GCD_EuclidAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gcd(24,80));
	}
static int gcd(int a , int b) {
	if(b==0) return a;
	return gcd(b,a%b);
}

}
