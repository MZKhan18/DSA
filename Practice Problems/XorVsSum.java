package testClass;

public class XorVsSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n=10000000000L;
		long c =0;
        while(n!=0) {
        	if (n%2==1)
				c += 0;
			else
				c += 1;
        	n=n/2;
        }
        
        c=(long) Math.pow(2, c);
        System.out.println(c);
        

	}

}
