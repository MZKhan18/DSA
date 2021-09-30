package codes;

import java.util.Arrays;

public class Triplet_twoPointerAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,0,-1,2,3,2,-2};
		int n= arr.length;
		Arrays.sort(arr);
		
		for(int i=0; i<n-2;i++) {
			if(twoSum(arr, -arr[i], i+1)) {
				System.out.println("true");
			}
		}

	}

	public static boolean twoSum(int a[],int x, int i) {
		int j = a.length-1;
		while(i<j) {
			if(a[i]+a[j]>x) {
				j--;
			}else if(a[i]+a[j]<x) {
				i++;
			}else {
				return true;
			}
		}
		
		return false;
	}
	
}
