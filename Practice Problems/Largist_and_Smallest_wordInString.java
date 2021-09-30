package testClass;

public class Largist_and_Smallest_wordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "my name    is md zama";
		String separator = " ";
		String arr[]= s.split(separator);
		int max= arr[0].length();
		int index=0;
		for(int i=1; i<arr.length; i++) {
			if(arr[i].length()>max) {
				max=arr[i].length();
				index=i;
			}
		}

		System.out.println("Largest word :"+arr[index]);
		
		
		int min= arr[0].length();
		 index=0;

		for(int i=1; i<arr.length; i++) {
			
			if(arr[i].length()<min && arr[i].length()!=0) {
				max=arr[i].length();
				index=i;
			}
			
		}
		System.out.println("Smallest word :"+arr[index]);

	}

}
