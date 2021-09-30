package testClass;

import java.util.ArrayList;
import java.util.List;

public class ListsList_of_lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> arr = new ArrayList<>();
		   
	    List<Integer> a1= new ArrayList<>();
	    a1.add(11);
	    a1.add(2);
	    a1.add(4);

	    
	    List<Integer> a2= new ArrayList<>();
	    a2.add(4);
	    a2.add(5);
	    a2.add(6);
	    
	    List<Integer> a3= new ArrayList<>();
	    a3.add(10);
	    a3.add(8);
	    a3.add(-12);
	    
	    arr.add(a1);
	    arr.add(a2);
	    arr.add(a3);
	    int lSum=0,rSum=0;
	    for(int i=0; i<arr.size();i++){
	        for(int j=0; j<arr.size();j++){
	            if(i==j){
	                lSum += arr.get(i).get(j);
	            }else{
	                continue;
	            }
	        }
	    }
	    for(int i=0; i<arr.size();i++){
	        for(int j=0; j<arr.size();j++){
	            if(i+j==arr.size()-1){
	                rSum += arr.get(i).get(j);
	            }else{
	                continue;
	            }
	        }
	    }
	    System.out.println("lsum = "+lSum);
	    System.out.println("rsum = "+rSum);
	    int res =lSum-rSum;
	    if(res>0) {
	    	System.out.println(res);
	    }else {
	    	System.out.println(res*-1);
	    }
	}

}
