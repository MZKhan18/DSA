package testClass;

import java.util.Arrays;
// given an array, find the smallest positive missing in it
public class SmallestPositiveMissing {
	public static void main(String[] args) {
		int a[] = {-47,1,4,49,-18,10,26,18,-11,-38,-24,36,44,-11,45,20,-16,28,17,-49,47,-48,-33,42,2,6,-49,30,36,-9,15,39,-6,-31,-10,-21,-19,-33,47,21,31,25,-41,-23,17,6,47,3,36,15,-44,33,-31,-26,-22,21,-18,-21,-47,-31,20,18,-42,-35,-10,-1,46,-27,-32,-5,-4,1,-29,5,29,38,14,-22,-9,0,43,-50,-16,14,-26}; //-20 -10 0 1 3
		int n= a.length;
		int counter=0;
		int k=1;
		int prev=-1;
		int ans=0;
		Arrays.sort(a);
		boolean found =false;
		for(int i=0 ;i<n;i++) {
			if(a[i]>0) {
				counter =i;
				break;
			}
		}
		for(int i=counter; i<n; i++) {
			if(i>0) prev =a[i-1];
			if(prev == a[i]) k--;
			if(a[i]!=k) {
				ans = k;
				found =true;
				break;
			}
			k++;
		}
		if(!found) ans = a[n-1]+1;
		System.out.println(ans);
	}
	
}



