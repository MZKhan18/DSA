package testClass;
//Given a number N, find if it is Disarium or not. A number is called Disarium if sum of its digits powered with their respective 
//positions is equal to the number itself. Output 1 if it's Disarium, and 0 if not.
public class DisariumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=89;
		int n1=n;
		int n2=n;
		int digit=0;
		while(n1>0) {
			n1 = n1/10;
			digit++;
		}
		int sum =0;
		while(n2>0) {
			int val = n2%10;
			sum += Math.pow(val, digit);
			digit--;
			n2=n2/10;
		}
		if(sum==n) System.out.println(1);
		else System.out.println(0);
    

	}

}
