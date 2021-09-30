package codes;
//MOORE'S VOTING ALGO: its a two step method
//The first step gives the element that maybe the majority element in the array. If there is a majority element in an array, 
//then this step will definitely return majority element, otherwise, it will return candidate for majority element.
//2nd step: Check if the element obtained from the above step is majority element. This step is necessary as there might be no majority element
//Time Complexity: O(n). 
//As two traversal of the array is needed, so the time complexity is linear.
//Space Complexity: O(1). 
//As no extra space is required.

public class Majority_Element_Array_MooreVotingAlgo {
	public static void main(String[] args) {
			int array[]= {8,2,8,2,2};
			int index=0,count=1;
			for(int i=1; i<array.length; i++) {
				if(array[index]==array[i]) {
					count++;
				}
				else {
					count--;
				}
				if(count==0) {
					index =i;
					count++;
				}
			}
			count =0;
			for(int i=0; i<array.length;i++) {
				if(array[index]==array[i]) {
					count++;
				}
			}
			if(count>array.length/2) {
				System.out.println("Majority element = "+array[index]);
			}
			else {
				System.out.println("No Majority element");
			}		
	}        
        
}
