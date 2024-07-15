package codes;

import java.util.HashSet;

public class LongestSubarrayWithNoRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bbb";
		int max = 0;
		int count = 0;
		int ival = 0;
		HashSet<String> hs = new HashSet();
		for(int i=0; i<s.length();i++) {
			String ts =""+ s.charAt(i);
			if(hs.contains(ts)) {
				ival ++;
				count = 0;
				hs.clear();
				i = ival;
				
			}
			ts =""+ s.charAt(i);
			hs.add(ts);
			count++;
			if(count>max) {
				max = count;
			}
		}
		System.out.println(max);
	}

}
