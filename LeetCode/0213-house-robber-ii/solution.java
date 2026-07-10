class Solution {
    public int rob(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        int dp[]=new int[nums.length-1];
       int max1=findSolution(0,nums.length-2,nums,dp);
       Arrays.fill(dp,0);
       int max2=findSolution(1,nums.length-1,nums,dp);
        return Math.max(max1,max2);
   
    }
    public static int findSolution(int index,int skip,int[]nums,int dp[]){
        dp[0]=nums[index];
        dp[1]=Math.max(dp[0],nums[index+1]);
        for(int i=2;i<dp.length;i++){
            dp[i]=Math.max(dp[i-1],nums[index+i]+dp[i-2]);
        }
        return dp[dp.length-1];
    }
}
