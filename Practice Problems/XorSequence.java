package testClass;

import java.util.Scanner;
//Function which gives us the value of A[i] in O(1) time 
//on the basis of the pattern formed
public class XorSequence{
public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
             long l=sc.nextLong();
             long r=sc.nextLong();
             long Xor2 = 0, Xor1 = 0;
             long pos = l;
             //We find the xor for all elements from l to the least multiple of 8 
             //which is greater than l
             while(true){
               if((pos)%8 == 0){
                   break;
               }
               Xor1 ^= func(pos);
               pos++;
             }
             pos = r;
             //Now we find the xor for all elements from r to the highest multiple of 8
             //which is less than r
             while(true){
               if((pos)%8 == 0){
                   Xor2 ^= func(pos);
                   break;
               }
               Xor2 ^= func(pos);
               pos--;
             }
           System.out.println((Xor1^Xor2));
           sc.close();
         
} 
      
public static long func(long i){
  if(i%4==0){
      return i;
  }
  else if((i-1)%4==0){
      return 1;
  }
  else if((i-2)%4==0){
      return i+1;
  }
  else return 0;
}
}
