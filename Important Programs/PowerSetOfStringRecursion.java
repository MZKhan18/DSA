package codes;

public class PowerSetOfStringRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		powerSet("abc",0,"");

	}
	static void powerSet(String s, int i, String curr) {
		if(i==s.length()) {
			System.out.println(curr);
			return;
		}
		powerSet(s, i+1, curr + s.charAt(i));
		powerSet(s, i+1 , curr);
	}
	
}
