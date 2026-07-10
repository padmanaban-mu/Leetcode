class Solution {
    public int deleteAndEarn(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        int freq[]=new int[max+1];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        
        for(int i=0;i<=max;i++){
           freq[i]=freq[i]*i;
        }
     
        int dp[]=new int[freq.length];
        dp[0]=freq[0];
        dp[1]=Math.max(freq[0],freq[1]);
        for(int i=2;i<dp.length;i++){
            dp[i]=Math.max(dp[i-1],freq[i]+dp[i-2]);
        }
        return dp[freq.length-1];
    }
}
