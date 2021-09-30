package testClass;

import java.util.ArrayList;
import java.util.List;

public class Matching_Queries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings= new ArrayList<>();
		strings.add("ab");
		strings.add("abd");
		strings.add("ab");
		strings.add("bc");
		
		List<String> query= new ArrayList<>();
		query.add("ab");
		query.add("bc");
		query.add("a");
		
		ArrayList<Integer> res= new ArrayList<>();
		int count =0;
		for(String q: query) {
			for(String s: strings) {
				if(q.equals(s)) {
					count ++;
				}
			}
			res.add(count);
			count=0;
		}
		for(int i=0; i<res.size(); i++) {
			System.out.println(res.get(i));
		}
	}

}
