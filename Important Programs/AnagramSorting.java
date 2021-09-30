package codes;

import java.util.Arrays;
import java.util.Collections;

public class AnagramSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="abcdef";
		String b ="cdefabmn";
		char[] arr = a.toCharArray();
		Arrays.sort(arr);
		char[] barr =b.toCharArray();
		Arrays.sort(barr);
		boolean anagram=false;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==barr[i]) {
				anagram=true;
				}
			else {
				anagram =false;
				break;
			}
		}
		if(arr.length!=barr.length)
			anagram =false;
		
		System.out.println(anagram);

	}

}
