package codes;

public class NextPermutationArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,1,5};
		int n = a.length;
		int pivot_index  = -1;
		
		for(int i=n-1;i>0; i--) {
			if(a[i-1]<a[i]) {
				pivot_index = i-1;
				break;
			}
		}
		int swap_index = pivot_index;
		if(pivot_index!=-1) {
			for(int i=n-1;i>=pivot_index+1;i--) {
				if(a[i]>a[pivot_index]) {
					swap_index = i;
					break;
				}
			}
		}
		if(pivot_index==-1) {
			reverse(a,pivot_index+1,n-1);
		}else {
			swap(a,pivot_index,swap_index);
			reverse(a,pivot_index+1,n-1);
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(a[i]);
		}

	}
	static void swap(int arr[],int i , int j) {
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}
	
	static void reverse(int arr[],int i ,int j) {
		while(i<j) {
			int t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
			i++;
			j--;
		}
	}
}
