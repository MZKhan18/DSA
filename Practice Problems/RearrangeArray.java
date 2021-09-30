package testClass;
//REARRANGE ARRAY IN O(1) SPACE
//Input:
//N = 2
//arr[] = {1,0}
//Output: 0 1
//Explanation: 
//arr[arr[0]] = arr[1] = 0.
//arr[arr[1]] = arr[0] = 1.


public class RearrangeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long arr[] = {4,0,2,1,3};
		int n=arr.length;

		
//-----------------WITH EXTRA SPACE O(n)----------------//	
//      int index;
//		long a[]=new long[arr.length];
//		for(int i=0; i<n; i++){
//            index=(int)arr[i];
//            a[i]=arr[index]; 
//            
//        }
//        for(int i=0; i<n; i++)
//        {
//        	System.out.print(a[i]+" ");
//        }
		
//-----------------WITHOUT EXTRA SPACE O(1)----------------//	
		long tempVal=arr[0];
		for(int i=0; i<n; i++) {
                                                                       //{4,0,2,1,3};
			int val = (int)arr[i];
			if(val==0) {
				arr[i]=tempVal;
			}else {
			arr[i]=arr[val];
			}
		}
      for(int i=0; i<n; i++)
      {
      	System.out.print(arr[i]+" ");
      }
		
	}

}
