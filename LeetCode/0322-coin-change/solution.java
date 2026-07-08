class Solution {
    static int inf=1000000;
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int dp[][]=new int[n][amount+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],inf);
        }
        for(int i=0;i<n;i++){
            dp[i][0]=0;
        }
        for(int j=1;j<=amount;j++){
            if(j%coins[0]==0){
            dp[0][j]=(j/coins[0]);
        }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<=amount;j++){
                if(j>=coins[i]){
                dp[i][j]=Math.min(dp[i-1][j],1+dp[i][j-coins[i]]);
            }else{
            dp[i][j]=dp[i-1][j];
        }
            }
        }
        if(dp[n-1][amount]==inf){
            return -1;
        }
        return dp[n-1][amount];
    }
}
