121. Best Time to Buy and Sell Stock

Time Complexity: O(n).
Space Complexity: O(1).

  class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++)
        {
            if(buyPrice<prices[i])
            {
                int Profit = prices[i] - buyPrice;
                maxProfit = Math.max(Profit, maxProfit);
            }
            else
            {
                buyPrice = prices[i];
            }
        }
        return maxProfit; 
    }
}
