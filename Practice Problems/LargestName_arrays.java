package testClass;

public class LargestName_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"zama","rohan","gurpreet"};
		int max= arr[0].length();
		int index=0;
	
		for(int i=1; i<arr.length; i++) {
			if(arr[i].length()>max) {
				max=arr[i].length();
				index=i;
			}
		}
		System.out.println(arr[index]);
	}

}
