package testClass;
//In this challenge, you will determine whether a string is funny or not. To determine whether a string is funny, create a copy of the 
//string in reverse e.g. . Iterating through each string, compare the absolute difference in the ascii values of the characters at 
//positions 0 and 1, 1 and 2 and so on to the end. If the list of absolute differences is the same for both strings, they are funny.

public class FunnyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "ab";
		String rev ="";
		int count =0;
		int sArray[]= new int[s.length()];
		for(int i=s.length()-1;i>=0;i--) {
			rev += s.charAt(i);
		}

		int revArray[]= new int[rev.length()];
		for(int i=0; i<s.length(); i++) {
			sArray[i] = s.charAt(i);
			revArray[i]=rev.charAt(i);
		}
		for(int i=0; i<s.length()-1;i++) {
			sArray[i]=Math.max(sArray[i]-sArray[i+1], sArray[i+1]-sArray[i]);
			revArray[i]=Math.max(revArray[i]-revArray[i+1], revArray[i+1]-revArray[i]);
			if(sArray[i]==revArray[i]) {
				count ++;
			}
		}
		
		if(count == s.length()-1) {
			System.out.println("funny");
		}else {
			System.out.println("not funny");
		}
	}

}
