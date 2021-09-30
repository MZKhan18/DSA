package codes;
// "abc", "bca", "cab" these all are anagram
// "abb", "aab", "ab" these all are not anagram
// Time complexity = O(n^2)
// Space Compexity =O(n)


public class AnagramOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= "cat";
		String b= "act";

		boolean isAnagram = false;
		boolean visited[] = new boolean[a.length()];
		if(a.length()==b.length()) {
			for(int i=0; i<a.length(); i++) {
				char c= a.charAt(i);
				for(int j=0; j<b.length(); j++) {
					if(b.charAt(j)==c && !visited[j]) {
						isAnagram = true;
						visited[j]=true;
						break;
					}
				}
				if(!isAnagram) {
					break;
				}
			}
			
		} 
		if(isAnagram) {
			System.out.println("It is Anagram");
		}else {
			System.out.println("It is Not Anagram");
		}
		
	}

}
