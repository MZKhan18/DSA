package codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1000000000,1000000000,1000000000,1000000000};
		int target =-294967296;
		Set<List<Integer>> list = new HashSet<>();
		Arrays.sort(a);	
		for(int h=0; h<a.length-3;h++) {
			for(int i=h+1; i<a.length-2; i++) {
				int j = i +1; 
				int k = a.length-1;
				while(j<k) {
					System.out.println(a[k]);
					long sum=(long)a[i]+a[j]+a[k]+a[h];
					
					if(sum==target) {
						list.add(Arrays.asList(a[h],a[i],a[j],a[k]));
//						break;
						
					}
					if(sum<target) {
						j++;
					}else if(sum>target) {

						k--;
					}else if(sum==target) {
						j++;
						k--;
					}
				}
			}
		}
		List<List<Integer>> ans = new ArrayList<>(list);
		System.out.println(ans);
		

	
	}

}
