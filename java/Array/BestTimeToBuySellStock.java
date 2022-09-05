package Array;

public class BestTimeToBuySellStock {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println("The maximum profit obtained is: "+getMaxProfit(prices));
    }

    private static int getMaxProfit(int[] prices) {
        int minBuyingPrice = Integer.MAX_VALUE;
        int currentProfit = 0;
        int maxProfit = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minBuyingPrice){
                minBuyingPrice = prices[i];
            }
            currentProfit = prices[i] - minBuyingPrice;
            maxProfit = Math.max(maxProfit,currentProfit);
        }
        return maxProfit;
    }


}
