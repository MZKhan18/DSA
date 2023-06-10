package testClass;

import java.util.Arrays;

public class TransitionTerm {
	public static void main(String[] args) {
		
		int a[] = {1};
		int n = a.length;
		int temp =-1 ;
		boolean found = false;
		for(int i=0; i<n; i++) {
			if(a[i]==1) {
				temp = i;
				found = true;
				break;
			}
		}
		if(!found) temp = -1;
		System.out.println(temp);
	}
	
}



