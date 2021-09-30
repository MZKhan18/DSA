package testClass;

import java.util.Arrays;

public class Rough {
	public static void main(String[] args) {
		long a[]= {2};
		long b	[]= {2};
		long n =a.length;
		long k =0;
		boolean ans=true;
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0; i<n;i++){
            if(!(a[i]+b[(int) (n-i-1)]>=k))
                ans =false;
        }
		
	}
	
	


}



