package testClass;

public class BigNumberSum {
	public static void main(String[] args) {
    int a[]= {1000000001, 1000000002, 1000000003 ,1000000004,1000000005};
    int n=a.length;
    long sum=0;
    for(int i=0; i<n;i++) {
    	sum += a[i];
    }
    System.out.println(sum);
	}
}
