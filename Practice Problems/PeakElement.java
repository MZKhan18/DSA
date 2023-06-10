package testClass;

public class PeakElement {
	public static void main(String[] args) {
		 int a[] = {3}; //1 2 4 5 6 7 8 10
		 int n=a.length;
		 int ans=0;
		for(int i=0;i<n; i++) {
			if (n==1) ans =0;
			else if(i==0 && a[i]>a[i+1]) ans = i;
			else if(i==n-1 && a[n-1]>a[n-2]) ans =i;
			else if(i!=0 && i!=n-1 && a[i]>a[i-1] && a[i]>a[i+1] ) ans =i;
		}
		System.out.println(ans);
		 
		}
}
