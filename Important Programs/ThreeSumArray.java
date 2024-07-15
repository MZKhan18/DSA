package codes;
import java.util.*;

public class ThreeSumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
		Set<List<Integer>> list = new HashSet<>();
		Arrays.sort(a);
		for(int i=0; i<a.length-2; i++) {
			int j = i +1; 
			int k = a.length-1;
			while(j<k) {
				int sum = a[i]+a[j]+a[k];
				
				if(sum==0) {
					list.add(Arrays.asList(a[i],a[j],a[k]));
//					break;
					
				}
				if(sum<0) {
					j++;
				}else if(sum>0) {

					k--;
				}else if(sum==0) {
					j++;
					k--;
				}
			}
		}
		List<List<Integer>> ans = new ArrayList<>(list);
		if(list.isEmpty()) System.out.println(0);
		System.out.println(ans);
//		if(list.get(0)!=list.get(1)) {
//			System.out.println("true");
//		}

	}

}
