package codes;

public class PalindromeStringRecurison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("abcba",0,4));
		
	}

	static boolean isPalindrome(String s, int l, int r) {
		if(l>=r)
			return true;
		if(s.charAt(l)!=s.charAt(r))
			return false;
		return isPalindrome(s,l+1,r-1);
	}
}
