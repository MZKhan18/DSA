package testClass;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,3,5,2,1};
		int n= a.length - 1;
		for(int i=0; i<=n/2; i++) {
			swap(a, i, n-i);
		}
		for(int i=0; i<n+1; i++) {
			System.out.print(a[i]+" ");
		}
	}
static void swap(int[] arr, int s, int l){
	      int temp  = arr[s];
	      arr[s] = arr[l];
	      arr[l]= temp;
	}
	
}
