package InterviewCoding;

public class Wipro {
    
    /*you are given an array prices where prices[i] is the price of a given stock on the ith day.
 
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 
 
Example 1:
 
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:
 
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.

 
Constraints:
 
1 <= prices.length <= 105
0 <= prices[i] <= 104
has context menu

 */
    public static void main(String[] args) {
        int[] arr1 = {7,1,5,3,6,4};
        int[] arr2 = {7,6,4,3,1};

        int profit1 = maxProfit(arr1);
        int profit11 = CalProfit(arr1);
        System.out.println("Maximum profit for arr1: " + profit1);
        System.out.println("Calculated profit for arr1: " + profit11);

        int profit2 = maxProfit(arr2);
        int profit22 = CalProfit(arr2);
        System.out.println("Maximum profit for arr2: " + profit2);
        System.out.println("Calculated profit for arr2: " + profit22);

    }
    
    // Time Complexity: O(n), where n is the number of days (length of the prices array). We traverse the array once.
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Update the minimum price
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // Update the maximum profit
            }
        }
        
        return maxProfit;
    }


    //Time O(n^2) and Space O(1)
    public static int CalProfit(int[] Prices)
   {
      int maxProfit = 0;
      for(int i=0; i<Prices.length;i++)
      {
         for(int j=i+1; j<Prices.length;j++)
         {
           maxProfit = Math.max(maxProfit, Prices[j] - Prices[i]);

         }
      }
      return maxProfit;
   }
    
}
