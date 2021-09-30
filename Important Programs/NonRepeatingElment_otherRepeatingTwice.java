package codes;

public class NonRepeatingElment_otherRepeatingTwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =new int[] {5,1,3,5,1};
		int result = 0;
		for(int i=0; i<arr.length; i++)
			result = (result^arr[i]);
		
		System.out.println("Non repeating term = "+result);
	}

}
