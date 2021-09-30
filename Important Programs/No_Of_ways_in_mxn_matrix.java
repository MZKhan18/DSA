package codes;

public class No_Of_ways_in_mxn_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count(8,8));

	}
	
	static int count(int n, int m) {
		if(n==1 || m==1)
			return 1;
		return count(n-1, m) + count(n,m-1);
	}

}
