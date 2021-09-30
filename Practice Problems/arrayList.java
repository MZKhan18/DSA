package testClass;
//WEIGHT OF STRING

import java.util.ArrayList;

import java.util.List;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abbcccdddd";
		s= s.toLowerCase();
		List<String> fresult = new ArrayList<>();
		List<Integer> result = new ArrayList<>();
		List<Integer> queries = new ArrayList<>();
		int count =0;
		queries.add(1);
		queries.add(7);
		queries.add(5);
		queries.add(4);
		queries.add(15);
		
		for(int i=0; i<s.length();i++) {
			int c =s.charAt(i);
			int v = c-96;
			count +=v;
			result.add(count);
			if(i==s.length()-1 || s.charAt(i)!=s.charAt(i+1)) {
				count =0;
			}
		}
		boolean found = false;
		for(int i=0; i<result.size(); i++) {
			System.out.print(result.get(i)+" ");
		}
		
		for(int i=0;i<queries.size();i++) {
			for(int j=0; j<result.size(); j++) {
				if(queries.get(i)==result.get(j)) {
					found = true;
					break;
				}
			}
			if(found) {
				fresult.add("YES");
			}else {
				fresult.add("NO");
			}
			found = false;
		}
		for(int i=0; i<fresult.size(); i++) {
			System.out.print(fresult.get(i)+" ");
		}
     
	}

}
