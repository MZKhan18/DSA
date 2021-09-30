package codes;

import java.util.ArrayList;
import java.util.Collections;

public class PermutaionOfStringRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arr = new ArrayList<String>();
		permute("irj",0,2, arr);
		Collections.sort(arr);
		for(int i =0; i<arr.size(); i++)
			System.out.print(arr.get(i)+" ");
		
	}

	static void permute(String s, int  l, int r, ArrayList<String> arr) {
		if(l==r) {
			arr.add(s);
			return ;
		}
		for(int i=l; i<=r; i++) {
			s = swap(s, l,i);
			permute(s,l+1,r, arr);
			s = swap(s, l,i);
		}
	}
	
	static String swap(String s, int a, int b) {
		String s2="";
		char[] str = s.toCharArray();
		char temp1 = str[a];
		char temp2 = str[b];
		str[b]= temp1;
		str[a]= temp2;
		
		for(char c : str) {
			s2 +=c;
		}	
		
		return s2;
	}
}
