package testClass;

import java.util.ArrayList;
import java.util.List;

public class Gemstone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arr = new ArrayList<>(); 
		arr.add("abcdde");
		arr.add("baccd");
		arr.add("eeabg");
		int count =0,result=0;
       String alpha = "abcdefghijklmnopqrstuvwxyz";
       for(int i=0; i<alpha.length(); i++) {
    	   String c = ""+ alpha.charAt(i);
    	   for(int j=0; j<arr.size(); j++) {
    		   String t = arr.get(j);
    		   if(t.contains(c)) {
    			   count++;
    		   }
    	   }
    	   if(count == arr.size()) {
    		   result++;
    	   }
    	   count =0;
       }
		System.out.println(result);
	}

}
