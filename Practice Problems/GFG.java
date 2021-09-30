package testClass;

import java.util.Scanner;

public class GFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int  T= sc.nextInt();
		while(T>0){
			 System.out.println("Enter size of array");
		     int N = sc.nextInt();
		     System.out.println("enter value of d");
             int D= sc.nextInt();
             System.out.println("enter elements of array");
             int arr[]= new int[N];
             for(int i=0;i<N; i++){
                    arr[i]=sc.nextInt();
                 }
  
             for(int i=0;i<D;i++) {
                    arr = rev(arr);
                }
             System.out.println("rotated array");
             for(int i=0; i<N; i++){
                    System.out.print(arr[i]+" ");
             	}
             T--;
		    }
		
		    sc.close();
		}

static int[] rev(int arr[]) {
		  int temp = arr[0];
		  int n = arr.length;
		  for(int i=0; i<n-1; i++) {
		      arr[i]=arr[i+1];
	     	  }
		  arr[n-1]=temp;
		  return arr;    
	}	

}
