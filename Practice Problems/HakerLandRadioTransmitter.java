package testClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HakerLandRadioTransmitter {
	public static void main(String[] args) {
//		int x[] = {1,2,3,4,5}; 7 2 4 6 5 9 12 11        9 5 4 2 6 15 12
		ArrayList<Integer> x = new ArrayList<>();
		x.add(1);
		x.add(2);
		x.add(3);
		x.add(4);
		x.add(5);
//		x.add(9);
//		x.add(12);
//		x.add(11);
		int k = 1; 
		int loc;
		int j = 0;
		int counter =0;
		int n = x.size();
		Collections.sort(x);
		while(j<n) {
			loc =x.get(j)+k;
			while(j<n && x.get(j)<=loc) {
				j += 1;
			}
			j -= 1;
			counter ++;
			 loc =x.get(j)+k;
			while(j<n && x.get(j)<=loc) {
				j += 1;
			}
		}
		
		
		System.out.println(counter);
		}
	
}



