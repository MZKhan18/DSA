package testClass;

public class WaveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[]= {2,4,3,6,1,2,1};
			int temp;
	        for(int i=0; i<arr.length-1; i++){
	            if(i%2==0){
	                if(arr[i]<arr[i+1]){
	                    temp=arr[i];
	                    arr[i]=arr[i+1];
	                    arr[i+1]=temp;
	                }
	            }
	            else{
	                if(arr[i]>arr[i+1]){
	                    temp=arr[i];
	                    arr[i]=arr[i+1];
	                    arr[i+1]=temp;
	                }
	                
	            }
	        }
	        for(int i=0; i<arr.length;i++) {
	        	System.out.print(arr[i]+"  ");
	        }
	}

}
