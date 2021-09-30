package codes;

public class OneNonRepeatingElment_otherRepeatingThrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =new int[] {2,2,2,1,1,5,1,1,2};
		int k=4;
		int count[] =new int[32];
		
		for(int i=0; i<32; i++)
			for(int j=0; j<arr.length; j++)
				if((arr[j]&(1<<i))!=0)
					count[i] +=1;
		
		int res=0;
		for(int i=0; i<32; i++)
			res += (count[i]%k)*(1<<i);
		System.out.println("Non repeating term = "+res);
	
	}

}
