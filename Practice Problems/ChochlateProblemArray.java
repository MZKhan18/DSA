package testClass;



public class ChochlateProblemArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5, 3, 1, 6, 9};
		int n=arr.length;
		  int min=arr[0];
	        for(int i=0;i<n; i++){
	            if(arr[i]<min){
	                min=arr[i];
	            }
	        }
	        System.out.println(min);
	    
	}



}
