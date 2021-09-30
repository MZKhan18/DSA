package testClass;

import java.util.ArrayList;


public class WhieghtedUniformString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abccddde";
		s= s.toLowerCase();
		ArrayList<Integer> queries = new ArrayList<>();
		ArrayList<Integer> result = new ArrayList<>();
		int count =0;
		queries.add(6);
		queries.add(1);
		queries.add(3);
		queries.add(12);
		queries.add(5);
		queries.add(9);
		queries.add(10);
		
		for(int i=0; i<s.length();i++) {
			int c =s.charAt(i);
			int v = c-96;
			count +=v;
			result.add(count);
			if(i==0 || s.charAt(i)!=s.charAt(i-1)) {
				count =0;
			}
		}
		
		for(int i=0; i<result.size(); i++) {
			System.out.println(result.get(i));
		}
	}

}
