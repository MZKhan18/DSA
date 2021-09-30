package testClass;

public class SwapBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=47;
		int p1=1;
		int p2=5;
		int n=3;
		int a1[]=new int[n];
		int a2[]=new int[n];
		int j=0,k=0;
		//collecting bits of first part p1 in array
		for(int i=p1; i<p1+n; i++) {
			if( (x&(1<<i))!=0 ) {
				a1[j]=1;
			}else {
				a1[j]=0;
			}
			j++;
		}
		//collecting bits of second part p2 in array
		for(int i=p2; i<p2+n; i++) {
			if( (x&(1<<i))!=0 ) {
				a2[k]=1;
			}else {
				a2[k]=0;
			}
			k++;
		}
		j=0;
		k=0;
		
		//inserting the bits of p1 at place of p2
		for(int i=p1; i<p1+n; i++) {
			if(a2[j]==1) {
				x = (x|(1<<i));
			}else {
				x = (x&(~(1<<i)));
			}
					
			j++;
		}
		
		for(int i=p2; i<p2+n; i++) {
			if(a1[k]==1) {
				x = (x|(1<<i));
			}else {
				x = (x&(~(1<<i)));
			}
			k++;
		}
		System.out.println("Final answer = "+x);
		
		
	}

}
