package testClass;

import java.util.ArrayList;
import java.util.List;

public class SansaXor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = new ArrayList<>();
		arr.add(3);
		arr.add(4);
		arr.add(5);
		int result =0;
	int n= arr.size();
	    
	    for(int i=0; i<n;i++) {
	        int j = i+1;
	        int val =0;
	        if(i==0 || i==n-1) {
	            val=(j)*(n-j+1);
	            if(val%2!=0) {
	                result = result^arr.get(i);
	            }else {
	                result = result^0;
	            }
	        }else {
	            val=(j)*(n-j+1);
	            if(val%2!=0) {
	                result = result^arr.get(i);
	            }else {
	                result = result^0;
	            }
	        } 
	    }
		System.out.println(result);

	}

}
