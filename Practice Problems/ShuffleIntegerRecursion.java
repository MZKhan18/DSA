package testClass;


public class ShuffleIntegerRecursion {

	public static void main(String[] args) {
		
		long[] arr = {1,2,3,4,5,6};
		int n=6;
		long[] arr2 =new long[n];
		shuffle(arr,n,0,arr2, 0);
		for(int i =0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
	
	}
	
	static void shuffle(long arr[], int n, int i, long arr2[], int m) {
		if(i==n) {
			return;
		}
		
			arr2[i]=arr[m];
			i++;
			arr2[i] =arr[m +(n/2)];
		
		shuffle(arr,n,i+1,arr2, m+1);
	}
	

}
