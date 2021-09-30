package codes;


//KADANE'S ALGO
//this code/method doesn't works if all the array elements are negative
public class LargestSumContigousSubarray_Kadanes_Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {2,-3,-4};
		int maxSum=0,sum=0;

		for(int i=0; i<array.length;i++) {
			
			sum += array[i];
			if(sum>maxSum) {
				maxSum = sum;
			}
			
			if(sum<0) {
				sum=0;
			}	
		}
		System.out.println("largest sum = "+maxSum);
	}

}
