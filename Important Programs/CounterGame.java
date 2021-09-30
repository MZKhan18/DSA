package codes;

public class CounterGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n= 643654556l;
		if((find(n-1)&1)!=0) {
			System.out.println("Louise");
		}else {
			System.out.println("Richard");
		}
		
	    
	}
static int find(long n) {
	int count =0;
    while(n!=0) {
    	n &= (n-1) ;
        count ++ ;
    }
return count;
}
	
}
