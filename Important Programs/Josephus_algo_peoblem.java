package codes;
// in josephus n number of friends play a game of death and the one who is alive at the end wins the game

public class Josephus_algo_peoblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(jos(8,2));
		
	}

	static int jos(int n, int k) {
		if (n==1) {
			return 1;
		}
		return (jos(n-1,k) +k -1)%n +1;
	}
	
}
