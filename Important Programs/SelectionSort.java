package codes;
//TIME COMPLEXITY O(N*N)
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,1,9,2,3};
		int n= arr.length;
		for(int i=0; i<n; i++) {
			int min =i;
			for(int j=i+1; j<n; j++) {
				if(arr[j]<arr[min])
					min =j;
			}
			if(min !=i)
				swap(arr,min,i);
		}
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
	}
	static void swap(int arr[], int a, int b) {
		int temp =arr[a];
		arr[a]= arr[b];
		arr[b] = temp;
	}

}
