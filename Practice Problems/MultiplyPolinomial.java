package testClass;

public class MultiplyPolinomial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Arr1[]= {1, 9, 3, 4, 7};
		int Arr2[]= {4, 0, 2, 5};
		int M = Arr1.length;
		int N = Arr2.length;
		int Arr[]=new int[(M+N)-1];
		
		for(int i=0; i<M ; i++) {
			for(int j=0; j<N; j++) {
				Arr[i+j] += Arr1[i]*Arr2[j];
			}
		}
		for(int i=0; i<Arr.length; i++) {   ///4, 36, 14, 39, 79, 23, 34, 35
			System.out.print(Arr[i]+" ");
		}
	}

}
