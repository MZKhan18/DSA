package codes;

import java.util.Arrays;
import java.util.Collections;

public class CountingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr ="hello";
		char seq[] = arr.toCharArray();
        int n = seq.length;
        
        //Declaring output character array that will have sorted letters.
        char output[] = new char[n];
        
        //Creating a count array to store count of individual
        //characters and initialize count array as 0.
        int count[] = new int[256];
        Arrays.fill(count, 0);
        
        //Storing count of each character.
        for (int i=0; i<n; ++i)
            ++count[seq[i]];
            
        //Modifying the count array such that each element at each index 
        //stores the sum of previous counts. 
        //The modified count array indicates the position of each object in 
        //the output sequence.
        for (int i=1; i<=255; ++i)
            count[i] += count[i-1];
            
        //Building the output character array.
        for (int i = 0; i<n; ++i)
        {
            output[count[seq[i]]-1] = seq[i];
            --count[seq[i]];
        }
        
        //Copying the output array to arr, so that arr now
        //contains sorted characters.
        for (int i = 0; i<n; ++i)
            seq[i] = output[i];
            
        //returning the sorted string.     
      System.out.println(seq);
	}

}
