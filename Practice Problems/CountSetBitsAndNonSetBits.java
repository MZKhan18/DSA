package testClass;

public class CountSetBitsAndNonSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n= 10000000000000041L;
		long n1=n;
		int count=0,count1=0;
		while(n>0)
		{
		long s=n%2;
		if(s==0)
		{
		count+=1;
		}
		if(s==1)
		{
		count1+=1;
		}
		n=n/2;
		}
		System.out.println(count1+" "+count);
	System.out.println("number = "+Integer.toBinaryString((int) n1));
	System.out.println("No of set bits = "+count);
	System.out.println("No of non set bits = "+count1);

	}

}
