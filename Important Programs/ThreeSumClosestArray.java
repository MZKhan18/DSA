package codes;

import java.util.Arrays;

public class ThreeSumClosestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		int a[] = {0,0,0};
		int target = 1;
		Arrays.sort(a);
		int min = 999999999;
		int ans = 0;
		for(int i=0; i<a.length-2; i++) {
			int j = i +1; 
			int k = a.length-1;
			while(j<k) {
				int sum = a[i]+a[j]+a[k];
				int val =Math.abs( target  - sum);
//				System.out.println(val+" "+min); 	
				if(val<min) {
					min = val;
					ans = sum;
				}
				
				if(sum==target) {
					break;
				}else if(sum<target) {
					j++;
				}else if(sum>target) {
					k--;
				}
			}
		}
		System.out.println(ans);

	}

}
