package codes;

public class LongestPalindromeSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated thod stub
		String s = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenliviningplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenliviningplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenliviningplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenliviningplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenliviningplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivin"; 

		int count = 0; 
		int max = 0;
		String temp ="";
		String ans = "";
		for(int j=0; j<s.length(); j++) {
			for(int i=j; i<s.length(); i++) {
				 temp = temp + s.charAt(i);
				 if(temp.charAt(0)==temp.charAt(temp.length()-1)) {
				 if(isPallindrome(temp)) {
					 count = temp.length();
					 if(count>max) {
						 max = count;
						 ans = temp;
					 }
				 }
				 }
			}
			temp = "";
		}
		System.out.println(ans);
	}
	public static boolean isPallindrome(String s) {
		if(s.length()==1) return true;
		String t = "";
		for(int i=s.length()-1; i>=0; i--) {
			t = t + s.charAt(i);
		}
		if(t.equals(s)) {
			return true;
		}else {
			return false;
		}
		
	}

}
