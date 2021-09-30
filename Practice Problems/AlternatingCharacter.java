package testClass;

public class AlternatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "BABABB";
		int n = s.length();
		int result=0;
		if(!s.contains("A")) {
			result = n-1;
			System.out.println(result);
		}
		if(!s.contains("B")) {
			result = n-1;
			System.out.println(result);
		}
		if(result==0) {
		for(int i=0; i<n-1; i++) {
			char c1= s.charAt(i);
			char c2 =s.charAt(i+1);
			if(c1==c2) {
				result++;
			}
		}
		System.out.println(result);
		}
		
	}

}
