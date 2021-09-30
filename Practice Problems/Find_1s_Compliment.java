package testClass;

public class Find_1s_Compliment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N =16;
		String S="0110110011111110";
		StringBuilder ans = new StringBuilder(S);

		for(int i=N-1; i>=0;i--) {
			if(ans.charAt(i)=='0') {
				ans.setCharAt(i, '1');
			}else if(ans.charAt(i)=='1'){
				ans.setCharAt(i, '0');
			}
			
			
		}
		String res = ans.toString();
			
		System.out.println(S);
		System.out.println(ans);
		System.out.println(res);

	}

}
