package testClass;

public class FlipBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n=0;

		for(long i=0; i<32L; i++) {
			long mask = 1L<<i;
			if((n&mask)!=0) {
				n= n&(~mask);
			}else {
				n = n|mask;
			}
			mask=0;
		}
			    System.out.println(n);
	}

}
