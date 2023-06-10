package testClass;
//Given an array A of N elements. Find the majority element in the array. A majority element in an array 
//A of size N is an element that appears more than N/2 times in the array.


import java.util.Arrays;

public class MajorityElement {
	public static void main(String[] args) {
	 int a[] = {15}; // 1 2 3 3 3
	 int n=a.length;
	 Arrays.sort(a);
	 int count =1;
	 int ans=-1;
	 for(int i=1; i<n; i++) {
		 if(a[i]==a[i-1]) {
			 count ++;
//			 temp=a[i];
		 }
		 else {
			 count =1;
		 }
		 if(count>n/2) {
			 ans = a[i];
		 }
	 }
	 if(n==1) {
		 ans = a[0];
	 }
	 System.out.println(ans);
	 
	}
	
}







