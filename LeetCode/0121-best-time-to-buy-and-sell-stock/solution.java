class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        if(n<2){
            return 0;
        }
        int dp[]=new int[n+1];
        dp[0]=prices[0];
        dp[1]=Math.max(0,prices[1]-dp[0]);
        int minPrice=prices[0];
        for(int i=2;i<prices.length;i++){
            if(minPrice>prices[i-1]){
                minPrice=prices[i-1];
            }
            dp[i]=Math.max(dp[i-1],prices[i]-minPrice);
        }
        return dp[n-1];
    }
}
