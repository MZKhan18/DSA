package testClass;


public class DivisibleBy3UsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {40,50,90};
		int n=a.length;
		int name=0;

		for(int i=0; i<n; i++) {
			name = (name + a[i])%3;
		}
        	if(name==0) {
        		System.out.println(1);
        	}
        	else {
        		System.out.println(0);
        	}
        

	}

}
