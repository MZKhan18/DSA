package testClass;

import java.util.ArrayList;
import java.util.List;

//Juggler Sequence is a series of integers in which the first term starts with a positive integer number a and the remaining terms are generated from 
//the immediate previous term using the below recurrence relation:
//
//	 a_(k+1)={|_a_k^(1/2)_|   for even a_k; 
//			={|_a_k^(3/2)_|   for odd a_k, 
//
//	Given a number N, find the Juggler Sequence for this number as the first term of the sequence.


public class JugglerSecuence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ans = new ArrayList<Integer>();
		int N = 27;
		ans = sequence(N, ans);
		for(int i=0; i<ans.size(); i++) {
			System.out.println(ans.get(i)+" ");
		}

	}
	
	static List<Integer> sequence(int n, List<Integer> arr){
		if(!arr.contains(n))
		 arr.add(n);

        if(n==1)
        return arr;
        		
		if(n%2==0) {
			  n = (int) Math.sqrt((double)n);
			  arr.add(n);
			}else if(n%2==1) {
				n =(int) Math.pow(Math.sqrt((double)n),(double)3);
				arr.add(n);
			}
		
		
		return sequence(n, arr);
	
	}

}
