package codes;

public class removeVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello world";
		String ans = "";
		int n = s.length();
		for(int i=0; i<n ; i++) {
			if(s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i' && s.charAt(i)!='o' && s.charAt(i)!='u') {
				ans = ans + s.charAt(i);
			}
		}
		System.out.println(ans);
	}

}
