class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
       long ans=0;
      
      long sum=0;
       int distinct=0;
       int freq[]=new int[100008];
       for(int i=0;i<k;i++){
        sum+=nums[i];
        if(freq[nums[i]]==0){
            distinct++;
        }
        freq[nums[i]]++;
       }
       if(distinct==k){
        ans=sum;
       }
       for(int i=k;i<nums.length;i++){
        sum-=nums[i-k];
        freq[nums[i-k]]--;
        if(freq[nums[i-k]]==0){
            distinct--;
        }
        sum+=nums[i];
        if(freq[nums[i]]==0){
            distinct++;
        }
        freq[nums[i]]++;
        if(distinct==k){
           ans=Math.max(ans,sum);
        }
       }
       return ans;
    }
}
