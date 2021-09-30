package codes;
// reverse a string word by word and also remove the extra spaces
// EXAMPLE : "the sky is blue"
// OUTPUT  : "blue is sky the"
public class ReverseStingWordByWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "The sky is blue pink, is sky the";
		String ans = "";
		int i=s.length()-1;
	
		while(i>=0) {
		   if(i<0) break;
		   
		   while(i>=0 && s.charAt(i)==' ') i--;
			   int j =i;
			   
			   while(i>=0 && s.charAt(i)!=' ') i--;
		        if(ans.isEmpty()) {
			        ans =  ans+  s.substring(i+1,j+1);          //  ans.concat(s.substring(i+1,j+1));
		       }else {
			       ans = ans + " " + s.substring(i+1,j+1);                    //ans.concat(" "+s.substring(i+1,j+1));
		     }	
	}
		System.out.println(ans);
	}

}
