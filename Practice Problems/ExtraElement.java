package testClass;

import java.util.ArrayList;
import java.util.Arrays;
// given two arrays , one array has one extra element , find the extra element

public class ExtraElement {
	public static void main(String[] args) {
		int a[] = {2,4,6,8,9,10,12};
		int b[] = {2,4,6,8,10,12};
		int n1 = a.length;
		int n2 = b.length;
		int ans = -1;
		boolean found=false;;
		int n = Math.min(n1, n2);
		for(int i=0 ; i<n; i++) {
			if(a[i]!=b[i]) {
				ans =i;
				found = true;
				break;
			}
		}
		if(!found){
		    ans = n-1;
		}
		System.out.println(ans);
	}
	
}



