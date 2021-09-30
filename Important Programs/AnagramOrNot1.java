package codes;
//Time complexity = O(n)
//Space Complexity =O(1)
public class AnagramOrNot1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= "cat";
		String b= "act";
		int a1[]=new int[256];
//		int b1[]=new int[256];
		for(char c:a.toCharArray()) {
			int index = (int)c;
			if(index!=32) {
			a1[index]++;
			}
		}
		for(char c:b.toCharArray()) {
			int index = (int)c;
			if(index!=32) {
				a1[index]--;
				}
		}
		boolean isAnagram=true;
		for(int i=0; i<256; i++) {
			if(a1[i]!=0) {
				isAnagram = false;
			}
		}
		if(isAnagram) {
			System.out.println("It is Anagram");
		}else {
			System.out.println("It is Not Anagram");
		}	
	}

}
