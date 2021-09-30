package codes;

public class ModuloArithmetic_a_Power_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fastPower(21,12,1000000007));
	}
static long fastPower(long a, long b, long n) {
	long res=1;
	
	while(b>0) {
		if((b&1)!=0) {
			res = (res * a%n)%n; //res will always be smaller than n, therefore res%n = res (always)
		}
		a=(a%n * a%n);
		b = b>>1;
	}
	
	return res;
}
}
