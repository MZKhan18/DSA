package testClass;

public class GreateXor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long x=10;
		  long result = 0;
		    int bitPos = 0;
		    while(x>0) {
		        if((x&1) == 0) {
		            result += (1L<<bitPos);
		        }
		        bitPos++;
		        x >>= 1;
		    }
		    System.out.println(result);

	}

}
