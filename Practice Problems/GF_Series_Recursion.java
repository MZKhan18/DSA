package testClass;

import java.util.ArrayList;

public class GF_Series_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int N =7;
		   if(N==0) {
			   System.out.print(N);
		   }else if (N==1){
			   System.out.print(0);
		   }else if (N==2){
			   System.out.print(0+" "+1);
		   }else {
			   ArrayList<Long> arr = new ArrayList<Long>();
			   System.out.print(0+" "+1);
			   series(arr,0,1,N-2);
			   for(long d: arr) {
				   System.out.print(d+" ");
			   }
		   }

		   
	    }
	    static void series(ArrayList<Long> arr, long first, long second, int N) {
			long num = first*first -second;
			arr.add(num);
			if(arr.size()==N) {
				return;
			}
			series(arr,second, num, N);
		
		}

}
