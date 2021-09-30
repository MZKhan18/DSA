package codes;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,4,2,6,54,2,78,585,4567,46,345,865,3};
		int n=arr.length -1;
		quickSort(arr,0,n);
		for(int i=0; i<=n; i++)
			System.out.print(arr[i]+" ");

	}
	
	static void quickSort(int arr[], int l, int h) {
		if(l<h) {  //to assure that there are minimum two elements in the array
			int pivot = partition(arr,l,h);
			quickSort(arr,l,pivot-1);
			quickSort(arr,pivot+1,h);
		}
	}
	
	static int partition(int arr[],int l , int h) {
		int pivot = arr[l];
		int i =l;
		int j =h;
		while(i<j) {
			while(arr[i]<=pivot && i<h) i++;
			while(arr[j]>pivot && j>l) j--;
			if(i<j) swap(arr, i,j);			
		}
		swap(arr,j,l);
		return j;
	}
	
	static void swap(int arr[], int a, int b) {
		int temp =arr[a];
		arr[a]= arr[b];
		arr[b] = temp;
	}

}
