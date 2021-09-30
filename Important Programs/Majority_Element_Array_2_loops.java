package codes;
//majority element is an element of array whose frequency is more than n/2 >> n=size of array
//METHOD 1: create 2 loops >> find frequency of each element >> check if frequency >n/2
//Time Complexity: O(n*n). 
//A nested loop is needed where both the loops traverse the array from start to end, so the time complexity is O(n^2).
//Space Complexity: O(1). 
//As no extra space is required for any operation so the space complexity is constant.

public class Majority_Element_Array_2_loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {2,2,3,1,2,3,3,3,3}; //majority element is 2
		int count =0, index=-1;
		for(int i=0; i<array.length; i++) {
			count =0;
			for(int j=0; j<array.length; j++) {
				if(array[i]==array[j]) {
					count +=1;
					}
			}
			if(count>array.length/2) {
				index =i;
				break;
			}
		}
		if(index>-1) {
			System.out.println("Majority element is :"+array[index]);
		}
		else {
			System.out.println("No Majority element");
		}
		
	}

}
