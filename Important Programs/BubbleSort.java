package codes;
//Time complexity O(n*n);
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,5,3,8,6};
		int n =arr.length;
		for(int i=0; i<n-1; i++) {
			boolean swaped =false;
			for(int j=0; j<n-i-1; j++) {
				if(arr[j+1]<arr[j]) {
					swap(arr, j, j+1);
					swaped = true;
				}
			}

			if(!swaped)
				break;
		}
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
		
	}
	
	static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a]= arr[b];
		arr[b]=temp;
	}

}
