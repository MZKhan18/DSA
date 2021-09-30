package codes;
//STOCK BUY AND SELL (no limit)
//Time Complexity = O(n)
//Space Complexity = O(1)

public class StockBuySell_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,2,4,6,8,10};
		int profit=0;
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>arr[i-1]) {
				profit += arr[i]-arr[i-1];
			}
		}
		System.out.println(profit);
	}

}
