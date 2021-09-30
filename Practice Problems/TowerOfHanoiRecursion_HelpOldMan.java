package testClass;

/* A poor old man works in a palace for a living. One day the old man's wife met with an accident. She needed an immediate operation but the old man's
 * savings were not enough for the operation. He went running to the king to beg for money. The king told that he will not only pay the full amount for 
 * the operation but also double his salary. But for that the old man had to pass a test. The king showed him a pile of glass plates kept one above another,
 * each one being smaller than the one beneath. The plates were kept in box 1. He had to transfer the plates to box 3 using box 2. However, there were some 
 * constraints. The old man could only take one plate at a time and he could only place a smaller plate on top of a larger plate. He could take a plate only 
 * from the top. Help the old man do so. There are N plates and he has to tell the nth move in the format (i, j) where a plate is being moved from ith box 
 *  to jth box.

Note:
Given any number of plates, they can be transferred from box 1 to box 3 using box 2 using the following steps.
Step 1: Transfer first N-1 plates from box 1 to box 2 using box 3.
Step 2: Transfer the remaining plate from box 1 to box 3.
Step 3: Transfer the first N-1 plates from box 2 to box 3 using box 1. */


import java.util.ArrayList;
import java.util.List;

public class TowerOfHanoiRecursion_HelpOldMan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N =3;   //no. of rings
		int n=4;   // step number that we have to find 
		int count[] = new int[1];
		List<Integer> arr = new ArrayList<Integer>();
		toh(N,n,1,2,3,arr, count);
		System.out.println(arr.get(0) + " "+ arr.get(1));
				
}

static	void toh(int N, int n, int src, int helper, int dest, List<Integer> arr,int[] count) {
 if(N==0) {
	 return;
 }
 
 toh(N-1,n, src, dest, helper,arr, count);
 count[0]++;
 if(count[0]==n) {
	 arr.add(src);
	 arr.add(dest);
 }
// System.out.println("Moved from "+src+" to "+dest);  //to display all the steps
 toh(N-1,n, helper, src, dest,arr, count);
 
}
	

}
