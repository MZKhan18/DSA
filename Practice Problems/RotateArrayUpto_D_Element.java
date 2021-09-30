package testClass;

import java.util.ArrayList;
import java.util.List;

public class RotateArrayUpto_D_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a= new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		int d=4;
		for(int i=0;i<d;i++) {
			a = rev(a);
		}
		for(int i=0; i<a.size();i++) {
			System.out.print(a.get(i)+" ");
		}
		
	}
static List<Integer> rev(List<Integer> arr) {
  int temp = arr.get(0);
  int n = arr.size();
  for(int i=0; i<n-1; i++) {
	  arr.set(i, arr.get(i+1));
  }
  arr.set(n-1, temp);
  return arr;
	
}

}
