package codes;

public class ContainerWithMostWaterArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,8,6,2};
		int max = 0;
		int count = 0;
		int i = 0;
		int j= a.length-1;
		while(i<j) {
			int min = Math.min(a[i], a[j]);
			int mult = j-i;
			count = min*mult;
			if(count>max) {
				max = count;
			}
			if(a[i]<a[j]) {
				i++;
			}else {
				j--;
			}
		}
		System.out.println(max);
	}

}
