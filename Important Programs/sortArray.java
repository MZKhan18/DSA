package codes;

public class sortArray {

	public static void main(String[] args) {
		int[] arr = {2,4,21,43,50,6,3};
		int n =arr.length;
		for(int i=1; i<n; i++) {
			int temp = arr[i];
			int j= i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] =temp;
		}

		for(int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
		
	}

}
