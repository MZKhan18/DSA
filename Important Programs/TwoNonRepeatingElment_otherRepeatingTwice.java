package codes;

public class TwoNonRepeatingElment_otherRepeatingTwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =new int[] {5,1,4,3,5,1};
		int result = 0;
		for(int i=0; i<arr.length; i++)
		{	result = (result^arr[i]);}

		result = (result&-result);
		int n1=0,n2=0;
		
		for(int i=0; i<arr.length; i++) {
			if((arr[i]&result)>0) {
				n1= (n1^arr[i]);
			}else {
				n2=(n2^arr[i]);
			}
		}
		System.out.println("Two (unique) Non repeating terms are "+n1+" and "+n2);
	
	}

}
