package codes;

import java.util.Scanner;

public class reverserString {
	public static void main(String[] args) {
		Scanner sc =new  Scanner(System.in);
		String s = "hello world";
		String ans = "";
		int i = s.length()-1;
		while(i>=0) {
		   if(i<0) break;
		   
		   while(i>=0 && s.charAt(i)==' ') i--;
			   int j =i;
			   
			   while(i>=0 && s.charAt(i)!=' ') i--;
		        if(ans.isEmpty()) {
			        ans =  ans+  s.substring(i+1,j+1);        
		       }else {
			       ans = ans + " " + s.substring(i+1,j+1);    
		     }	
	}
		System.out.println(ans);
		
	}

}
