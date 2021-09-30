package codes;
//STOCK BUY AND SELL (only one time)
// Time Complexity = O(n)
//Space Complexity = O(1)
public class StockBuySell_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,2,6,1,7};
		int minSoFar=arr[0], maxProfit=0, profit;
		for(int i=0; i<arr.length; i++) {
			minSoFar = Math.min(minSoFar, arr[i]);
			profit = arr[i]-minSoFar;
			maxProfit = Math.max(maxProfit, profit);
		}
		System.out.println(maxProfit);
	}

}
